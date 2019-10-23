
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RelayLogicalState;


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
 *         &lt;element name="RelayOutputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         &lt;element name="LogicalState" type="{http://www.onvif.org/ver10/schema}RelayLogicalState"/>
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
    "relayOutputToken",
    "logicalState"
})
@XmlRootElement(name = "SetRelayOutputState")
public class SetRelayOutputState {

    @XmlElement(name = "RelayOutputToken", required = true)
    protected String relayOutputToken;
    @XmlElement(name = "LogicalState", required = true)
    protected RelayLogicalState logicalState;

    /**
     * 获取relayOutputToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelayOutputToken() {
        return relayOutputToken;
    }

    /**
     * 设置relayOutputToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelayOutputToken(String value) {
        this.relayOutputToken = value;
    }

    /**
     * 获取logicalState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelayLogicalState }
     *     
     */
    public RelayLogicalState getLogicalState() {
        return logicalState;
    }

    /**
     * 设置logicalState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelayLogicalState }
     *     
     */
    public void setLogicalState(RelayLogicalState value) {
        this.logicalState = value;
    }

}
