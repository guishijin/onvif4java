
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Range of values greater equal Min value and less equal Max value.
 * 
 * <p>FloatRange complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FloatRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Min" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatRange", propOrder = {
    "min",
    "max"
})
public class FloatRange {

    @XmlElement(name = "Min")
    protected float min;
    @XmlElement(name = "Max")
    protected float max;

    /**
     * 获取min属性的值。
     * 
     */
    public float getMin() {
        return min;
    }

    /**
     * 设置min属性的值。
     * 
     */
    public void setMin(float value) {
        this.min = value;
    }

    /**
     * 获取max属性的值。
     * 
     */
    public float getMax() {
        return max;
    }

    /**
     * 设置max属性的值。
     * 
     */
    public void setMax(float value) {
        this.max = value;
    }

}
