
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RelayMode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RelayMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Monostable"/>
 *     &lt;enumeration value="Bistable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelayMode")
@XmlEnum
public enum RelayMode {

    @XmlEnumValue("Monostable")
    MONOSTABLE("Monostable"),
    @XmlEnumValue("Bistable")
    BISTABLE("Bistable");
    private final String value;

    RelayMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelayMode fromValue(String v) {
        for (RelayMode c: RelayMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
