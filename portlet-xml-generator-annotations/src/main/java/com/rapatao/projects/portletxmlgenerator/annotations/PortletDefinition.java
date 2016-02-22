package com.rapatao.projects.portletxmlgenerator.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 962880 on 19/02/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PortletDefinition {

    String name();

    Class<?> portletClass();

    PortletInitParam[] initParam() default {};

    PortletSupport[] supports() default {};

    PortletInfo info();

}
