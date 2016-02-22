
package com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.portletapp;

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
    "roleName",
    "roleLink"
})
@XmlRootElement(name = "role-mapper")
public class RoleMapper {

    @XmlElement(name = "role-name", required = true)
    protected String roleName;
    @XmlElement(name = "role-link", required = true)
    protected String roleLink;

    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the roleLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleLink() {
        return roleLink;
    }

    /**
     * Sets the value of the roleLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleLink(String value) {
        this.roleLink = value;
    }

}
