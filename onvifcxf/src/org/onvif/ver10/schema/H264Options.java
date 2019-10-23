
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>H264Options complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="H264Options">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResolutionsAvailable" type="{http://www.onvif.org/ver10/schema}VideoResolution" maxOccurs="unbounded"/>
 *         &lt;element name="GovLengthRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         &lt;element name="FrameRateRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         &lt;element name="EncodingIntervalRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         &lt;element name="H264ProfilesSupported" type="{http://www.onvif.org/ver10/schema}H264Profile" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "H264Options", propOrder = {
    "resolutionsAvailable",
    "govLengthRange",
    "frameRateRange",
    "encodingIntervalRange",
    "h264ProfilesSupported"
})
@XmlSeeAlso({
    H264Options2 .class
})
public class H264Options {

    @XmlElement(name = "ResolutionsAvailable", required = true)
    protected List<VideoResolution> resolutionsAvailable;
    @XmlElement(name = "GovLengthRange", required = true)
    protected IntRange govLengthRange;
    @XmlElement(name = "FrameRateRange", required = true)
    protected IntRange frameRateRange;
    @XmlElement(name = "EncodingIntervalRange", required = true)
    protected IntRange encodingIntervalRange;
    @XmlElement(name = "H264ProfilesSupported", required = true)
    protected List<H264Profile> h264ProfilesSupported;

    /**
     * Gets the value of the resolutionsAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolutionsAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolutionsAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoResolution }
     * 
     * 
     */
    public List<VideoResolution> getResolutionsAvailable() {
        if (resolutionsAvailable == null) {
            resolutionsAvailable = new ArrayList<VideoResolution>();
        }
        return this.resolutionsAvailable;
    }

    /**
     * 获取govLengthRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getGovLengthRange() {
        return govLengthRange;
    }

    /**
     * 设置govLengthRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setGovLengthRange(IntRange value) {
        this.govLengthRange = value;
    }

    /**
     * 获取frameRateRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getFrameRateRange() {
        return frameRateRange;
    }

    /**
     * 设置frameRateRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setFrameRateRange(IntRange value) {
        this.frameRateRange = value;
    }

    /**
     * 获取encodingIntervalRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getEncodingIntervalRange() {
        return encodingIntervalRange;
    }

    /**
     * 设置encodingIntervalRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setEncodingIntervalRange(IntRange value) {
        this.encodingIntervalRange = value;
    }

    /**
     * Gets the value of the h264ProfilesSupported property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the h264ProfilesSupported property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getH264ProfilesSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link H264Profile }
     * 
     * 
     */
    public List<H264Profile> getH264ProfilesSupported() {
        if (h264ProfilesSupported == null) {
            h264ProfilesSupported = new ArrayList<H264Profile>();
        }
        return this.h264ProfilesSupported;
    }

}
