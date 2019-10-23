
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * Type describing the ImagingSettings of a VideoSource. The supported options and ranges can be obtained via the GetOptions command.
 * 
 * <p>ImagingSettings20 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ImagingSettings20">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BacklightCompensation" type="{http://www.onvif.org/ver10/schema}BacklightCompensation20" minOccurs="0"/>
 *         &lt;element name="Brightness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ColorSaturation" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Contrast" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Exposure" type="{http://www.onvif.org/ver10/schema}Exposure20" minOccurs="0"/>
 *         &lt;element name="Focus" type="{http://www.onvif.org/ver10/schema}FocusConfiguration20" minOccurs="0"/>
 *         &lt;element name="IrCutFilter" type="{http://www.onvif.org/ver10/schema}IrCutFilterMode" minOccurs="0"/>
 *         &lt;element name="Sharpness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="WideDynamicRange" type="{http://www.onvif.org/ver10/schema}WideDynamicRange20" minOccurs="0"/>
 *         &lt;element name="WhiteBalance" type="{http://www.onvif.org/ver10/schema}WhiteBalance20" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingSettingsExtension20" minOccurs="0"/>
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
@XmlType(name = "ImagingSettings20", propOrder = {
    "backlightCompensation",
    "brightness",
    "colorSaturation",
    "contrast",
    "exposure",
    "focus",
    "irCutFilter",
    "sharpness",
    "wideDynamicRange",
    "whiteBalance",
    "extension"
})
public class ImagingSettings20 {

    @XmlElement(name = "BacklightCompensation")
    protected BacklightCompensation20 backlightCompensation;
    @XmlElement(name = "Brightness")
    protected Float brightness;
    @XmlElement(name = "ColorSaturation")
    protected Float colorSaturation;
    @XmlElement(name = "Contrast")
    protected Float contrast;
    @XmlElement(name = "Exposure")
    protected Exposure20 exposure;
    @XmlElement(name = "Focus")
    protected FocusConfiguration20 focus;
    @XmlElement(name = "IrCutFilter")
    protected IrCutFilterMode irCutFilter;
    @XmlElement(name = "Sharpness")
    protected Float sharpness;
    @XmlElement(name = "WideDynamicRange")
    protected WideDynamicRange20 wideDynamicRange;
    @XmlElement(name = "WhiteBalance")
    protected WhiteBalance20 whiteBalance;
    @XmlElement(name = "Extension")
    protected ImagingSettingsExtension20 extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取backlightCompensation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BacklightCompensation20 }
     *     
     */
    public BacklightCompensation20 getBacklightCompensation() {
        return backlightCompensation;
    }

    /**
     * 设置backlightCompensation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BacklightCompensation20 }
     *     
     */
    public void setBacklightCompensation(BacklightCompensation20 value) {
        this.backlightCompensation = value;
    }

    /**
     * 获取brightness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBrightness() {
        return brightness;
    }

    /**
     * 设置brightness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBrightness(Float value) {
        this.brightness = value;
    }

    /**
     * 获取colorSaturation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getColorSaturation() {
        return colorSaturation;
    }

    /**
     * 设置colorSaturation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setColorSaturation(Float value) {
        this.colorSaturation = value;
    }

    /**
     * 获取contrast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getContrast() {
        return contrast;
    }

    /**
     * 设置contrast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setContrast(Float value) {
        this.contrast = value;
    }

    /**
     * 获取exposure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Exposure20 }
     *     
     */
    public Exposure20 getExposure() {
        return exposure;
    }

    /**
     * 设置exposure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Exposure20 }
     *     
     */
    public void setExposure(Exposure20 value) {
        this.exposure = value;
    }

    /**
     * 获取focus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FocusConfiguration20 }
     *     
     */
    public FocusConfiguration20 getFocus() {
        return focus;
    }

    /**
     * 设置focus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FocusConfiguration20 }
     *     
     */
    public void setFocus(FocusConfiguration20 value) {
        this.focus = value;
    }

    /**
     * 获取irCutFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IrCutFilterMode }
     *     
     */
    public IrCutFilterMode getIrCutFilter() {
        return irCutFilter;
    }

    /**
     * 设置irCutFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IrCutFilterMode }
     *     
     */
    public void setIrCutFilter(IrCutFilterMode value) {
        this.irCutFilter = value;
    }

    /**
     * 获取sharpness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSharpness() {
        return sharpness;
    }

    /**
     * 设置sharpness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSharpness(Float value) {
        this.sharpness = value;
    }

    /**
     * 获取wideDynamicRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WideDynamicRange20 }
     *     
     */
    public WideDynamicRange20 getWideDynamicRange() {
        return wideDynamicRange;
    }

    /**
     * 设置wideDynamicRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WideDynamicRange20 }
     *     
     */
    public void setWideDynamicRange(WideDynamicRange20 value) {
        this.wideDynamicRange = value;
    }

    /**
     * 获取whiteBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WhiteBalance20 }
     *     
     */
    public WhiteBalance20 getWhiteBalance() {
        return whiteBalance;
    }

    /**
     * 设置whiteBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteBalance20 }
     *     
     */
    public void setWhiteBalance(WhiteBalance20 value) {
        this.whiteBalance = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImagingSettingsExtension20 }
     *     
     */
    public ImagingSettingsExtension20 getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingSettingsExtension20 }
     *     
     */
    public void setExtension(ImagingSettingsExtension20 value) {
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
