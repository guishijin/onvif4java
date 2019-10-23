
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>AnalyticsEngineInputInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AnalyticsEngineInputInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InputInfo" type="{http://www.onvif.org/ver10/schema}Config" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}AnalyticsEngineInputInfoExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticsEngineInputInfo", propOrder = {
    "inputInfo",
    "extension"
})
public class AnalyticsEngineInputInfo {

    @XmlElement(name = "InputInfo")
    protected Config inputInfo;
    @XmlElement(name = "Extension")
    protected AnalyticsEngineInputInfoExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取inputInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Config }
     *     
     */
    public Config getInputInfo() {
        return inputInfo;
    }

    /**
     * 设置inputInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Config }
     *     
     */
    public void setInputInfo(Config value) {
        this.inputInfo = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsEngineInputInfoExtension }
     *     
     */
    public AnalyticsEngineInputInfoExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsEngineInputInfoExtension }
     *     
     */
    public void setExtension(AnalyticsEngineInputInfoExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
