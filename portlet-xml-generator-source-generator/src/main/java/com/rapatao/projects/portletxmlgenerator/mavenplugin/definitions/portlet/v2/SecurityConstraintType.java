//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.22 at 02:18:31 PM BRT 
//


package com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.portlet.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			The security-constraintType is used to associate
 * 			intended security constraints with one or more portlets.
 * 			Used in: portlet-app
 * 			
 * 
 * <p>Java class for security-constraintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="security-constraintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="display-name" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}display-nameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="portlet-collection" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}portlet-collectionType"/>
 *         &lt;element name="user-data-constraint" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}user-data-constraintType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "security-constraintType", propOrder = {
    "displayName",
    "portletCollection",
    "userDataConstraint"
})
public class SecurityConstraintType {

    @XmlElement(name = "display-name")
    protected List<DisplayNameType> displayName;
    @XmlElement(name = "portlet-collection", required = true)
    protected PortletCollectionType portletCollection;
    @XmlElement(name = "user-data-constraint", required = true)
    protected UserDataConstraintType userDataConstraint;
    @XmlAttribute
    protected String id;

    /**
     * Gets the value of the displayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayNameType }
     * 
     * 
     */
    public List<DisplayNameType> getDisplayName() {
        if (displayName == null) {
            displayName = new ArrayList<DisplayNameType>();
        }
        return this.displayName;
    }

    /**
     * Gets the value of the portletCollection property.
     * 
     * @return
     *     possible object is
     *     {@link PortletCollectionType }
     *     
     */
    public PortletCollectionType getPortletCollection() {
        return portletCollection;
    }

    /**
     * Sets the value of the portletCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortletCollectionType }
     *     
     */
    public void setPortletCollection(PortletCollectionType value) {
        this.portletCollection = value;
    }

    /**
     * Gets the value of the userDataConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link UserDataConstraintType }
     *     
     */
    public UserDataConstraintType getUserDataConstraint() {
        return userDataConstraint;
    }

    /**
     * Sets the value of the userDataConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDataConstraintType }
     *     
     */
    public void setUserDataConstraint(UserDataConstraintType value) {
        this.userDataConstraint = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
