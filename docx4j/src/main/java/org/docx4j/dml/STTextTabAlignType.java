
package org.docx4j.dml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_TextTabAlignType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_TextTabAlignType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="l"/>
 *     &lt;enumeration value="ctr"/>
 *     &lt;enumeration value="r"/>
 *     &lt;enumeration value="dec"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_TextTabAlignType")
@XmlEnum
public enum STTextTabAlignType {


    /**
     * Text Tab Alignment Enum (
     * 						Left)
     * 
     */
    @XmlEnumValue("l")
    L("l"),

    /**
     * Text Tab Alignment Enum ( Center
     * 						)
     * 
     */
    @XmlEnumValue("ctr")
    CTR("ctr"),

    /**
     * Text Tab Alignment Enum ( Right
     * 						)
     * 
     */
    @XmlEnumValue("r")
    R("r"),

    /**
     * Text Tab Alignment Enum ( Decimal
     * 						)
     * 
     */
    @XmlEnumValue("dec")
    DEC("dec");
    private final String value;

    STTextTabAlignType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTextTabAlignType fromValue(String v) {
        for (STTextTabAlignType c: STTextTabAlignType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
