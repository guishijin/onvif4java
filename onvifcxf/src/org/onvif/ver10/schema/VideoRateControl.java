
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VideoRateControl complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VideoRateControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrameRateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EncodingInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BitrateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRateControl", propOrder = {
    "frameRateLimit",
    "encodingInterval",
    "bitrateLimit"
})
public class VideoRateControl {

    @XmlElement(name = "FrameRateLimit")
    protected int frameRateLimit;
    @XmlElement(name = "EncodingInterval")
    protected int encodingInterval;
    @XmlElement(name = "BitrateLimit")
    protected int bitrateLimit;

    /**
     * 获取frameRateLimit属性的值。
     * 
     */
    public int getFrameRateLimit() {
        return frameRateLimit;
    }

    /**
     * 设置frameRateLimit属性的值。
     * 
     */
    public void setFrameRateLimit(int value) {
        this.frameRateLimit = value;
    }

    /**
     * 获取encodingInterval属性的值。
     * 
     */
    public int getEncodingInterval() {
        return encodingInterval;
    }

    /**
     * 设置encodingInterval属性的值。
     * 
     */
    public void setEncodingInterval(int value) {
        this.encodingInterval = value;
    }

    /**
     * 获取bitrateLimit属性的值。
     * 
     */
    public int getBitrateLimit() {
        return bitrateLimit;
    }

    /**
     * 设置bitrateLimit属性的值。
     * 
     */
    public void setBitrateLimit(int value) {
        this.bitrateLimit = value;
    }

}
