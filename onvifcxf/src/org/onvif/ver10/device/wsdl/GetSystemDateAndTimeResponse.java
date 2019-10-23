
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SystemDateTime;


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
 *         &lt;element name="SystemDateAndTime" type="{http://www.onvif.org/ver10/schema}SystemDateTime"/>
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
    "systemDateAndTime"
})
@XmlRootElement(name = "GetSystemDateAndTimeResponse")
public class GetSystemDateAndTimeResponse {

    @XmlElement(name = "SystemDateAndTime", required = true)
    protected SystemDateTime systemDateAndTime;

    /**
     * 获取systemDateAndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SystemDateTime }
     *     
     */
    public SystemDateTime getSystemDateAndTime() {
        return systemDateAndTime;
    }

    /**
     * 设置systemDateAndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDateTime }
     *     
     */
    public void setSystemDateAndTime(SystemDateTime value) {
        this.systemDateAndTime = value;
    }

}
