
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SupportInformation;


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
 *         &lt;element name="SupportInformation" type="{http://www.onvif.org/ver10/schema}SupportInformation"/>
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
    "supportInformation"
})
@XmlRootElement(name = "GetSystemSupportInformationResponse")
public class GetSystemSupportInformationResponse {

    @XmlElement(name = "SupportInformation", required = true)
    protected SupportInformation supportInformation;

    /**
     * 获取supportInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupportInformation }
     *     
     */
    public SupportInformation getSupportInformation() {
        return supportInformation;
    }

    /**
     * 设置supportInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupportInformation }
     *     
     */
    public void setSupportInformation(SupportInformation value) {
        this.supportInformation = value;
    }

}
