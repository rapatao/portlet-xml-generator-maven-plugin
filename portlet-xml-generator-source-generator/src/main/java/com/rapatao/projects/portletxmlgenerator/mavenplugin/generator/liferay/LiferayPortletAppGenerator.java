package com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.liferay;

import com.rapatao.projects.portletxmlgenerator.annotations.PortletDefinition;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.portletapp.LiferayPortletApp;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.portletapp.ObjectFactory;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.portletapp.Portlet;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.AbstractGenerator;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.Generator;
import org.apache.maven.project.MavenProject;

import java.util.List;

/**
 * Created by 962880 on 22/02/2016.
 */
public class LiferayPortletAppGenerator implements Generator {
    @Override
    public void generate(MavenProject project, List<Class<?>> classes) throws Exception {
        LiferayPortletApp liferayPortletApp = new ObjectFactory().createLiferayPortletApp();
        for (Class<?> clazz : classes) {
            PortletDefinition annotation = clazz.getAnnotation(PortletDefinition.class);
            Portlet portlet = new ObjectFactory().createPortlet();
            portlet.setPortletName(annotation.name());
            liferayPortletApp.getPortlet().add(portlet);
        }
        AbstractGenerator.writeFile(project, "liferay-portlet.xml", LiferayPortletApp.class, liferayPortletApp);
    }
}
