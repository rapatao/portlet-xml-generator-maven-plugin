//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.22 at 02:18:31 PM BRT 
//


package com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.portlet.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 			The description element is used to provide text describing the 
 * 			parent element. The description element should include any 
 * 			information that the portlet application war file producer wants
 * 			to provide to the consumer of the portlet application war file 
 * 			(i.e., to the Deployer). Typically, the tools used by the 
 * 			portlet application war file consumer will display the 
 * 			description when processing the parent element that contains the 
 * 			description. It has an optional attribute xml:lang to indicate 
 * 			which language is used in the description according to 
 * 			RFC 1766 (http://www.ietf.org/rfc/rfc1766.txt). The default
 * 			value of this attribute is English(�en�).
 * 			Used in: init-param, portlet, portlet-app, security-role
 * 			
 * 
 * <p>Java class for descriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="descriptionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd>string">
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "descriptionType", propOrder = {
    "value"
})
public class DescriptionType {

    @XmlValue
    protected String value;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

    /**
     * 
     * 			This is a special string datatype that is defined by JavaEE 
     * 			as a base type for defining collapsed strings. When 
     * 			schemas require trailing/leading space elimination as 
     * 			well as collapsing the existing whitespace, this base 
     * 			type may be used.
     * 			
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
