
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
    "schedulerDescription",
    "schedulerEventListenerClass",
    "trigger"
})
@XmlRootElement(name = "scheduler-entry")
public class SchedulerEntry {

    @XmlElement(name = "scheduler-description")
    protected String schedulerDescription;
    @XmlElement(name = "scheduler-event-listener-class", required = true)
    protected String schedulerEventListenerClass;
    @XmlElement(required = true)
    protected Trigger trigger;

    /**
     * Gets the value of the schedulerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedulerDescription() {
        return schedulerDescription;
    }

    /**
     * Sets the value of the schedulerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedulerDescription(String value) {
        this.schedulerDescription = value;
    }

    /**
     * Gets the value of the schedulerEventListenerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedulerEventListenerClass() {
        return schedulerEventListenerClass;
    }

    /**
     * Sets the value of the schedulerEventListenerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedulerEventListenerClass(String value) {
        this.schedulerEventListenerClass = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link Trigger }
     *     
     */
    public Trigger getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trigger }
     *     
     */
    public void setTrigger(Trigger value) {
        this.trigger = value;
    }

}
