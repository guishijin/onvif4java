
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Time complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Time">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Second" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Time", propOrder = {
    "hour",
    "minute",
    "second"
})
public class Time {

    @XmlElement(name = "Hour")
    protected int hour;
    @XmlElement(name = "Minute")
    protected int minute;
    @XmlElement(name = "Second")
    protected int second;

    /**
     * 获取hour属性的值。
     * 
     */
    public int getHour() {
        return hour;
    }

    /**
     * 设置hour属性的值。
     * 
     */
    public void setHour(int value) {
        this.hour = value;
    }

    /**
     * 获取minute属性的值。
     * 
     */
    public int getMinute() {
        return minute;
    }

    /**
     * 设置minute属性的值。
     * 
     */
    public void setMinute(int value) {
        this.minute = value;
    }

    /**
     * 获取second属性的值。
     * 
     */
    public int getSecond() {
        return second;
    }

    /**
     * 设置second属性的值。
     * 
     */
    public void setSecond(int value) {
        this.second = value;
    }

}
