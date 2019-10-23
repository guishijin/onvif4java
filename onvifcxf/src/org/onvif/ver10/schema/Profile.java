
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * 
 *         A media profile consists of a set of media configurations. Media profiles are used by a client
 * 			to configure properties of a media stream from an NVT.
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 *         An NVT shall provide at least one media profile at boot. An NVT should provide “ready to use”
 * 			profiles for the most common media configurations that the device offers.
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 *         A profile consists of a set of interconnected configuration entities. Configurations are provided
 * 			by the NVT and can be either static or created dynamically by the NVT. For example, the
 * 			dynamic configurations can be created by the NVT depending on current available encoding
 * 			resources.
 *       
 * 
 * <p>Profile complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Profile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.onvif.org/ver10/schema}Name"/>
 *         &lt;element name="VideoSourceConfiguration" type="{http://www.onvif.org/ver10/schema}VideoSourceConfiguration" minOccurs="0"/>
 *         &lt;element name="AudioSourceConfiguration" type="{http://www.onvif.org/ver10/schema}AudioSourceConfiguration" minOccurs="0"/>
 *         &lt;element name="VideoEncoderConfiguration" type="{http://www.onvif.org/ver10/schema}VideoEncoderConfiguration" minOccurs="0"/>
 *         &lt;element name="AudioEncoderConfiguration" type="{http://www.onvif.org/ver10/schema}AudioEncoderConfiguration" minOccurs="0"/>
 *         &lt;element name="VideoAnalyticsConfiguration" type="{http://www.onvif.org/ver10/schema}VideoAnalyticsConfiguration" minOccurs="0"/>
 *         &lt;element name="PTZConfiguration" type="{http://www.onvif.org/ver10/schema}PTZConfiguration" minOccurs="0"/>
 *         &lt;element name="MetadataConfiguration" type="{http://www.onvif.org/ver10/schema}MetadataConfiguration" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ProfileExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *       &lt;attribute name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", propOrder = {
    "name",
    "videoSourceConfiguration",
    "audioSourceConfiguration",
    "videoEncoderConfiguration",
    "audioEncoderConfiguration",
    "videoAnalyticsConfiguration",
    "ptzConfiguration",
    "metadataConfiguration",
    "extension"
})
public class Profile {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "VideoSourceConfiguration")
    protected VideoSourceConfiguration videoSourceConfiguration;
    @XmlElement(name = "AudioSourceConfiguration")
    protected AudioSourceConfiguration audioSourceConfiguration;
    @XmlElement(name = "VideoEncoderConfiguration")
    protected VideoEncoderConfiguration videoEncoderConfiguration;
    @XmlElement(name = "AudioEncoderConfiguration")
    protected AudioEncoderConfiguration audioEncoderConfiguration;
    @XmlElement(name = "VideoAnalyticsConfiguration")
    protected VideoAnalyticsConfiguration videoAnalyticsConfiguration;
    @XmlElement(name = "PTZConfiguration")
    protected PTZConfiguration ptzConfiguration;
    @XmlElement(name = "MetadataConfiguration")
    protected MetadataConfiguration metadataConfiguration;
    @XmlElement(name = "Extension")
    protected ProfileExtension extension;
    @XmlAttribute(name = "token", required = true)
    protected String token;
    @XmlAttribute(name = "fixed")
    protected Boolean fixed;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取videoSourceConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoSourceConfiguration }
     *     
     */
    public VideoSourceConfiguration getVideoSourceConfiguration() {
        return videoSourceConfiguration;
    }

    /**
     * 设置videoSourceConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSourceConfiguration }
     *     
     */
    public void setVideoSourceConfiguration(VideoSourceConfiguration value) {
        this.videoSourceConfiguration = value;
    }

    /**
     * 获取audioSourceConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AudioSourceConfiguration }
     *     
     */
    public AudioSourceConfiguration getAudioSourceConfiguration() {
        return audioSourceConfiguration;
    }

    /**
     * 设置audioSourceConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AudioSourceConfiguration }
     *     
     */
    public void setAudioSourceConfiguration(AudioSourceConfiguration value) {
        this.audioSourceConfiguration = value;
    }

    /**
     * 获取videoEncoderConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoEncoderConfiguration }
     *     
     */
    public VideoEncoderConfiguration getVideoEncoderConfiguration() {
        return videoEncoderConfiguration;
    }

    /**
     * 设置videoEncoderConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEncoderConfiguration }
     *     
     */
    public void setVideoEncoderConfiguration(VideoEncoderConfiguration value) {
        this.videoEncoderConfiguration = value;
    }

    /**
     * 获取audioEncoderConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AudioEncoderConfiguration }
     *     
     */
    public AudioEncoderConfiguration getAudioEncoderConfiguration() {
        return audioEncoderConfiguration;
    }

    /**
     * 设置audioEncoderConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AudioEncoderConfiguration }
     *     
     */
    public void setAudioEncoderConfiguration(AudioEncoderConfiguration value) {
        this.audioEncoderConfiguration = value;
    }

    /**
     * 获取videoAnalyticsConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoAnalyticsConfiguration }
     *     
     */
    public VideoAnalyticsConfiguration getVideoAnalyticsConfiguration() {
        return videoAnalyticsConfiguration;
    }

    /**
     * 设置videoAnalyticsConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAnalyticsConfiguration }
     *     
     */
    public void setVideoAnalyticsConfiguration(VideoAnalyticsConfiguration value) {
        this.videoAnalyticsConfiguration = value;
    }

    /**
     * 获取ptzConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZConfiguration }
     *     
     */
    public PTZConfiguration getPTZConfiguration() {
        return ptzConfiguration;
    }

    /**
     * 设置ptzConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZConfiguration }
     *     
     */
    public void setPTZConfiguration(PTZConfiguration value) {
        this.ptzConfiguration = value;
    }

    /**
     * 获取metadataConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MetadataConfiguration }
     *     
     */
    public MetadataConfiguration getMetadataConfiguration() {
        return metadataConfiguration;
    }

    /**
     * 设置metadataConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataConfiguration }
     *     
     */
    public void setMetadataConfiguration(MetadataConfiguration value) {
        this.metadataConfiguration = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProfileExtension }
     *     
     */
    public ProfileExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileExtension }
     *     
     */
    public void setExtension(ProfileExtension value) {
        this.extension = value;
    }

    /**
     * 获取token属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置token属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * 获取fixed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixed() {
        return fixed;
    }

    /**
     * 设置fixed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixed(Boolean value) {
        this.fixed = value;
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
