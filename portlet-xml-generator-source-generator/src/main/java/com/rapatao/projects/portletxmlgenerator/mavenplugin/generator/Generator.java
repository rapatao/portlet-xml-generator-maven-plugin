package com.rapatao.projects.portletxmlgenerator.mavenplugin.generator;

import org.apache.maven.project.MavenProject;

import java.util.List;

/**
 * Created by 962880 on 19/02/2016.
 */
public interface Generator {

    void generate(MavenProject project, List<Class<?>> classes) throws Exception;

}
