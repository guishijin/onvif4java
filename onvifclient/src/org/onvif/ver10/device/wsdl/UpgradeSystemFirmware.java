package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.AttachmentData;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Firmware" type="{http://www.onvif.org/ver10/schema}AttachmentData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "firmware" })
@XmlRootElement(name = "UpgradeSystemFirmware")
public class UpgradeSystemFirmware {

	@XmlElement(name = "Firmware", required = true)
	protected AttachmentData firmware;

	/**
	 * Gets the value of the firmware property.
	 * 
	 * @return possible object is {@link AttachmentData }
	 * 
	 */
	public AttachmentData getFirmware() {
		return firmware;
	}

	/**
	 * Sets the value of the firmware property.
	 * 
	 * @param value
	 *            allowed object is {@link AttachmentData }
	 * 
	 */
	public void setFirmware(AttachmentData value) {
		this.firmware = value;
	}

}
