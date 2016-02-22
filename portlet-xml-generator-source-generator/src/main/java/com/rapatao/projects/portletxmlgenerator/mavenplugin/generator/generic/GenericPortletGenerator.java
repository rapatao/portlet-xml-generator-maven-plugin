package com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.generic;

import com.google.common.collect.Lists;
import com.rapatao.projects.portletxmlgenerator.annotations.PortletDefinition;
import com.rapatao.projects.portletxmlgenerator.annotations.PortletInfo;
import com.rapatao.projects.portletxmlgenerator.annotations.PortletInitParam;
import com.rapatao.projects.portletxmlgenerator.annotations.PortletMode;
import com.rapatao.projects.portletxmlgenerator.annotations.PortletSupport;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.portlet.v2.InitParamType;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.portlet.v2.MimeTypeType;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.portlet.v2.NameType;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.portlet.v2.ObjectFactory;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.portlet.v2.PortletAppType;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.portlet.v2.PortletInfoType;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.portlet.v2.PortletModeType;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.portlet.v2.PortletNameType;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.portlet.v2.PortletType;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.portlet.v2.SupportsType;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.portlet.v2.TitleType;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.portlet.v2.ValueType;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.AbstractGenerator;
import com.rapatao.projects.portletxmlgenerator.mavenplugin.generator.Generator;
import org.apache.maven.project.MavenProject;

import java.util.List;

/**
 * Created by 962880 on 19/02/2016.
 */
public class GenericPortletGenerator implements Generator {

    @Override
    public void generate(MavenProject project, List<Class<?>> classes) throws Exception {
        PortletAppType app = new ObjectFactory().createPortletAppType();
        for (Class<?> clazz : classes) {
            PortletDefinition annotation = clazz.getAnnotation(PortletDefinition.class);
            PortletType portletType = new ObjectFactory().createPortletType();
            portletType.setPortletName(createPortletName(annotation));
            portletType.setPortletClass(annotation.portletClass().getName());
            portletType.getInitParam().addAll(createPortletInitParams(annotation, portletType));
            portletType.getSupports().addAll(createSupportsTypes(annotation));
            portletType.setPortletInfo(createPortletInfoType(annotation));
            app.getPortlet().add(portletType);
        }
        AbstractGenerator.writeFile(project, "portlet.xml", PortletAppType.class, new ObjectFactory().createPortletApp(app));
    }

    private PortletInfoType createPortletInfoType(PortletDefinition annotation) {
        PortletInfo portletInfo = annotation.info();
        PortletInfoType portletInfoType = new ObjectFactory().createPortletInfoType();
        TitleType titleType = new ObjectFactory().createTitleType();
        titleType.setValue(portletInfo.title());
        portletInfoType.setTitle(titleType);
        return portletInfoType;
    }

    private List<SupportsType> createSupportsTypes(PortletDefinition annotation) {
        List<SupportsType> supportsTypes = Lists.newArrayList();
        for (PortletSupport support : annotation.supports()) {
            SupportsType supportsType = new ObjectFactory().createSupportsType();
            MimeTypeType mimeTypeType = new ObjectFactory().createMimeTypeType();
            mimeTypeType.setValue(support.mimeType());
            supportsType.setMimeType(mimeTypeType);
            supportsType.getPortletMode().addAll(createPortletModeTypes(support));
            supportsTypes.add(supportsType);
        }
        return supportsTypes;
    }

    private List<PortletModeType> createPortletModeTypes(PortletSupport support) {
        List<PortletModeType> portletModeTypes = Lists.newArrayList();
        for (PortletMode portletMode : support.modes()) {
            PortletModeType portletModeType = new ObjectFactory().createPortletModeType();
            String value;
            switch (portletMode) {
                case EDIT:
                    value = javax.portlet.PortletMode.EDIT.toString();
                    break;
                case HELP:
                    value = javax.portlet.PortletMode.HELP.toString();
                    break;
                default:
                    value = javax.portlet.PortletMode.VIEW.toString();
                    break;
            }
            portletModeType.setValue(value);
            portletModeTypes.add(portletModeType);
        }
        return portletModeTypes;
    }

    private List<InitParamType> createPortletInitParams(PortletDefinition annotation, PortletType portletType) {
        List<InitParamType> initParamTypes = Lists.newArrayList();
        for (PortletInitParam portletInitParam : annotation.initParam()) {
            InitParamType initParamType = new ObjectFactory().createInitParamType();
            NameType nameType = new ObjectFactory().createNameType();
            nameType.setValue(portletInitParam.name());
            initParamType.setName(nameType);
            ValueType valueType = new ObjectFactory().createValueType();
            valueType.setValue(portletInitParam.value());
            initParamType.setValue(valueType);
            initParamTypes.add(initParamType);
        }
        return initParamTypes;
    }

    private PortletNameType createPortletName(PortletDefinition annotation) {
        PortletNameType portletNameType = new ObjectFactory().createPortletNameType();
        portletNameType.setValue(annotation.name());
        return portletNameType;
    }


}
