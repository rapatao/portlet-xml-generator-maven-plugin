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
 * 			Supports indicates the portlet modes a 
 * 			portlet supports for a specific content type. All portlets must 
 * 			support the view mode. 
 * 			Used in: portlet
 * 			
 * 
 * <p>Java class for supportsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supportsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mime-type" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}mime-typeType"/>
 *         &lt;element name="portlet-mode" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}portlet-modeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="window-state" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}window-stateType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "supportsType", propOrder = {
    "mimeType",
    "portletMode",
    "windowState"
})
public class SupportsType {

    @XmlElement(name = "mime-type", required = true)
    protected MimeTypeType mimeType;
    @XmlElement(name = "portlet-mode")
    protected List<PortletModeType> portletMode;
    @XmlElement(name = "window-state")
    protected List<WindowStateType> windowState;
    @XmlAttribute
    protected String id;

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link MimeTypeType }
     *     
     */
    public MimeTypeType getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeTypeType }
     *     
     */
    public void setMimeType(MimeTypeType value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the portletMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portletMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortletMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortletModeType }
     * 
     * 
     */
    public List<PortletModeType> getPortletMode() {
        if (portletMode == null) {
            portletMode = new ArrayList<PortletModeType>();
        }
        return this.portletMode;
    }

    /**
     * Gets the value of the windowState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windowState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindowState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WindowStateType }
     * 
     * 
     */
    public List<WindowStateType> getWindowState() {
        if (windowState == null) {
            windowState = new ArrayList<WindowStateType>();
        }
        return this.windowState;
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
