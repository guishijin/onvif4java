
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FocusMove complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FocusMove">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Absolute" type="{http://www.onvif.org/ver10/schema}AbsoluteFocus" minOccurs="0"/>
 *         &lt;element name="Relative" type="{http://www.onvif.org/ver10/schema}RelativeFocus" minOccurs="0"/>
 *         &lt;element name="Continuous" type="{http://www.onvif.org/ver10/schema}ContinuousFocus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FocusMove", propOrder = {
    "absolute",
    "relative",
    "continuous"
})
public class FocusMove {

    @XmlElement(name = "Absolute")
    protected AbsoluteFocus absolute;
    @XmlElement(name = "Relative")
    protected RelativeFocus relative;
    @XmlElement(name = "Continuous")
    protected ContinuousFocus continuous;

    /**
     * 获取absolute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteFocus }
     *     
     */
    public AbsoluteFocus getAbsolute() {
        return absolute;
    }

    /**
     * 设置absolute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteFocus }
     *     
     */
    public void setAbsolute(AbsoluteFocus value) {
        this.absolute = value;
    }

    /**
     * 获取relative属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelativeFocus }
     *     
     */
    public RelativeFocus getRelative() {
        return relative;
    }

    /**
     * 设置relative属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeFocus }
     *     
     */
    public void setRelative(RelativeFocus value) {
        this.relative = value;
    }

    /**
     * 获取continuous属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContinuousFocus }
     *     
     */
    public ContinuousFocus getContinuous() {
        return continuous;
    }

    /**
     * 设置continuous属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousFocus }
     *     
     */
    public void setContinuous(ContinuousFocus value) {
        this.continuous = value;
    }

}
