package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java class for Dot11Status complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Dot11Status">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSID" type="{http://www.onvif.org/ver10/schema}Dot11SSIDType"/>
 *         &lt;element name="BSSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PairCipher" type="{http://www.onvif.org/ver10/schema}Dot11Cipher" minOccurs="0"/>
 *         &lt;element name="GroupCipher" type="{http://www.onvif.org/ver10/schema}Dot11Cipher" minOccurs="0"/>
 *         &lt;element name="SignalStrength" type="{http://www.onvif.org/ver10/schema}Dot11SignalStrength" minOccurs="0"/>
 *         &lt;element name="ActiveConfigAlias" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dot11Status", propOrder = { "ssid", "bssid", "pairCipher",
		"groupCipher", "signalStrength", "activeConfigAlias", "any" })
public class Dot11Status {

	@XmlElement(name = "SSID", required = true, type = String.class)
	@XmlJavaTypeAdapter(HexBinaryAdapter.class)
	protected byte[] ssid;
	@XmlElement(name = "BSSID")
	protected String bssid;
	@XmlElement(name = "PairCipher")
	protected Dot11Cipher pairCipher;
	@XmlElement(name = "GroupCipher")
	protected Dot11Cipher groupCipher;
	@XmlElement(name = "SignalStrength")
	protected Dot11SignalStrength signalStrength;
	@XmlElement(name = "ActiveConfigAlias", required = true)
	protected String activeConfigAlias;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the ssid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public byte[] getSSID() {
		return ssid;
	}

	/**
	 * Sets the value of the ssid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSSID(byte[] value) {
		this.ssid = ((byte[]) value);
	}

	/**
	 * Gets the value of the bssid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBSSID() {
		return bssid;
	}

	/**
	 * Sets the value of the bssid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBSSID(String value) {
		this.bssid = value;
	}

	/**
	 * Gets the value of the pairCipher property.
	 * 
	 * @return possible object is {@link Dot11Cipher }
	 * 
	 */
	public Dot11Cipher getPairCipher() {
		return pairCipher;
	}

	/**
	 * Sets the value of the pairCipher property.
	 * 
	 * @param value
	 *            allowed object is {@link Dot11Cipher }
	 * 
	 */
	public void setPairCipher(Dot11Cipher value) {
		this.pairCipher = value;
	}

	/**
	 * Gets the value of the groupCipher property.
	 * 
	 * @return possible object is {@link Dot11Cipher }
	 * 
	 */
	public Dot11Cipher getGroupCipher() {
		return groupCipher;
	}

	/**
	 * Sets the value of the groupCipher property.
	 * 
	 * @param value
	 *            allowed object is {@link Dot11Cipher }
	 * 
	 */
	public void setGroupCipher(Dot11Cipher value) {
		this.groupCipher = value;
	}

	/**
	 * Gets the value of the signalStrength property.
	 * 
	 * @return possible object is {@link Dot11SignalStrength }
	 * 
	 */
	public Dot11SignalStrength getSignalStrength() {
		return signalStrength;
	}

	/**
	 * Sets the value of the signalStrength property.
	 * 
	 * @param value
	 *            allowed object is {@link Dot11SignalStrength }
	 * 
	 */
	public void setSignalStrength(Dot11SignalStrength value) {
		this.signalStrength = value;
	}

	/**
	 * Gets the value of the activeConfigAlias property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getActiveConfigAlias() {
		return activeConfigAlias;
	}

	/**
	 * Sets the value of the activeConfigAlias property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setActiveConfigAlias(String value) {
		this.activeConfigAlias = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link java.lang.Object } {@link Element }
	 * 
	 * 
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<java.lang.Object>();
		}
		return this.any;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed
	 * property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string
	 * value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by
	 * updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}