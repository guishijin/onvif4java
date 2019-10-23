
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>PrefixedIPv4Address complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PrefixedIPv4Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.onvif.org/ver10/schema}IPv4Address"/>
 *         &lt;element name="PrefixLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrefixedIPv4Address", propOrder = {
    "address",
    "prefixLength"
})
public class PrefixedIPv4Address {

    @XmlElement(name = "Address", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String address;
    @XmlElement(name = "PrefixLength")
    protected int prefixLength;

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取prefixLength属性的值。
     * 
     */
    public int getPrefixLength() {
        return prefixLength;
    }

    /**
     * 设置prefixLength属性的值。
     * 
     */
    public void setPrefixLength(int value) {
        this.prefixLength = value;
    }

}
