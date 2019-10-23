
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MoveOptions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MoveOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Absolute" type="{http://www.onvif.org/ver10/schema}AbsoluteFocusOptions" minOccurs="0"/>
 *         &lt;element name="Relative" type="{http://www.onvif.org/ver10/schema}RelativeFocusOptions" minOccurs="0"/>
 *         &lt;element name="Continuous" type="{http://www.onvif.org/ver10/schema}ContinuousFocusOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveOptions", propOrder = {
    "absolute",
    "relative",
    "continuous"
})
public class MoveOptions {

    @XmlElement(name = "Absolute")
    protected AbsoluteFocusOptions absolute;
    @XmlElement(name = "Relative")
    protected RelativeFocusOptions relative;
    @XmlElement(name = "Continuous")
    protected ContinuousFocusOptions continuous;

    /**
     * 获取absolute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteFocusOptions }
     *     
     */
    public AbsoluteFocusOptions getAbsolute() {
        return absolute;
    }

    /**
     * 设置absolute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteFocusOptions }
     *     
     */
    public void setAbsolute(AbsoluteFocusOptions value) {
        this.absolute = value;
    }

    /**
     * 获取relative属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelativeFocusOptions }
     *     
     */
    public RelativeFocusOptions getRelative() {
        return relative;
    }

    /**
     * 设置relative属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeFocusOptions }
     *     
     */
    public void setRelative(RelativeFocusOptions value) {
        this.relative = value;
    }

    /**
     * 获取continuous属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContinuousFocusOptions }
     *     
     */
    public ContinuousFocusOptions getContinuous() {
        return continuous;
    }

    /**
     * 设置continuous属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousFocusOptions }
     *     
     */
    public void setContinuous(ContinuousFocusOptions value) {
        this.continuous = value;
    }

}
