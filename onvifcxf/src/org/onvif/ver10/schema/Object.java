
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
 * <p>Object complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Object">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}ObjectId">
 *       &lt;sequence>
 *         &lt;element name="Appearance" type="{http://www.onvif.org/ver10/schema}Appearance" minOccurs="0"/>
 *         &lt;element name="Behaviour" type="{http://www.onvif.org/ver10/schema}Behaviour" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ObjectExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Object", propOrder = {
    "appearance",
    "behaviour",
    "extension"
})
public class Object
    extends ObjectId
{

    @XmlElement(name = "Appearance")
    protected Appearance appearance;
    @XmlElement(name = "Behaviour")
    protected Behaviour behaviour;
    @XmlElement(name = "Extension")
    protected ObjectExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取appearance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Appearance }
     *     
     */
    public Appearance getAppearance() {
        return appearance;
    }

    /**
     * 设置appearance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Appearance }
     *     
     */
    public void setAppearance(Appearance value) {
        this.appearance = value;
    }

    /**
     * 获取behaviour属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Behaviour }
     *     
     */
    public Behaviour getBehaviour() {
        return behaviour;
    }

    /**
     * 设置behaviour属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Behaviour }
     *     
     */
    public void setBehaviour(Behaviour value) {
        this.behaviour = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ObjectExtension }
     *     
     */
    public ObjectExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectExtension }
     *     
     */
    public void setExtension(ObjectExtension value) {
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
