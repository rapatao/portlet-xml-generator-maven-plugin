package com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.liferay;

import com.google.common.collect.Maps;
import com.rapatao.projects.portletxmlgenerator.annotations.PortletDefinition;
import com.rapatao.projects.portletxmlgenerator.annotations.support.LiferayPortlet;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.display.Category;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.display.Display;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.display.ObjectFactory;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.display.Portlet;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.AbstractGenerator;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.Generator;
import org.apache.maven.project.MavenProject;

import java.util.List;
import java.util.Map;

/**
 * Created by 962880 on 22/02/2016.
 */
public class LiferayDisplayGenerator implements Generator {

    @Override
    public void generate(MavenProject project, List<Class<?>> classes) throws Exception {
        Display display = new ObjectFactory().createDisplay();

        Map<String, Category> categoryMap = Maps.newHashMap();

        for (Class<?> clazz : classes) {
            PortletDefinition portletDefinition = clazz.getAnnotation(PortletDefinition.class);
            LiferayPortlet liferayPortlet = clazz.getAnnotation(LiferayPortlet.class);

            Category category = categoryMap.get(liferayPortlet.groupName());
            if (category == null) {
                category = new ObjectFactory().createCategory();
                category.setName(liferayPortlet.groupName());
                categoryMap.put(liferayPortlet.groupName(), category);
            }
            Portlet portlet = new ObjectFactory().createPortlet();
            portlet.setId(portletDefinition.name());
            category.getPortlet().add(portlet);
        }

        display.getCategory().addAll(categoryMap.values());

        AbstractGenerator.writeFile(project, "liferay-display.xml", Display.class, display);
    }

}
