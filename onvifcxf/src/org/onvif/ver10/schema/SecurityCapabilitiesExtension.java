
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SecurityCapabilitiesExtension complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SecurityCapabilitiesExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TLS1.0" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}SecurityCapabilitiesExtension2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilitiesExtension", propOrder = {
    "tls10",
    "extension"
})
public class SecurityCapabilitiesExtension {

    @XmlElement(name = "TLS1.0")
    protected boolean tls10;
    @XmlElement(name = "Extension")
    protected SecurityCapabilitiesExtension2 extension;

    /**
     * 获取tls10属性的值。
     * 
     */
    public boolean isTLS10() {
        return tls10;
    }

    /**
     * 设置tls10属性的值。
     * 
     */
    public void setTLS10(boolean value) {
        this.tls10 = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SecurityCapabilitiesExtension2 }
     *     
     */
    public SecurityCapabilitiesExtension2 getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCapabilitiesExtension2 }
     *     
     */
    public void setExtension(SecurityCapabilitiesExtension2 value) {
        this.extension = value;
    }

}
