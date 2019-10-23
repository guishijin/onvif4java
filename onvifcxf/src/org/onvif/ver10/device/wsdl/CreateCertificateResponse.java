
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.Certificate;


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
 *         &lt;element name="NvtCertificate" type="{http://www.onvif.org/ver10/schema}Certificate"/>
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
    "nvtCertificate"
})
@XmlRootElement(name = "CreateCertificateResponse")
public class CreateCertificateResponse {

    @XmlElement(name = "NvtCertificate", required = true)
    protected Certificate nvtCertificate;

    /**
     * 获取nvtCertificate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Certificate }
     *     
     */
    public Certificate getNvtCertificate() {
        return nvtCertificate;
    }

    /**
     * 设置nvtCertificate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Certificate }
     *     
     */
    public void setNvtCertificate(Certificate value) {
        this.nvtCertificate = value;
    }

}
