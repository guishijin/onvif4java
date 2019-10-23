
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Color complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Color">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Z" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Colorspace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Color")
public class Color {

    @XmlAttribute(name = "X", required = true)
    protected float x;
    @XmlAttribute(name = "Y", required = true)
    protected float y;
    @XmlAttribute(name = "Z", required = true)
    protected float z;
    @XmlAttribute(name = "Colorspace")
    @XmlSchemaType(name = "anyURI")
    protected String colorspace;

    /**
     * 获取x属性的值。
     * 
     */
    public float getX() {
        return x;
    }

    /**
     * 设置x属性的值。
     * 
     */
    public void setX(float value) {
        this.x = value;
    }

    /**
     * 获取y属性的值。
     * 
     */
    public float getY() {
        return y;
    }

    /**
     * 设置y属性的值。
     * 
     */
    public void setY(float value) {
        this.y = value;
    }

    /**
     * 获取z属性的值。
     * 
     */
    public float getZ() {
        return z;
    }

    /**
     * 设置z属性的值。
     * 
     */
    public void setZ(float value) {
        this.z = value;
    }

    /**
     * 获取colorspace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorspace() {
        return colorspace;
    }

    /**
     * 设置colorspace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorspace(String value) {
        this.colorspace = value;
    }

}
