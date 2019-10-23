
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


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
 *         &lt;element name="UploadUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="UploadDelay" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         &lt;element name="ExpectedDownTime" type="{http://www.w3.org/2001/XMLSchema}duration"/>
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
    "uploadUri",
    "uploadDelay",
    "expectedDownTime"
})
@XmlRootElement(name = "StartFirmwareUpgradeResponse")
public class StartFirmwareUpgradeResponse {

    @XmlElement(name = "UploadUri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uploadUri;
    @XmlElement(name = "UploadDelay", required = true)
    protected Duration uploadDelay;
    @XmlElement(name = "ExpectedDownTime", required = true)
    protected Duration expectedDownTime;

    /**
     * 获取uploadUri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadUri() {
        return uploadUri;
    }

    /**
     * 设置uploadUri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadUri(String value) {
        this.uploadUri = value;
    }

    /**
     * 获取uploadDelay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getUploadDelay() {
        return uploadDelay;
    }

    /**
     * 设置uploadDelay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setUploadDelay(Duration value) {
        this.uploadDelay = value;
    }

    /**
     * 获取expectedDownTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpectedDownTime() {
        return expectedDownTime;
    }

    /**
     * 设置expectedDownTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpectedDownTime(Duration value) {
        this.expectedDownTime = value;
    }

}
