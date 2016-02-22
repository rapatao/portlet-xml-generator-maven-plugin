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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Declaration of the filter mappings in this portlet
 * 			application is done by using filter-mappingType.
 * 			The container uses the filter-mapping
 * 			declarations to decide which filters to apply to a request,
 * 			and in what order. To determine which filters to
 * 			apply it matches filter-mapping declarations on the
 * 			portlet-name and the lifecyle phase defined in the
 * 			filter element. The order in which filters are invoked 
 * 			is the order in which filter-mapping declarations 
 * 			that match appear in the list of filter-mapping elements.
 * 			Used in: portlet-app
 * 			
 * 
 * <p>Java class for filter-mappingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filter-mappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter-name" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}filter-nameType"/>
 *         &lt;element name="portlet-name" type="{http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd}portlet-nameType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filter-mappingType", propOrder = {
    "filterName",
    "portletName"
})
public class FilterMappingType {

    @XmlElement(name = "filter-name", required = true)
    protected String filterName;
    @XmlElement(name = "portlet-name", required = true)
    protected List<PortletNameType> portletName;

    /**
     * Gets the value of the filterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * Sets the value of the filterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterName(String value) {
        this.filterName = value;
    }

    /**
     * Gets the value of the portletName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portletName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortletName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortletNameType }
     * 
     * 
     */
    public List<PortletNameType> getPortletName() {
        if (portletName == null) {
            portletName = new ArrayList<PortletNameType>();
        }
        return this.portletName;
    }

}