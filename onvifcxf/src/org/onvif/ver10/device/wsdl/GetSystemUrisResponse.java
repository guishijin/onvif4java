
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SystemLogUriList;
import org.w3c.dom.Element;


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
 *         &lt;element name="SystemLogUris" type="{http://www.onvif.org/ver10/schema}SystemLogUriList" minOccurs="0"/>
 *         &lt;element name="SupportInfoUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="SystemBackupUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Extension" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "systemLogUris",
    "supportInfoUri",
    "systemBackupUri",
    "extension"
})
@XmlRootElement(name = "GetSystemUrisResponse")
public class GetSystemUrisResponse {

    @XmlElement(name = "SystemLogUris")
    protected SystemLogUriList systemLogUris;
    @XmlElement(name = "SupportInfoUri")
    @XmlSchemaType(name = "anyURI")
    protected String supportInfoUri;
    @XmlElement(name = "SystemBackupUri")
    @XmlSchemaType(name = "anyURI")
    protected String systemBackupUri;
    @XmlElement(name = "Extension")
    protected GetSystemUrisResponse.Extension extension;

    /**
     * 获取systemLogUris属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SystemLogUriList }
     *     
     */
    public SystemLogUriList getSystemLogUris() {
        return systemLogUris;
    }

    /**
     * 设置systemLogUris属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SystemLogUriList }
     *     
     */
    public void setSystemLogUris(SystemLogUriList value) {
        this.systemLogUris = value;
    }

    /**
     * 获取supportInfoUri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportInfoUri() {
        return supportInfoUri;
    }

    /**
     * 设置supportInfoUri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportInfoUri(String value) {
        this.supportInfoUri = value;
    }

    /**
     * 获取systemBackupUri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemBackupUri() {
        return systemBackupUri;
    }

    /**
     * 设置systemBackupUri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemBackupUri(String value) {
        this.systemBackupUri = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetSystemUrisResponse.Extension }
     *     
     */
    public GetSystemUrisResponse.Extension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetSystemUrisResponse.Extension }
     *     
     */
    public void setExtension(GetSystemUrisResponse.Extension value) {
        this.extension = value;
    }


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
     *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Extension {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link Element }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
