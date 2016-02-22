
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
    "name",
    "customClass"
})
@XmlRootElement(name = "custom-user-attribute")
public class CustomUserAttribute {

    @XmlElement(required = true)
    protected List<Name> name;
    @XmlElement(name = "custom-class", required = true)
    protected String customClass;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getName() {
        if (name == null) {
            name = new ArrayList<Name>();
        }
        return this.name;
    }

    /**
     * Gets the value of the customClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomClass() {
        return customClass;
    }

    /**
     * Sets the value of the customClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomClass(String value) {
        this.customClass = value;
    }

}
