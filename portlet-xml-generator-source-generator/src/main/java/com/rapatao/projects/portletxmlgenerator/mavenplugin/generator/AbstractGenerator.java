package com.rapatao.projects.portletxmlgenerator.mavenplugin.generator;

import com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.generic.GenericPortletGenerator;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.liferay.LiferayGenerator;
import org.apache.commons.io.FileUtils;
import org.apache.maven.project.MavenProject;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by 962880 on 22/02/2016.
 */
public final class AbstractGenerator {

    private static final Generator[] generators = {new GenericPortletGenerator(), new LiferayGenerator()};

    public static void generate(MavenProject project, List<Class<?>> classes) throws Exception {
        for (Generator generator : generators) {
            generator.generate(project, classes);
        }
    }

    public static void writeFile(MavenProject project, String filename, Class<?> clazz, Object element) throws IOException, JAXBException {
        String folderToGenerate = project.getBuild().getDirectory() + File.separator +
                project.getBuild().getFinalName() + File.separator + "WEB-INF";
        FileUtils.forceMkdir(new File(folderToGenerate));
        String finalFile = folderToGenerate + File.separator + filename;
        FileWriter writer = new FileWriter(finalFile);
        JAXBContext context = JAXBContext.newInstance(clazz);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(element, writer);
        writer.flush();
        writer.close();
    }

}
