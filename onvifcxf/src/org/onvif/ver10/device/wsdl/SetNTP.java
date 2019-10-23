
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.NetworkHost;


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
 *         &lt;element name="FromDHCP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NTPManual" type="{http://www.onvif.org/ver10/schema}NetworkHost" maxOccurs="unbounded" minOccurs="0"/>
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
    "fromDHCP",
    "ntpManual"
})
@XmlRootElement(name = "SetNTP")
public class SetNTP {

    @XmlElement(name = "FromDHCP")
    protected boolean fromDHCP;
    @XmlElement(name = "NTPManual")
    protected List<NetworkHost> ntpManual;

    /**
     * 获取fromDHCP属性的值。
     * 
     */
    public boolean isFromDHCP() {
        return fromDHCP;
    }

    /**
     * 设置fromDHCP属性的值。
     * 
     */
    public void setFromDHCP(boolean value) {
        this.fromDHCP = value;
    }

    /**
     * Gets the value of the ntpManual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntpManual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNTPManual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkHost }
     * 
     * 
     */
    public List<NetworkHost> getNTPManual() {
        if (ntpManual == null) {
            ntpManual = new ArrayList<NetworkHost>();
        }
        return this.ntpManual;
    }

}
