
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FocusOptions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FocusOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutoFocusModes" type="{http://www.onvif.org/ver10/schema}AutoFocusMode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DefaultSpeed" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         &lt;element name="NearLimit" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         &lt;element name="FarLimit" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FocusOptions", propOrder = {
    "autoFocusModes",
    "defaultSpeed",
    "nearLimit",
    "farLimit"
})
public class FocusOptions {

    @XmlElement(name = "AutoFocusModes")
    protected List<AutoFocusMode> autoFocusModes;
    @XmlElement(name = "DefaultSpeed", required = true)
    protected FloatRange defaultSpeed;
    @XmlElement(name = "NearLimit", required = true)
    protected FloatRange nearLimit;
    @XmlElement(name = "FarLimit", required = true)
    protected FloatRange farLimit;

    /**
     * Gets the value of the autoFocusModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoFocusModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoFocusModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoFocusMode }
     * 
     * 
     */
    public List<AutoFocusMode> getAutoFocusModes() {
        if (autoFocusModes == null) {
            autoFocusModes = new ArrayList<AutoFocusMode>();
        }
        return this.autoFocusModes;
    }

    /**
     * 获取defaultSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getDefaultSpeed() {
        return defaultSpeed;
    }

    /**
     * 设置defaultSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setDefaultSpeed(FloatRange value) {
        this.defaultSpeed = value;
    }

    /**
     * 获取nearLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getNearLimit() {
        return nearLimit;
    }

    /**
     * 设置nearLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setNearLimit(FloatRange value) {
        this.nearLimit = value;
    }

    /**
     * 获取farLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getFarLimit() {
        return farLimit;
    }

    /**
     * 设置farLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setFarLimit(FloatRange value) {
        this.farLimit = value;
    }

}
