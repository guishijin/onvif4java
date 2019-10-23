
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
 * Representation of a physical video input.
 * 
 * <p>VideoSource complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VideoSource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}DeviceEntity">
 *       &lt;sequence>
 *         &lt;element name="Framerate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Resolution" type="{http://www.onvif.org/ver10/schema}VideoResolution"/>
 *         &lt;element name="Imaging" type="{http://www.onvif.org/ver10/schema}ImagingSettings" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoSourceExtension" minOccurs="0"/>
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
@XmlType(name = "VideoSource", propOrder = {
    "framerate",
    "resolution",
    "imaging",
    "extension"
})
public class VideoSource
    extends DeviceEntity
{

    @XmlElement(name = "Framerate")
    protected float framerate;
    @XmlElement(name = "Resolution", required = true)
    protected VideoResolution resolution;
    @XmlElement(name = "Imaging")
    protected ImagingSettings imaging;
    @XmlElement(name = "Extension")
    protected VideoSourceExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取framerate属性的值。
     * 
     */
    public float getFramerate() {
        return framerate;
    }

    /**
     * 设置framerate属性的值。
     * 
     */
    public void setFramerate(float value) {
        this.framerate = value;
    }

    /**
     * 获取resolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoResolution }
     *     
     */
    public VideoResolution getResolution() {
        return resolution;
    }

    /**
     * 设置resolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoResolution }
     *     
     */
    public void setResolution(VideoResolution value) {
        this.resolution = value;
    }

    /**
     * 获取imaging属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImagingSettings }
     *     
     */
    public ImagingSettings getImaging() {
        return imaging;
    }

    /**
     * 设置imaging属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingSettings }
     *     
     */
    public void setImaging(ImagingSettings value) {
        this.imaging = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoSourceExtension }
     *     
     */
    public VideoSourceExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSourceExtension }
     *     
     */
    public void setExtension(VideoSourceExtension value) {
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
