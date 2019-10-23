
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2004._08.xop.include.Include;


/**
 * <p>AttachmentData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AttachmentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2004/08/xop/include}Include"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/2005/05/xmlmime}contentType"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentData", propOrder = {
    "include"
})
public class AttachmentData {

    @XmlElement(name = "Include", namespace = "http://www.w3.org/2004/08/xop/include", required = true)
    protected Include include;
    @XmlAttribute(name = "contentType", namespace = "http://www.w3.org/2005/05/xmlmime")
    protected String contentType;

    /**
     * 获取include属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Include }
     *     
     */
    public Include getInclude() {
        return include;
    }

    /**
     * 设置include属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Include }
     *     
     */
    public void setInclude(Include value) {
        this.include = value;
    }

    /**
     * 获取contentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * 设置contentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

}
