
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ImagingOptions20Extension2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ImagingOptions20Extension2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IrCutFilterAutoAdjustment" type="{http://www.onvif.org/ver10/schema}IrCutFilterAutoAdjustmentOptions" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingOptions20Extension3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingOptions20Extension2", propOrder = {
    "irCutFilterAutoAdjustment",
    "extension"
})
public class ImagingOptions20Extension2 {

    @XmlElement(name = "IrCutFilterAutoAdjustment")
    protected IrCutFilterAutoAdjustmentOptions irCutFilterAutoAdjustment;
    @XmlElement(name = "Extension")
    protected ImagingOptions20Extension3 extension;

    /**
     * 获取irCutFilterAutoAdjustment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IrCutFilterAutoAdjustmentOptions }
     *     
     */
    public IrCutFilterAutoAdjustmentOptions getIrCutFilterAutoAdjustment() {
        return irCutFilterAutoAdjustment;
    }

    /**
     * 设置irCutFilterAutoAdjustment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IrCutFilterAutoAdjustmentOptions }
     *     
     */
    public void setIrCutFilterAutoAdjustment(IrCutFilterAutoAdjustmentOptions value) {
        this.irCutFilterAutoAdjustment = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImagingOptions20Extension3 }
     *     
     */
    public ImagingOptions20Extension3 getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingOptions20Extension3 }
     *     
     */
    public void setExtension(ImagingOptions20Extension3 value) {
        this.extension = value;
    }

}
