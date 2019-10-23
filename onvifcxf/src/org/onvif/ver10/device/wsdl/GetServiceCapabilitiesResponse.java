
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Capabilities" type="{http://www.onvif.org/ver10/device/wsdl}DeviceServiceCapabilities"/>
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
    "capabilities"
})
@XmlRootElement(name = "GetServiceCapabilitiesResponse")
public class GetServiceCapabilitiesResponse {

    @XmlElement(name = "Capabilities", required = true)
    protected DeviceServiceCapabilities capabilities;

    /**
     * 获取capabilities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeviceServiceCapabilities }
     *     
     */
    public DeviceServiceCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * 设置capabilities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceServiceCapabilities }
     *     
     */
    public void setCapabilities(DeviceServiceCapabilities value) {
        this.capabilities = value;
    }

}
