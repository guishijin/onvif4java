
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>H264Configuration complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="H264Configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GovLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="H264Profile" type="{http://www.onvif.org/ver10/schema}H264Profile"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "H264Configuration", propOrder = {
    "govLength",
    "h264Profile"
})
public class H264Configuration {

    @XmlElement(name = "GovLength")
    protected int govLength;
    @XmlElement(name = "H264Profile", required = true)
    protected H264Profile h264Profile;

    /**
     * 获取govLength属性的值。
     * 
     */
    public int getGovLength() {
        return govLength;
    }

    /**
     * 设置govLength属性的值。
     * 
     */
    public void setGovLength(int value) {
        this.govLength = value;
    }

    /**
     * 获取h264Profile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link H264Profile }
     *     
     */
    public H264Profile getH264Profile() {
        return h264Profile;
    }

    /**
     * 设置h264Profile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link H264Profile }
     *     
     */
    public void setH264Profile(H264Profile value) {
        this.h264Profile = value;
    }

}
