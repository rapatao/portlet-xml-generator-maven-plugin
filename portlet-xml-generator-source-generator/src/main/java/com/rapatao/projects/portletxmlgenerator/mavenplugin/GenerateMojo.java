package com.rapatao.projects.portletxmlgenerator.mavenplugin;

import com.google.common.collect.Lists;
import com.rapatao.projects.portletxmlgenerator.annotations.PortletDefinition;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.AbstractGenerator;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.DependencyResolutionRequiredException;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.reflections.Reflections;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ConfigurationBuilder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by 962880 on 19/02/2016.
 */
@Mojo(name = "generate", defaultPhase = LifecyclePhase.PREPARE_PACKAGE)
public class GenerateMojo extends AbstractMojo {

    @Parameter(defaultValue = "${project}", readonly = true)
    private MavenProject project;

    private List<URL> getDependencyClasspath() throws MojoExecutionException {
        final List<URL> classpathList = new ArrayList<URL>();
        for (final Artifact dependency : project.getDependencyArtifacts()) {
            if (!"test".equals(dependency.getScope())) {
                final File file = dependency.getFile();
                try {
                    classpathList.add(file.toURI().toURL());
                } catch (MalformedURLException e) {
                    throw new MojoExecutionException(file
                            + " is an invalid classpath element", e);
                }
            }
        }
        return classpathList;
    }

    public List<URL> getProjectClassPath()
            throws MojoExecutionException {
        List<String> compiledClasspathElements = null;
        try {
            compiledClasspathElements = project.getCompileClasspathElements();
        } catch (DependencyResolutionRequiredException e) {
            new MojoExecutionException("Dependency resolution failed", e);
        }

        final List<URL> classpathList = new ArrayList<URL>();
        for (String element : compiledClasspathElements) {
            try {
                final File elementFile = new File(element);
                classpathList.add(elementFile.toURI().toURL());
            } catch (MalformedURLException e) {
                throw new MojoExecutionException(element + " is an invalid classpath element", e);
            }
        }
        return classpathList;
    }

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        try {
            List<URL> artifactsAsURLs = Lists.newArrayList();
            artifactsAsURLs.addAll(getProjectClassPath());
            artifactsAsURLs.addAll(getDependencyClasspath());

            URLClassLoader urlClassLoader = URLClassLoader.newInstance(
                    artifactsAsURLs.toArray(new URL[artifactsAsURLs.size()]), this.getClass().getClassLoader());
            Thread.currentThread().setContextClassLoader(urlClassLoader);

            ConfigurationBuilder configurationBuilder = new ConfigurationBuilder().setUrls(artifactsAsURLs);
            final Reflections typeReflections = new Reflections(configurationBuilder.setScanners(new TypeAnnotationsScanner()));
            final Set<Class<?>> typesAnnotatedWithClassVerbalization = typeReflections.getTypesAnnotatedWith(PortletDefinition.class);
            final List<Class<?>> annotatedTypes = Lists.newArrayList(typesAnnotatedWithClassVerbalization);

            AbstractGenerator.generate(project, annotatedTypes);
        } catch (Exception e) {
            throw new MojoFailureException(e.getMessage(), e);
        }

    }

}
