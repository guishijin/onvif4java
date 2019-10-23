
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type defining the common properties of a configuration.
 * 
 * <p>ConfigurationEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ConfigurationEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.onvif.org/ver10/schema}Name"/>
 *         &lt;element name="UseCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationEntity", propOrder = {
    "name",
    "useCount"
})
@XmlSeeAlso({
    AudioSourceConfiguration.class,
    PTZConfiguration.class,
    VideoSourceConfiguration.class,
    AudioEncoderConfiguration.class,
    VideoEncoderConfiguration.class,
    AudioDecoderConfiguration.class,
    VideoAnalyticsConfiguration.class,
    AudioOutputConfiguration.class,
    MetadataConfiguration.class,
    AnalyticsEngineInput.class,
    VideoEncoder2Configuration.class,
    AudioEncoder2Configuration.class,
    AnalyticsEngineControl.class,
    AnalyticsEngine.class,
    VideoOutputConfiguration.class
})
public class ConfigurationEntity {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "UseCount")
    protected int useCount;
    @XmlAttribute(name = "token", required = true)
    protected String token;

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡuseCount���Ե�ֵ��
     * 
     */
    public int getUseCount() {
        return useCount;
    }

    /**
     * ����useCount���Ե�ֵ��
     * 
     */
    public void setUseCount(int value) {
        this.useCount = value;
    }

    /**
     * ��ȡtoken���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * ����token���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}