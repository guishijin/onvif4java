
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.Dot1XConfiguration;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dot1XConfiguration" type="{http://www.onvif.org/ver10/schema}Dot1XConfiguration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dot1XConfiguration"
})
@XmlRootElement(name = "GetDot1XConfigurationResponse")
public class GetDot1XConfigurationResponse {

    @XmlElement(name = "Dot1XConfiguration", required = true)
    protected Dot1XConfiguration dot1XConfiguration;

    /**
     * 获取dot1XConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Dot1XConfiguration }
     *     
     */
    public Dot1XConfiguration getDot1XConfiguration() {
        return dot1XConfiguration;
    }

    /**
     * 设置dot1XConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Dot1XConfiguration }
     *     
     */
    public void setDot1XConfiguration(Dot1XConfiguration value) {
        this.dot1XConfiguration = value;
    }

}
