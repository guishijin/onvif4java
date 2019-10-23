
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Mpeg4Profile的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Mpeg4Profile">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="ASP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Mpeg4Profile")
@XmlEnum
public enum Mpeg4Profile {

    SP,
    ASP;

    public String value() {
        return name();
    }

    public static Mpeg4Profile fromValue(String v) {
        return valueOf(v);
    }

}
