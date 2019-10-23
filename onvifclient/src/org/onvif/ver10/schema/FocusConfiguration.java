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
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java class for FocusConfiguration complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="FocusConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutoFocusMode" type="{http://www.onvif.org/ver10/schema}AutoFocusMode"/>
 *         &lt;element name="DefaultSpeed" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="NearLimit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="FarLimit" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
@XmlType(name = "FocusConfiguration", propOrder = { "autoFocusMode",
		"defaultSpeed", "nearLimit", "farLimit", "any" })
public class FocusConfiguration {

	@XmlElement(name = "AutoFocusMode", required = true)
	protected AutoFocusMode autoFocusMode;
	@XmlElement(name = "DefaultSpeed")
	protected float defaultSpeed;
	@XmlElement(name = "NearLimit")
	protected float nearLimit;
	@XmlElement(name = "FarLimit")
	protected float farLimit;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the autoFocusMode property.
	 * 
	 * @return possible object is {@link AutoFocusMode }
	 * 
	 */
	public AutoFocusMode getAutoFocusMode() {
		return autoFocusMode;
	}

	/**
	 * Sets the value of the autoFocusMode property.
	 * 
	 * @param value
	 *            allowed object is {@link AutoFocusMode }
	 * 
	 */
	public void setAutoFocusMode(AutoFocusMode value) {
		this.autoFocusMode = value;
	}

	/**
	 * Gets the value of the defaultSpeed property.
	 * 
	 */
	public float getDefaultSpeed() {
		return defaultSpeed;
	}

	/**
	 * Sets the value of the defaultSpeed property.
	 * 
	 */
	public void setDefaultSpeed(float value) {
		this.defaultSpeed = value;
	}

	/**
	 * Gets the value of the nearLimit property.
	 * 
	 */
	public float getNearLimit() {
		return nearLimit;
	}

	/**
	 * Sets the value of the nearLimit property.
	 * 
	 */
	public void setNearLimit(float value) {
		this.nearLimit = value;
	}

	/**
	 * Gets the value of the farLimit property.
	 * 
	 */
	public float getFarLimit() {
		return farLimit;
	}

	/**
	 * Sets the value of the farLimit property.
	 * 
	 */
	public void setFarLimit(float value) {
		this.farLimit = value;
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
