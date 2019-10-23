
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://www.onvif.org/ver10/schema}ItemList" minOccurs="0"/>
 *         &lt;element name="Key" type="{http://www.onvif.org/ver10/schema}ItemList" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.onvif.org/ver10/schema}ItemList" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}MessageExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UtcTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="PropertyOperation" type="{http://www.onvif.org/ver10/schema}PropertyOperation" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "source",
    "key",
    "data",
    "extension"
})
@XmlRootElement(name = "Message")
public class Message {

    @XmlElement(name = "Source")
    protected ItemList source;
    @XmlElement(name = "Key")
    protected ItemList key;
    @XmlElement(name = "Data")
    protected ItemList data;
    @XmlElement(name = "Extension")
    protected MessageExtension extension;
    @XmlAttribute(name = "UtcTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utcTime;
    @XmlAttribute(name = "PropertyOperation")
    protected PropertyOperation propertyOperation;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     */
    public void setSource(ItemList value) {
        this.source = value;
    }

    /**
     * 获取key属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getKey() {
        return key;
    }

    /**
     * 设置key属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     */
    public void setKey(ItemList value) {
        this.key = value;
    }

    /**
     * 获取data属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getData() {
        return data;
    }

    /**
     * 设置data属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     */
    public void setData(ItemList value) {
        this.data = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageExtension }
     *     
     */
    public MessageExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageExtension }
     *     
     */
    public void setExtension(MessageExtension value) {
        this.extension = value;
    }

    /**
     * 获取utcTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtcTime() {
        return utcTime;
    }

    /**
     * 设置utcTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtcTime(XMLGregorianCalendar value) {
        this.utcTime = value;
    }

    /**
     * 获取propertyOperation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyOperation }
     *     
     */
    public PropertyOperation getPropertyOperation() {
        return propertyOperation;
    }

    /**
     * 设置propertyOperation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyOperation }
     *     
     */
    public void setPropertyOperation(PropertyOperation value) {
        this.propertyOperation = value;
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
