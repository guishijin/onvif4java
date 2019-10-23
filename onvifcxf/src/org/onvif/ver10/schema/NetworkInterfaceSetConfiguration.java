
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
 * <p>NetworkInterfaceSetConfiguration complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NetworkInterfaceSetConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Link" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceConnectionSetting" minOccurs="0"/>
 *         &lt;element name="MTU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IPv4" type="{http://www.onvif.org/ver10/schema}IPv4NetworkInterfaceSetConfiguration" minOccurs="0"/>
 *         &lt;element name="IPv6" type="{http://www.onvif.org/ver10/schema}IPv6NetworkInterfaceSetConfiguration" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceSetConfigurationExtension" minOccurs="0"/>
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
@XmlType(name = "NetworkInterfaceSetConfiguration", propOrder = {
    "enabled",
    "link",
    "mtu",
    "iPv4",
    "iPv6",
    "extension"
})
public class NetworkInterfaceSetConfiguration {

    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "Link")
    protected NetworkInterfaceConnectionSetting link;
    @XmlElement(name = "MTU")
    protected Integer mtu;
    @XmlElement(name = "IPv4")
    protected IPv4NetworkInterfaceSetConfiguration iPv4;
    @XmlElement(name = "IPv6")
    protected IPv6NetworkInterfaceSetConfiguration iPv6;
    @XmlElement(name = "Extension")
    protected NetworkInterfaceSetConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取enabled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * 设置enabled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * 获取link属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public NetworkInterfaceConnectionSetting getLink() {
        return link;
    }

    /**
     * 设置link属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public void setLink(NetworkInterfaceConnectionSetting value) {
        this.link = value;
    }

    /**
     * 获取mtu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTU() {
        return mtu;
    }

    /**
     * 设置mtu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTU(Integer value) {
        this.mtu = value;
    }

    /**
     * 获取iPv4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IPv4NetworkInterfaceSetConfiguration }
     *     
     */
    public IPv4NetworkInterfaceSetConfiguration getIPv4() {
        return iPv4;
    }

    /**
     * 设置iPv4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IPv4NetworkInterfaceSetConfiguration }
     *     
     */
    public void setIPv4(IPv4NetworkInterfaceSetConfiguration value) {
        this.iPv4 = value;
    }

    /**
     * 获取iPv6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IPv6NetworkInterfaceSetConfiguration }
     *     
     */
    public IPv6NetworkInterfaceSetConfiguration getIPv6() {
        return iPv6;
    }

    /**
     * 设置iPv6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6NetworkInterfaceSetConfiguration }
     *     
     */
    public void setIPv6(IPv6NetworkInterfaceSetConfiguration value) {
        this.iPv6 = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceSetConfigurationExtension }
     *     
     */
    public NetworkInterfaceSetConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceSetConfigurationExtension }
     *     
     */
    public void setExtension(NetworkInterfaceSetConfigurationExtension value) {
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
