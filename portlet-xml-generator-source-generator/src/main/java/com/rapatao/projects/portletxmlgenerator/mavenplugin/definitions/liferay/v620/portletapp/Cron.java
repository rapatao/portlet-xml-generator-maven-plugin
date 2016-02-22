
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
    "propertyKeyOrCronTriggerValue"
})
@XmlRootElement(name = "cron")
public class Cron {

    @XmlElements({
        @XmlElement(name = "property-key", required = true, type = PropertyKey.class),
        @XmlElement(name = "cron-trigger-value", required = true, type = CronTriggerValue.class)
    })
    protected List<Object> propertyKeyOrCronTriggerValue;

    /**
     * Gets the value of the propertyKeyOrCronTriggerValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyKeyOrCronTriggerValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyKeyOrCronTriggerValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyKey }
     * {@link CronTriggerValue }
     * 
     * 
     */
    public List<Object> getPropertyKeyOrCronTriggerValue() {
        if (propertyKeyOrCronTriggerValue == null) {
            propertyKeyOrCronTriggerValue = new ArrayList<Object>();
        }
        return this.propertyKeyOrCronTriggerValue;
    }

}
