
package org.onvif.ver10.device.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>NetworkCapabilities complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NetworkCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="IPFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ZeroConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IPVersion6" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DynDNS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Dot11Configuration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Dot1XConfigurations" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="HostnameFromDHCP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NTP" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DHCPv6" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkCapabilities")
public class NetworkCapabilities {

    @XmlAttribute(name = "IPFilter")
    protected Boolean ipFilter;
    @XmlAttribute(name = "ZeroConfiguration")
    protected Boolean zeroConfiguration;
    @XmlAttribute(name = "IPVersion6")
    protected Boolean ipVersion6;
    @XmlAttribute(name = "DynDNS")
    protected Boolean dynDNS;
    @XmlAttribute(name = "Dot11Configuration")
    protected Boolean dot11Configuration;
    @XmlAttribute(name = "Dot1XConfigurations")
    protected Integer dot1XConfigurations;
    @XmlAttribute(name = "HostnameFromDHCP")
    protected Boolean hostnameFromDHCP;
    @XmlAttribute(name = "NTP")
    protected Integer ntp;
    @XmlAttribute(name = "DHCPv6")
    protected Boolean dhcPv6;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取ipFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIPFilter() {
        return ipFilter;
    }

    /**
     * 设置ipFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIPFilter(Boolean value) {
        this.ipFilter = value;
    }

    /**
     * 获取zeroConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroConfiguration() {
        return zeroConfiguration;
    }

    /**
     * 设置zeroConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroConfiguration(Boolean value) {
        this.zeroConfiguration = value;
    }

    /**
     * 获取ipVersion6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIPVersion6() {
        return ipVersion6;
    }

    /**
     * 设置ipVersion6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIPVersion6(Boolean value) {
        this.ipVersion6 = value;
    }

    /**
     * 获取dynDNS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynDNS() {
        return dynDNS;
    }

    /**
     * 设置dynDNS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynDNS(Boolean value) {
        this.dynDNS = value;
    }

    /**
     * 获取dot11Configuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDot11Configuration() {
        return dot11Configuration;
    }

    /**
     * 设置dot11Configuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDot11Configuration(Boolean value) {
        this.dot11Configuration = value;
    }

    /**
     * 获取dot1XConfigurations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDot1XConfigurations() {
        return dot1XConfigurations;
    }

    /**
     * 设置dot1XConfigurations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDot1XConfigurations(Integer value) {
        this.dot1XConfigurations = value;
    }

    /**
     * 获取hostnameFromDHCP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostnameFromDHCP() {
        return hostnameFromDHCP;
    }

    /**
     * 设置hostnameFromDHCP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostnameFromDHCP(Boolean value) {
        this.hostnameFromDHCP = value;
    }

    /**
     * 获取ntp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNTP() {
        return ntp;
    }

    /**
     * 设置ntp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNTP(Integer value) {
        this.ntp = value;
    }

    /**
     * 获取dhcPv6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDHCPv6() {
        return dhcPv6;
    }

    /**
     * 设置dhcPv6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDHCPv6(Boolean value) {
        this.dhcPv6 = value;
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
