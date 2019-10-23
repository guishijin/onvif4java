
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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>DeviceIOCapabilities complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DeviceIOCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="VideoSources" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VideoOutputs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AudioSources" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AudioOutputs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RelayOutputs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DeviceIOCapabilities", propOrder = {
    "xAddr",
    "videoSources",
    "videoOutputs",
    "audioSources",
    "audioOutputs",
    "relayOutputs",
    "any"
})
public class DeviceIOCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;
    @XmlElement(name = "VideoSources")
    protected int videoSources;
    @XmlElement(name = "VideoOutputs")
    protected int videoOutputs;
    @XmlElement(name = "AudioSources")
    protected int audioSources;
    @XmlElement(name = "AudioOutputs")
    protected int audioOutputs;
    @XmlElement(name = "RelayOutputs")
    protected int relayOutputs;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取xAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAddr() {
        return xAddr;
    }

    /**
     * 设置xAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAddr(String value) {
        this.xAddr = value;
    }

    /**
     * 获取videoSources属性的值。
     * 
     */
    public int getVideoSources() {
        return videoSources;
    }

    /**
     * 设置videoSources属性的值。
     * 
     */
    public void setVideoSources(int value) {
        this.videoSources = value;
    }

    /**
     * 获取videoOutputs属性的值。
     * 
     */
    public int getVideoOutputs() {
        return videoOutputs;
    }

    /**
     * 设置videoOutputs属性的值。
     * 
     */
    public void setVideoOutputs(int value) {
        this.videoOutputs = value;
    }

    /**
     * 获取audioSources属性的值。
     * 
     */
    public int getAudioSources() {
        return audioSources;
    }

    /**
     * 设置audioSources属性的值。
     * 
     */
    public void setAudioSources(int value) {
        this.audioSources = value;
    }

    /**
     * 获取audioOutputs属性的值。
     * 
     */
    public int getAudioOutputs() {
        return audioOutputs;
    }

    /**
     * 设置audioOutputs属性的值。
     * 
     */
    public void setAudioOutputs(int value) {
        this.audioOutputs = value;
    }

    /**
     * 获取relayOutputs属性的值。
     * 
     */
    public int getRelayOutputs() {
        return relayOutputs;
    }

    /**
     * 设置relayOutputs属性的值。
     * 
     */
    public void setRelayOutputs(int value) {
        this.relayOutputs = value;
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
