
package com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.portletapp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "propertyKeyOrSimpleTriggerValue",
    "timeUnit"
})
@XmlRootElement(name = "simple")
public class Simple {

    @XmlElements({
        @XmlElement(name = "property-key", required = true, type = PropertyKey.class),
        @XmlElement(name = "simple-trigger-value", required = true, type = SimpleTriggerValue.class)
    })
    protected List<Object> propertyKeyOrSimpleTriggerValue;
    @XmlElement(name = "time-unit", required = true)
    protected String timeUnit;

    /**
     * Gets the value of the propertyKeyOrSimpleTriggerValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyKeyOrSimpleTriggerValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyKeyOrSimpleTriggerValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyKey }
     * {@link SimpleTriggerValue }
     * 
     * 
     */
    public List<Object> getPropertyKeyOrSimpleTriggerValue() {
        if (propertyKeyOrSimpleTriggerValue == null) {
            propertyKeyOrSimpleTriggerValue = new ArrayList<Object>();
        }
        return this.propertyKeyOrSimpleTriggerValue;
    }

    /**
     * Gets the value of the timeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeUnit() {
        return timeUnit;
    }

    /**
     * Sets the value of the timeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeUnit(String value) {
        this.timeUnit = value;
    }

}
