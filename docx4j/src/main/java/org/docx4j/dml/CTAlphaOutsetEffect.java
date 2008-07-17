
package org.docx4j.dml;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_AlphaOutsetEffect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_AlphaOutsetEffect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="rad" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_Coordinate" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_AlphaOutsetEffect")
public class CTAlphaOutsetEffect implements Child
{

    @XmlAttribute
    protected Long rad;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the rad property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getRad() {
        if (rad == null) {
            return  0L;
        } else {
            return rad;
        }
    }

    /**
     * Sets the value of the rad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRad(Long value) {
        this.rad = value;
    }

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

}
