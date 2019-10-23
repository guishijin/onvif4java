
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
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>VideoEncoderConfiguration complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VideoEncoderConfiguration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       &lt;sequence>
 *         &lt;element name="Encoding" type="{http://www.onvif.org/ver10/schema}VideoEncoding"/>
 *         &lt;element name="Resolution" type="{http://www.onvif.org/ver10/schema}VideoResolution"/>
 *         &lt;element name="Quality" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="RateControl" type="{http://www.onvif.org/ver10/schema}VideoRateControl" minOccurs="0"/>
 *         &lt;element name="MPEG4" type="{http://www.onvif.org/ver10/schema}Mpeg4Configuration" minOccurs="0"/>
 *         &lt;element name="H264" type="{http://www.onvif.org/ver10/schema}H264Configuration" minOccurs="0"/>
 *         &lt;element name="Multicast" type="{http://www.onvif.org/ver10/schema}MulticastConfiguration"/>
 *         &lt;element name="SessionTimeout" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoEncoderConfiguration", propOrder = {
    "encoding",
    "resolution",
    "quality",
    "rateControl",
    "mpeg4",
    "h264",
    "multicast",
    "sessionTimeout",
    "any"
})
public class VideoEncoderConfiguration
    extends ConfigurationEntity
{

    @XmlElement(name = "Encoding", required = true)
    protected VideoEncoding encoding;
    @XmlElement(name = "Resolution", required = true)
    protected VideoResolution resolution;
    @XmlElement(name = "Quality")
    protected float quality;
    @XmlElement(name = "RateControl")
    protected VideoRateControl rateControl;
    @XmlElement(name = "MPEG4")
    protected Mpeg4Configuration mpeg4;
    @XmlElement(name = "H264")
    protected H264Configuration h264;
    @XmlElement(name = "Multicast", required = true)
    protected MulticastConfiguration multicast;
    @XmlElement(name = "SessionTimeout", required = true)
    protected Duration sessionTimeout;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取encoding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoEncoding }
     *     
     */
    public VideoEncoding getEncoding() {
        return encoding;
    }

    /**
     * 设置encoding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEncoding }
     *     
     */
    public void setEncoding(VideoEncoding value) {
        this.encoding = value;
    }

    /**
     * 获取resolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoResolution }
     *     
     */
    public VideoResolution getResolution() {
        return resolution;
    }

    /**
     * 设置resolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoResolution }
     *     
     */
    public void setResolution(VideoResolution value) {
        this.resolution = value;
    }

    /**
     * 获取quality属性的值。
     * 
     */
    public float getQuality() {
        return quality;
    }

    /**
     * 设置quality属性的值。
     * 
     */
    public void setQuality(float value) {
        this.quality = value;
    }

    /**
     * 获取rateControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoRateControl }
     *     
     */
    public VideoRateControl getRateControl() {
        return rateControl;
    }

    /**
     * 设置rateControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoRateControl }
     *     
     */
    public void setRateControl(VideoRateControl value) {
        this.rateControl = value;
    }

    /**
     * 获取mpeg4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Mpeg4Configuration }
     *     
     */
    public Mpeg4Configuration getMPEG4() {
        return mpeg4;
    }

    /**
     * 设置mpeg4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Mpeg4Configuration }
     *     
     */
    public void setMPEG4(Mpeg4Configuration value) {
        this.mpeg4 = value;
    }

    /**
     * 获取h264属性的值。
     * 
     * @return
     *     possible object is
     *     {@link H264Configuration }
     *     
     */
    public H264Configuration getH264() {
        return h264;
    }

    /**
     * 设置h264属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link H264Configuration }
     *     
     */
    public void setH264(H264Configuration value) {
        this.h264 = value;
    }

    /**
     * 获取multicast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MulticastConfiguration }
     *     
     */
    public MulticastConfiguration getMulticast() {
        return multicast;
    }

    /**
     * 设置multicast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MulticastConfiguration }
     *     
     */
    public void setMulticast(MulticastConfiguration value) {
        this.multicast = value;
    }

    /**
     * 获取sessionTimeout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    /**
     * 设置sessionTimeout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSessionTimeout(Duration value) {
        this.sessionTimeout = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
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
