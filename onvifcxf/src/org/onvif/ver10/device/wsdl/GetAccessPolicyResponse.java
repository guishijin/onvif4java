
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.BinaryData;


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
 *         &lt;element name="PolicyFile" type="{http://www.onvif.org/ver10/schema}BinaryData"/>
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
    "policyFile"
})
@XmlRootElement(name = "GetAccessPolicyResponse")
public class GetAccessPolicyResponse {

    @XmlElement(name = "PolicyFile", required = true)
    protected BinaryData policyFile;

    /**
     * 获取policyFile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BinaryData }
     *     
     */
    public BinaryData getPolicyFile() {
        return policyFile;
    }

    /**
     * 设置policyFile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryData }
     *     
     */
    public void setPolicyFile(BinaryData value) {
        this.policyFile = value;
    }

}
