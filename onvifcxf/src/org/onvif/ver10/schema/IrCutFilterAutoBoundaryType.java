
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IrCutFilterAutoBoundaryType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="IrCutFilterAutoBoundaryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Common"/>
 *     &lt;enumeration value="ToOn"/>
 *     &lt;enumeration value="ToOff"/>
 *     &lt;enumeration value="Extended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IrCutFilterAutoBoundaryType")
@XmlEnum
public enum IrCutFilterAutoBoundaryType {

    @XmlEnumValue("Common")
    COMMON("Common"),
    @XmlEnumValue("ToOn")
    TO_ON("ToOn"),
    @XmlEnumValue("ToOff")
    TO_OFF("ToOff"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    IrCutFilterAutoBoundaryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IrCutFilterAutoBoundaryType fromValue(String v) {
        for (IrCutFilterAutoBoundaryType c: IrCutFilterAutoBoundaryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
