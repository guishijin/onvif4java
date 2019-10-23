
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
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>IPv4Configuration complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IPv4Configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Manual" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LinkLocal" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" minOccurs="0"/>
 *         &lt;element name="FromDHCP" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" minOccurs="0"/>
 *         &lt;element name="DHCP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "IPv4Configuration", propOrder = {
    "manual",
    "linkLocal",
    "fromDHCP",
    "dhcp",
    "any"
})
public class IPv4Configuration {

    @XmlElement(name = "Manual")
    protected List<PrefixedIPv4Address> manual;
    @XmlElement(name = "LinkLocal")
    protected PrefixedIPv4Address linkLocal;
    @XmlElement(name = "FromDHCP")
    protected PrefixedIPv4Address fromDHCP;
    @XmlElement(name = "DHCP")
    protected boolean dhcp;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the manual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixedIPv4Address }
     * 
     * 
     */
    public List<PrefixedIPv4Address> getManual() {
        if (manual == null) {
            manual = new ArrayList<PrefixedIPv4Address>();
        }
        return this.manual;
    }

    /**
     * 获取linkLocal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrefixedIPv4Address }
     *     
     */
    public PrefixedIPv4Address getLinkLocal() {
        return linkLocal;
    }

    /**
     * 设置linkLocal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixedIPv4Address }
     *     
     */
    public void setLinkLocal(PrefixedIPv4Address value) {
        this.linkLocal = value;
    }

    /**
     * 获取fromDHCP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrefixedIPv4Address }
     *     
     */
    public PrefixedIPv4Address getFromDHCP() {
        return fromDHCP;
    }

    /**
     * 设置fromDHCP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixedIPv4Address }
     *     
     */
    public void setFromDHCP(PrefixedIPv4Address value) {
        this.fromDHCP = value;
    }

    /**
     * 获取dhcp属性的值。
     * 
     */
    public boolean isDHCP() {
        return dhcp;
    }

    /**
     * 设置dhcp属性的值。
     * 
     */
    public void setDHCP(boolean value) {
        this.dhcp = value;
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
