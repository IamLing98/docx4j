
package org.docx4j.dml;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_Point3D complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Point3D">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="x" use="required" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_Coordinate" />
 *       &lt;attribute name="y" use="required" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_Coordinate" />
 *       &lt;attribute name="z" use="required" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_Coordinate" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Point3D")
public class CTPoint3D
    implements Child
{

    @XmlAttribute(required = true)
    protected long x;
    @XmlAttribute(required = true)
    protected long y;
    @XmlAttribute(required = true)
    protected long z;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the x property.
     * 
     */
    public long getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(long value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public long getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(long value) {
        this.y = value;
    }

    /**
     * Gets the value of the z property.
     * 
     */
    public long getZ() {
        return z;
    }

    /**
     * Sets the value of the z property.
     * 
     */
    public void setZ(long value) {
        this.z = value;
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
