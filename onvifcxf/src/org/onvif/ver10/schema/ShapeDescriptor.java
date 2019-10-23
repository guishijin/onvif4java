
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>ShapeDescriptor complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShapeDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoundingBox" type="{http://www.onvif.org/ver10/schema}Rectangle"/>
 *         &lt;element name="CenterOfGravity" type="{http://www.onvif.org/ver10/schema}Vector"/>
 *         &lt;element name="Polygon" type="{http://www.onvif.org/ver10/schema}Polygon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ShapeDescriptorExtension" minOccurs="0"/>
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
@XmlType(name = "ShapeDescriptor", propOrder = {
    "boundingBox",
    "centerOfGravity",
    "polygon",
    "extension"
})
public class ShapeDescriptor {

    @XmlElement(name = "BoundingBox", required = true)
    protected Rectangle boundingBox;
    @XmlElement(name = "CenterOfGravity", required = true)
    protected Vector centerOfGravity;
    @XmlElement(name = "Polygon")
    protected List<Polygon> polygon;
    @XmlElement(name = "Extension")
    protected ShapeDescriptorExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取boundingBox属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Rectangle }
     *     
     */
    public Rectangle getBoundingBox() {
        return boundingBox;
    }

    /**
     * 设置boundingBox属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Rectangle }
     *     
     */
    public void setBoundingBox(Rectangle value) {
        this.boundingBox = value;
    }

    /**
     * 获取centerOfGravity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Vector }
     *     
     */
    public Vector getCenterOfGravity() {
        return centerOfGravity;
    }

    /**
     * 设置centerOfGravity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Vector }
     *     
     */
    public void setCenterOfGravity(Vector value) {
        this.centerOfGravity = value;
    }

    /**
     * Gets the value of the polygon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polygon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolygon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Polygon }
     * 
     * 
     */
    public List<Polygon> getPolygon() {
        if (polygon == null) {
            polygon = new ArrayList<Polygon>();
        }
        return this.polygon;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShapeDescriptorExtension }
     *     
     */
    public ShapeDescriptorExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShapeDescriptorExtension }
     *     
     */
    public void setExtension(ShapeDescriptorExtension value) {
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
