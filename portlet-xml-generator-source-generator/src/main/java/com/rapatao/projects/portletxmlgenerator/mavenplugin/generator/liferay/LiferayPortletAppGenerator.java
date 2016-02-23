package com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.liferay;

import com.rapatao.projects.portletxmlgenerator.annotations.PortletDefinition;
import com.rapatao.projects.portletxmlgenerator.annotations.support.LiferayCron;
import com.rapatao.projects.portletxmlgenerator.annotations.support.LiferayPortlet;
import com.rapatao.projects.portletxmlgenerator.annotations.support.LiferayScheduleEntry;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.portletapp.Cron;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.portletapp.LiferayPortletApp;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.portletapp.ObjectFactory;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.portletapp.Portlet;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.portletapp.SchedulerEntry;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.portletapp.Trigger;
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
        ObjectFactory objectFactory = new ObjectFactory();

        LiferayPortletApp liferayPortletApp = objectFactory.createLiferayPortletApp();
        for (Class<?> clazz : classes) {
            PortletDefinition portletDefinition = clazz.getAnnotation(PortletDefinition.class);
            LiferayPortlet liferayPortletDefinition = clazz.getAnnotation(LiferayPortlet.class);

            Portlet portlet = createPortlet(objectFactory, portletDefinition);
            for (LiferayScheduleEntry liferayScheduleEntry : liferayPortletDefinition.scheduleEntries()) {
                portlet.getSchedulerEntry().add(createSchedulerEntry(objectFactory, liferayScheduleEntry));
            }
            liferayPortletApp.getPortlet().add(portlet);
        }
        AbstractGenerator.writeFile(project, "liferay-portlet.xml", LiferayPortletApp.class, liferayPortletApp);
    }

    private Portlet createPortlet(ObjectFactory objectFactory, PortletDefinition portletDefinition) {
        Portlet portlet = objectFactory.createPortlet();
        portlet.setPortletName(portletDefinition.name());
        return portlet;
    }

    private SchedulerEntry createSchedulerEntry(ObjectFactory objectFactory, LiferayScheduleEntry liferayScheduleEntry) {
        SchedulerEntry schedulerEntry = objectFactory.createSchedulerEntry();
        schedulerEntry.setSchedulerEventListenerClass(liferayScheduleEntry.eventListner().getName());
        schedulerEntry.setTrigger(createTrigger(objectFactory, liferayScheduleEntry));
        return schedulerEntry;
    }

    private Trigger createTrigger(ObjectFactory objectFactory, LiferayScheduleEntry liferayScheduleEntry) {
        Trigger trigger = objectFactory.createTrigger();
        for (LiferayCron cronDefinition : liferayScheduleEntry.trigger().crons()) {
            Cron cron = objectFactory.createCron();
            for (String triggerDefinition : cronDefinition.value()) {
                cron.getPropertyKeyOrCronTriggerValue().add(triggerDefinition);
            }
            trigger.getCronOrSimple().add(cron);
        }
        return trigger;
    }
}
