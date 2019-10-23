
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BacklightCompensation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BacklightCompensation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}BacklightCompensationMode"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BacklightCompensation", propOrder = {
    "mode",
    "level"
})
public class BacklightCompensation {

    @XmlElement(name = "Mode", required = true)
    protected BacklightCompensationMode mode;
    @XmlElement(name = "Level")
    protected float level;

    /**
     * 获取mode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BacklightCompensationMode }
     *     
     */
    public BacklightCompensationMode getMode() {
        return mode;
    }

    /**
     * 设置mode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BacklightCompensationMode }
     *     
     */
    public void setMode(BacklightCompensationMode value) {
        this.mode = value;
    }

    /**
     * 获取level属性的值。
     * 
     */
    public float getLevel() {
        return level;
    }

    /**
     * 设置level属性的值。
     * 
     */
    public void setLevel(float value) {
        this.level = value;
    }

}
