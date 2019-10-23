
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;


/**
 * <p>PTZConfiguration complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PTZConfiguration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       &lt;sequence>
 *         &lt;element name="NodeToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         &lt;element name="DefaultAbsolutePantTiltPositionSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="DefaultAbsoluteZoomPositionSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="DefaultRelativePanTiltTranslationSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="DefaultRelativeZoomTranslationSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="DefaultContinuousPanTiltVelocitySpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="DefaultContinuousZoomVelocitySpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="DefaultPTZSpeed" type="{http://www.onvif.org/ver10/schema}PTZSpeed" minOccurs="0"/>
 *         &lt;element name="DefaultPTZTimeout" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="PanTiltLimits" type="{http://www.onvif.org/ver10/schema}PanTiltLimits" minOccurs="0"/>
 *         &lt;element name="ZoomLimits" type="{http://www.onvif.org/ver10/schema}ZoomLimits" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZConfigurationExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MoveRamp" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PresetRamp" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PresetTourRamp" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZConfiguration", propOrder = {
    "nodeToken",
    "defaultAbsolutePantTiltPositionSpace",
    "defaultAbsoluteZoomPositionSpace",
    "defaultRelativePanTiltTranslationSpace",
    "defaultRelativeZoomTranslationSpace",
    "defaultContinuousPanTiltVelocitySpace",
    "defaultContinuousZoomVelocitySpace",
    "defaultPTZSpeed",
    "defaultPTZTimeout",
    "panTiltLimits",
    "zoomLimits",
    "extension"
})
public class PTZConfiguration
    extends ConfigurationEntity
{

    @XmlElement(name = "NodeToken", required = true)
    protected String nodeToken;
    @XmlElement(name = "DefaultAbsolutePantTiltPositionSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultAbsolutePantTiltPositionSpace;
    @XmlElement(name = "DefaultAbsoluteZoomPositionSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultAbsoluteZoomPositionSpace;
    @XmlElement(name = "DefaultRelativePanTiltTranslationSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultRelativePanTiltTranslationSpace;
    @XmlElement(name = "DefaultRelativeZoomTranslationSpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultRelativeZoomTranslationSpace;
    @XmlElement(name = "DefaultContinuousPanTiltVelocitySpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultContinuousPanTiltVelocitySpace;
    @XmlElement(name = "DefaultContinuousZoomVelocitySpace")
    @XmlSchemaType(name = "anyURI")
    protected String defaultContinuousZoomVelocitySpace;
    @XmlElement(name = "DefaultPTZSpeed")
    protected PTZSpeed defaultPTZSpeed;
    @XmlElement(name = "DefaultPTZTimeout")
    protected Duration defaultPTZTimeout;
    @XmlElement(name = "PanTiltLimits")
    protected PanTiltLimits panTiltLimits;
    @XmlElement(name = "ZoomLimits")
    protected ZoomLimits zoomLimits;
    @XmlElement(name = "Extension")
    protected PTZConfigurationExtension extension;
    @XmlAttribute(name = "MoveRamp")
    protected Integer moveRamp;
    @XmlAttribute(name = "PresetRamp")
    protected Integer presetRamp;
    @XmlAttribute(name = "PresetTourRamp")
    protected Integer presetTourRamp;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取nodeToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeToken() {
        return nodeToken;
    }

    /**
     * 设置nodeToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeToken(String value) {
        this.nodeToken = value;
    }

    /**
     * 获取defaultAbsolutePantTiltPositionSpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAbsolutePantTiltPositionSpace() {
        return defaultAbsolutePantTiltPositionSpace;
    }

    /**
     * 设置defaultAbsolutePantTiltPositionSpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAbsolutePantTiltPositionSpace(String value) {
        this.defaultAbsolutePantTiltPositionSpace = value;
    }

    /**
     * 获取defaultAbsoluteZoomPositionSpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAbsoluteZoomPositionSpace() {
        return defaultAbsoluteZoomPositionSpace;
    }

    /**
     * 设置defaultAbsoluteZoomPositionSpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAbsoluteZoomPositionSpace(String value) {
        this.defaultAbsoluteZoomPositionSpace = value;
    }

    /**
     * 获取defaultRelativePanTiltTranslationSpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRelativePanTiltTranslationSpace() {
        return defaultRelativePanTiltTranslationSpace;
    }

    /**
     * 设置defaultRelativePanTiltTranslationSpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRelativePanTiltTranslationSpace(String value) {
        this.defaultRelativePanTiltTranslationSpace = value;
    }

    /**
     * 获取defaultRelativeZoomTranslationSpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRelativeZoomTranslationSpace() {
        return defaultRelativeZoomTranslationSpace;
    }

    /**
     * 设置defaultRelativeZoomTranslationSpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRelativeZoomTranslationSpace(String value) {
        this.defaultRelativeZoomTranslationSpace = value;
    }

    /**
     * 获取defaultContinuousPanTiltVelocitySpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultContinuousPanTiltVelocitySpace() {
        return defaultContinuousPanTiltVelocitySpace;
    }

    /**
     * 设置defaultContinuousPanTiltVelocitySpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultContinuousPanTiltVelocitySpace(String value) {
        this.defaultContinuousPanTiltVelocitySpace = value;
    }

    /**
     * 获取defaultContinuousZoomVelocitySpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultContinuousZoomVelocitySpace() {
        return defaultContinuousZoomVelocitySpace;
    }

    /**
     * 设置defaultContinuousZoomVelocitySpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultContinuousZoomVelocitySpace(String value) {
        this.defaultContinuousZoomVelocitySpace = value;
    }

    /**
     * 获取defaultPTZSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZSpeed }
     *     
     */
    public PTZSpeed getDefaultPTZSpeed() {
        return defaultPTZSpeed;
    }

    /**
     * 设置defaultPTZSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpeed }
     *     
     */
    public void setDefaultPTZSpeed(PTZSpeed value) {
        this.defaultPTZSpeed = value;
    }

    /**
     * 获取defaultPTZTimeout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDefaultPTZTimeout() {
        return defaultPTZTimeout;
    }

    /**
     * 设置defaultPTZTimeout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDefaultPTZTimeout(Duration value) {
        this.defaultPTZTimeout = value;
    }

    /**
     * 获取panTiltLimits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PanTiltLimits }
     *     
     */
    public PanTiltLimits getPanTiltLimits() {
        return panTiltLimits;
    }

    /**
     * 设置panTiltLimits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PanTiltLimits }
     *     
     */
    public void setPanTiltLimits(PanTiltLimits value) {
        this.panTiltLimits = value;
    }

    /**
     * 获取zoomLimits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ZoomLimits }
     *     
     */
    public ZoomLimits getZoomLimits() {
        return zoomLimits;
    }

    /**
     * 设置zoomLimits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ZoomLimits }
     *     
     */
    public void setZoomLimits(ZoomLimits value) {
        this.zoomLimits = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZConfigurationExtension }
     *     
     */
    public PTZConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZConfigurationExtension }
     *     
     */
    public void setExtension(PTZConfigurationExtension value) {
        this.extension = value;
    }

    /**
     * 获取moveRamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoveRamp() {
        return moveRamp;
    }

    /**
     * 设置moveRamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMoveRamp(Integer value) {
        this.moveRamp = value;
    }

    /**
     * 获取presetRamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPresetRamp() {
        return presetRamp;
    }

    /**
     * 设置presetRamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPresetRamp(Integer value) {
        this.presetRamp = value;
    }

    /**
     * 获取presetTourRamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPresetTourRamp() {
        return presetTourRamp;
    }

    /**
     * 设置presetTourRamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPresetTourRamp(Integer value) {
        this.presetTourRamp = value;
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
