
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
 * <p>NetworkInterface complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NetworkInterface">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}DeviceEntity">
 *       &lt;sequence>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Info" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceInfo" minOccurs="0"/>
 *         &lt;element name="Link" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceLink" minOccurs="0"/>
 *         &lt;element name="IPv4" type="{http://www.onvif.org/ver10/schema}IPv4NetworkInterface" minOccurs="0"/>
 *         &lt;element name="IPv6" type="{http://www.onvif.org/ver10/schema}IPv6NetworkInterface" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceExtension" minOccurs="0"/>
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
@XmlType(name = "NetworkInterface", propOrder = {
    "enabled",
    "info",
    "link",
    "iPv4",
    "iPv6",
    "extension"
})
public class NetworkInterface
    extends DeviceEntity
{

    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "Info")
    protected NetworkInterfaceInfo info;
    @XmlElement(name = "Link")
    protected NetworkInterfaceLink link;
    @XmlElement(name = "IPv4")
    protected IPv4NetworkInterface iPv4;
    @XmlElement(name = "IPv6")
    protected IPv6NetworkInterface iPv6;
    @XmlElement(name = "Extension")
    protected NetworkInterfaceExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取enabled属性的值。
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * 设置enabled属性的值。
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * 获取info属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceInfo }
     *     
     */
    public NetworkInterfaceInfo getInfo() {
        return info;
    }

    /**
     * 设置info属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceInfo }
     *     
     */
    public void setInfo(NetworkInterfaceInfo value) {
        this.info = value;
    }

    /**
     * 获取link属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceLink }
     *     
     */
    public NetworkInterfaceLink getLink() {
        return link;
    }

    /**
     * 设置link属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceLink }
     *     
     */
    public void setLink(NetworkInterfaceLink value) {
        this.link = value;
    }

    /**
     * 获取iPv4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IPv4NetworkInterface }
     *     
     */
    public IPv4NetworkInterface getIPv4() {
        return iPv4;
    }

    /**
     * 设置iPv4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IPv4NetworkInterface }
     *     
     */
    public void setIPv4(IPv4NetworkInterface value) {
        this.iPv4 = value;
    }

    /**
     * 获取iPv6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IPv6NetworkInterface }
     *     
     */
    public IPv6NetworkInterface getIPv6() {
        return iPv6;
    }

    /**
     * 设置iPv6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6NetworkInterface }
     *     
     */
    public void setIPv6(IPv6NetworkInterface value) {
        this.iPv6 = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceExtension }
     *     
     */
    public NetworkInterfaceExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceExtension }
     *     
     */
    public void setExtension(NetworkInterfaceExtension value) {
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
