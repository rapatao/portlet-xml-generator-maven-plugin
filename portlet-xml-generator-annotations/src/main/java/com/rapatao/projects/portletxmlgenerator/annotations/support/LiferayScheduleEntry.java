package com.rapatao.projects.portletxmlgenerator.annotations.support;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 962880 on 23/02/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface LiferayScheduleEntry {

    Class<?> eventListner();

    LiferayTrigger trigger();

}
