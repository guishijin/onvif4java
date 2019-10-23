
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SystemLogType;


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
 *         &lt;element name="LogType" type="{http://www.onvif.org/ver10/schema}SystemLogType"/>
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
    "logType"
})
@XmlRootElement(name = "GetSystemLog")
public class GetSystemLog {

    @XmlElement(name = "LogType", required = true)
    protected SystemLogType logType;

    /**
     * 获取logType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SystemLogType }
     *     
     */
    public SystemLogType getLogType() {
        return logType;
    }

    /**
     * 设置logType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SystemLogType }
     *     
     */
    public void setLogType(SystemLogType value) {
        this.logType = value;
    }

}
