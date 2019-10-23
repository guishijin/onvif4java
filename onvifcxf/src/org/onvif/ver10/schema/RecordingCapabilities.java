
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
 * <p>RecordingCapabilities complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RecordingCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="ReceiverSource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MediaProfileSource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DynamicRecordings" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DynamicTracks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MaxStringLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "RecordingCapabilities", propOrder = {
    "xAddr",
    "receiverSource",
    "mediaProfileSource",
    "dynamicRecordings",
    "dynamicTracks",
    "maxStringLength",
    "any"
})
public class RecordingCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;
    @XmlElement(name = "ReceiverSource")
    protected boolean receiverSource;
    @XmlElement(name = "MediaProfileSource")
    protected boolean mediaProfileSource;
    @XmlElement(name = "DynamicRecordings")
    protected boolean dynamicRecordings;
    @XmlElement(name = "DynamicTracks")
    protected boolean dynamicTracks;
    @XmlElement(name = "MaxStringLength")
    protected int maxStringLength;
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
     * 获取receiverSource属性的值。
     * 
     */
    public boolean isReceiverSource() {
        return receiverSource;
    }

    /**
     * 设置receiverSource属性的值。
     * 
     */
    public void setReceiverSource(boolean value) {
        this.receiverSource = value;
    }

    /**
     * 获取mediaProfileSource属性的值。
     * 
     */
    public boolean isMediaProfileSource() {
        return mediaProfileSource;
    }

    /**
     * 设置mediaProfileSource属性的值。
     * 
     */
    public void setMediaProfileSource(boolean value) {
        this.mediaProfileSource = value;
    }

    /**
     * 获取dynamicRecordings属性的值。
     * 
     */
    public boolean isDynamicRecordings() {
        return dynamicRecordings;
    }

    /**
     * 设置dynamicRecordings属性的值。
     * 
     */
    public void setDynamicRecordings(boolean value) {
        this.dynamicRecordings = value;
    }

    /**
     * 获取dynamicTracks属性的值。
     * 
     */
    public boolean isDynamicTracks() {
        return dynamicTracks;
    }

    /**
     * 设置dynamicTracks属性的值。
     * 
     */
    public void setDynamicTracks(boolean value) {
        this.dynamicTracks = value;
    }

    /**
     * 获取maxStringLength属性的值。
     * 
     */
    public int getMaxStringLength() {
        return maxStringLength;
    }

    /**
     * 设置maxStringLength属性的值。
     * 
     */
    public void setMaxStringLength(int value) {
        this.maxStringLength = value;
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
