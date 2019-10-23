
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Range of a rectangle. The rectangle itself is defined by lower left corner position and size. Units are pixel.
 * 
 * <p>IntRectangleRange complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IntRectangleRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         &lt;element name="YRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         &lt;element name="WidthRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         &lt;element name="HeightRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRectangleRange", propOrder = {
    "xRange",
    "yRange",
    "widthRange",
    "heightRange"
})
public class IntRectangleRange {

    @XmlElement(name = "XRange", required = true)
    protected IntRange xRange;
    @XmlElement(name = "YRange", required = true)
    protected IntRange yRange;
    @XmlElement(name = "WidthRange", required = true)
    protected IntRange widthRange;
    @XmlElement(name = "HeightRange", required = true)
    protected IntRange heightRange;

    /**
     * 获取xRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getXRange() {
        return xRange;
    }

    /**
     * 设置xRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setXRange(IntRange value) {
        this.xRange = value;
    }

    /**
     * 获取yRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getYRange() {
        return yRange;
    }

    /**
     * 设置yRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setYRange(IntRange value) {
        this.yRange = value;
    }

    /**
     * 获取widthRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getWidthRange() {
        return widthRange;
    }

    /**
     * 设置widthRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setWidthRange(IntRange value) {
        this.widthRange = value;
    }

    /**
     * 获取heightRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getHeightRange() {
        return heightRange;
    }

    /**
     * 设置heightRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setHeightRange(IntRange value) {
        this.heightRange = value;
    }

}
