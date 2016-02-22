
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
    "cronOrSimple"
})
@XmlRootElement(name = "trigger")
public class Trigger {

    @XmlElements({
        @XmlElement(name = "cron", required = true, type = Cron.class),
        @XmlElement(name = "simple", required = true, type = Simple.class)
    })
    protected List<Object> cronOrSimple;

    /**
     * Gets the value of the cronOrSimple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cronOrSimple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCronOrSimple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cron }
     * {@link Simple }
     * 
     * 
     */
    public List<Object> getCronOrSimple() {
        if (cronOrSimple == null) {
            cronOrSimple = new ArrayList<Object>();
        }
        return this.cronOrSimple;
    }

}
