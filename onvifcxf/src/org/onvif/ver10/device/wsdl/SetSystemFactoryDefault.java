
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.FactoryDefaultType;


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
 *         &lt;element name="FactoryDefault" type="{http://www.onvif.org/ver10/schema}FactoryDefaultType"/>
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
    "factoryDefault"
})
@XmlRootElement(name = "SetSystemFactoryDefault")
public class SetSystemFactoryDefault {

    @XmlElement(name = "FactoryDefault", required = true)
    protected FactoryDefaultType factoryDefault;

    /**
     * 获取factoryDefault属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FactoryDefaultType }
     *     
     */
    public FactoryDefaultType getFactoryDefault() {
        return factoryDefault;
    }

    /**
     * 设置factoryDefault属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FactoryDefaultType }
     *     
     */
    public void setFactoryDefault(FactoryDefaultType value) {
        this.factoryDefault = value;
    }

}
