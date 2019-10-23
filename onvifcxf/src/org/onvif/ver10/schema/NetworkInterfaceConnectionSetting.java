
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NetworkInterfaceConnectionSetting complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NetworkInterfaceConnectionSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutoNegotiation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Duplex" type="{http://www.onvif.org/ver10/schema}Duplex"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceConnectionSetting", propOrder = {
    "autoNegotiation",
    "speed",
    "duplex"
})
public class NetworkInterfaceConnectionSetting {

    @XmlElement(name = "AutoNegotiation")
    protected boolean autoNegotiation;
    @XmlElement(name = "Speed")
    protected int speed;
    @XmlElement(name = "Duplex", required = true)
    protected Duplex duplex;

    /**
     * 获取autoNegotiation属性的值。
     * 
     */
    public boolean isAutoNegotiation() {
        return autoNegotiation;
    }

    /**
     * 设置autoNegotiation属性的值。
     * 
     */
    public void setAutoNegotiation(boolean value) {
        this.autoNegotiation = value;
    }

    /**
     * 获取speed属性的值。
     * 
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * 设置speed属性的值。
     * 
     */
    public void setSpeed(int value) {
        this.speed = value;
    }

    /**
     * 获取duplex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duplex }
     *     
     */
    public Duplex getDuplex() {
        return duplex;
    }

    /**
     * 设置duplex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duplex }
     *     
     */
    public void setDuplex(Duplex value) {
        this.duplex = value;
    }

}
