package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for IrCutFilterAutoBoundaryType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
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
	COMMON("Common"), @XmlEnumValue("ToOn")
	TO_ON("ToOn"), @XmlEnumValue("ToOff")
	TO_OFF("ToOff"), @XmlEnumValue("Extended")
	EXTENDED("Extended");
	private final String value;

	IrCutFilterAutoBoundaryType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static IrCutFilterAutoBoundaryType fromValue(String v) {
		for (IrCutFilterAutoBoundaryType c : IrCutFilterAutoBoundaryType
				.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
