
package com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.portletapp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "portlet",
    "roleMapper",
    "customUserAttribute"
})
@XmlRootElement(name = "liferay-portlet-app")
public class LiferayPortletApp {

    protected List<Portlet> portlet;
    @XmlElement(name = "role-mapper")
    protected List<RoleMapper> roleMapper;
    @XmlElement(name = "custom-user-attribute")
    protected List<CustomUserAttribute> customUserAttribute;

    /**
     * Gets the value of the portlet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portlet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortlet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Portlet }
     * 
     * 
     */
    public List<Portlet> getPortlet() {
        if (portlet == null) {
            portlet = new ArrayList<Portlet>();
        }
        return this.portlet;
    }

    /**
     * Gets the value of the roleMapper property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleMapper property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleMapper().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleMapper }
     * 
     * 
     */
    public List<RoleMapper> getRoleMapper() {
        if (roleMapper == null) {
            roleMapper = new ArrayList<RoleMapper>();
        }
        return this.roleMapper;
    }

    /**
     * Gets the value of the customUserAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customUserAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomUserAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomUserAttribute }
     * 
     * 
     */
    public List<CustomUserAttribute> getCustomUserAttribute() {
        if (customUserAttribute == null) {
            customUserAttribute = new ArrayList<CustomUserAttribute>();
        }
        return this.customUserAttribute;
    }

}
