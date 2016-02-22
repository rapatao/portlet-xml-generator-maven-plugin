package com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.liferay;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.rapatao.projects.portletxmlgenerator.annotations.support.LiferayPortlet;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.Generator;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.liferay.LiferayDisplayGenerator;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.liferay.LiferayPortletAppGenerator;
import org.apache.maven.project.MavenProject;

import java.util.List;

/**
 * Created by 962880 on 22/02/2016.
 */
public class LiferayGenerator implements Generator {

    @Override
    public void generate(MavenProject project, List<Class<?>> classes) throws Exception {
        List<Class<?>> liferayPortletClasses = Lists.newArrayList(Collections2.filter(classes, new Predicate<Class<?>>() {
            @Override
            public boolean apply(Class<?> input) {
                return input.getAnnotation(LiferayPortlet.class) != null;
            }
        }).iterator());

        new LiferayPortletAppGenerator().generate(project, liferayPortletClasses);
        new LiferayDisplayGenerator().generate(project, liferayPortletClasses);
    }

}
