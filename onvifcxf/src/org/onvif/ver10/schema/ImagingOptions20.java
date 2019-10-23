
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>ImagingOptions20 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ImagingOptions20">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BacklightCompensation" type="{http://www.onvif.org/ver10/schema}BacklightCompensationOptions20" minOccurs="0"/>
 *         &lt;element name="Brightness" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         &lt;element name="ColorSaturation" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         &lt;element name="Contrast" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         &lt;element name="Exposure" type="{http://www.onvif.org/ver10/schema}ExposureOptions20" minOccurs="0"/>
 *         &lt;element name="Focus" type="{http://www.onvif.org/ver10/schema}FocusOptions20" minOccurs="0"/>
 *         &lt;element name="IrCutFilterModes" type="{http://www.onvif.org/ver10/schema}IrCutFilterMode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Sharpness" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *         &lt;element name="WideDynamicRange" type="{http://www.onvif.org/ver10/schema}WideDynamicRangeOptions20" minOccurs="0"/>
 *         &lt;element name="WhiteBalance" type="{http://www.onvif.org/ver10/schema}WhiteBalanceOptions20" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingOptions20Extension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingOptions20", propOrder = {
    "backlightCompensation",
    "brightness",
    "colorSaturation",
    "contrast",
    "exposure",
    "focus",
    "irCutFilterModes",
    "sharpness",
    "wideDynamicRange",
    "whiteBalance",
    "extension"
})
public class ImagingOptions20 {

    @XmlElement(name = "BacklightCompensation")
    protected BacklightCompensationOptions20 backlightCompensation;
    @XmlElement(name = "Brightness")
    protected FloatRange brightness;
    @XmlElement(name = "ColorSaturation")
    protected FloatRange colorSaturation;
    @XmlElement(name = "Contrast")
    protected FloatRange contrast;
    @XmlElement(name = "Exposure")
    protected ExposureOptions20 exposure;
    @XmlElement(name = "Focus")
    protected FocusOptions20 focus;
    @XmlElement(name = "IrCutFilterModes")
    protected List<IrCutFilterMode> irCutFilterModes;
    @XmlElement(name = "Sharpness")
    protected FloatRange sharpness;
    @XmlElement(name = "WideDynamicRange")
    protected WideDynamicRangeOptions20 wideDynamicRange;
    @XmlElement(name = "WhiteBalance")
    protected WhiteBalanceOptions20 whiteBalance;
    @XmlElement(name = "Extension")
    protected ImagingOptions20Extension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取backlightCompensation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BacklightCompensationOptions20 }
     *     
     */
    public BacklightCompensationOptions20 getBacklightCompensation() {
        return backlightCompensation;
    }

    /**
     * 设置backlightCompensation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BacklightCompensationOptions20 }
     *     
     */
    public void setBacklightCompensation(BacklightCompensationOptions20 value) {
        this.backlightCompensation = value;
    }

    /**
     * 获取brightness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getBrightness() {
        return brightness;
    }

    /**
     * 设置brightness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setBrightness(FloatRange value) {
        this.brightness = value;
    }

    /**
     * 获取colorSaturation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getColorSaturation() {
        return colorSaturation;
    }

    /**
     * 设置colorSaturation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setColorSaturation(FloatRange value) {
        this.colorSaturation = value;
    }

    /**
     * 获取contrast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getContrast() {
        return contrast;
    }

    /**
     * 设置contrast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setContrast(FloatRange value) {
        this.contrast = value;
    }

    /**
     * 获取exposure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExposureOptions20 }
     *     
     */
    public ExposureOptions20 getExposure() {
        return exposure;
    }

    /**
     * 设置exposure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureOptions20 }
     *     
     */
    public void setExposure(ExposureOptions20 value) {
        this.exposure = value;
    }

    /**
     * 获取focus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FocusOptions20 }
     *     
     */
    public FocusOptions20 getFocus() {
        return focus;
    }

    /**
     * 设置focus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FocusOptions20 }
     *     
     */
    public void setFocus(FocusOptions20 value) {
        this.focus = value;
    }

    /**
     * Gets the value of the irCutFilterModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the irCutFilterModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIrCutFilterModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IrCutFilterMode }
     * 
     * 
     */
    public List<IrCutFilterMode> getIrCutFilterModes() {
        if (irCutFilterModes == null) {
            irCutFilterModes = new ArrayList<IrCutFilterMode>();
        }
        return this.irCutFilterModes;
    }

    /**
     * 获取sharpness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getSharpness() {
        return sharpness;
    }

    /**
     * 设置sharpness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setSharpness(FloatRange value) {
        this.sharpness = value;
    }

    /**
     * 获取wideDynamicRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WideDynamicRangeOptions20 }
     *     
     */
    public WideDynamicRangeOptions20 getWideDynamicRange() {
        return wideDynamicRange;
    }

    /**
     * 设置wideDynamicRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WideDynamicRangeOptions20 }
     *     
     */
    public void setWideDynamicRange(WideDynamicRangeOptions20 value) {
        this.wideDynamicRange = value;
    }

    /**
     * 获取whiteBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WhiteBalanceOptions20 }
     *     
     */
    public WhiteBalanceOptions20 getWhiteBalance() {
        return whiteBalance;
    }

    /**
     * 设置whiteBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteBalanceOptions20 }
     *     
     */
    public void setWhiteBalance(WhiteBalanceOptions20 value) {
        this.whiteBalance = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImagingOptions20Extension }
     *     
     */
    public ImagingOptions20Extension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingOptions20Extension }
     *     
     */
    public void setExtension(ImagingOptions20Extension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
