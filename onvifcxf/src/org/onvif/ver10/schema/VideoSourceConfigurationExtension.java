
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VideoSourceConfigurationExtension complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VideoSourceConfigurationExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rotate" type="{http://www.onvif.org/ver10/schema}Rotate" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoSourceConfigurationExtension2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSourceConfigurationExtension", propOrder = {
    "rotate",
    "extension"
})
public class VideoSourceConfigurationExtension {

    @XmlElement(name = "Rotate")
    protected Rotate rotate;
    @XmlElement(name = "Extension")
    protected VideoSourceConfigurationExtension2 extension;

    /**
     * 获取rotate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Rotate }
     *     
     */
    public Rotate getRotate() {
        return rotate;
    }

    /**
     * 设置rotate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Rotate }
     *     
     */
    public void setRotate(Rotate value) {
        this.rotate = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoSourceConfigurationExtension2 }
     *     
     */
    public VideoSourceConfigurationExtension2 getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSourceConfigurationExtension2 }
     *     
     */
    public void setExtension(VideoSourceConfigurationExtension2 value) {
        this.extension = value;
    }

}
