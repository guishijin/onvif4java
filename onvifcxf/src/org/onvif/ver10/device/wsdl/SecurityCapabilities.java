
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>SecurityCapabilities complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SecurityCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="TLS1.0" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TLS1.1" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TLS1.2" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OnboardKeyGeneration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AccessPolicyConfig" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DefaultAccessPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Dot1X" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RemoteUserHandling" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="X.509Token" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SAMLToken" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="KerberosToken" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="UsernameToken" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="HttpDigest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RELToken" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SupportedEAPMethods" type="{http://www.onvif.org/ver10/device/wsdl}EAPMethodTypes" />
 *       &lt;attribute name="MaxUsers" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MaxUserNameLength" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MaxPasswordLength" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilities")
public class SecurityCapabilities {

    @XmlAttribute(name = "TLS1.0")
    protected Boolean tls10;
    @XmlAttribute(name = "TLS1.1")
    protected Boolean tls11;
    @XmlAttribute(name = "TLS1.2")
    protected Boolean tls12;
    @XmlAttribute(name = "OnboardKeyGeneration")
    protected Boolean onboardKeyGeneration;
    @XmlAttribute(name = "AccessPolicyConfig")
    protected Boolean accessPolicyConfig;
    @XmlAttribute(name = "DefaultAccessPolicy")
    protected Boolean defaultAccessPolicy;
    @XmlAttribute(name = "Dot1X")
    protected Boolean dot1X;
    @XmlAttribute(name = "RemoteUserHandling")
    protected Boolean remoteUserHandling;
    @XmlAttribute(name = "X.509Token")
    protected Boolean x509Token;
    @XmlAttribute(name = "SAMLToken")
    protected Boolean samlToken;
    @XmlAttribute(name = "KerberosToken")
    protected Boolean kerberosToken;
    @XmlAttribute(name = "UsernameToken")
    protected Boolean usernameToken;
    @XmlAttribute(name = "HttpDigest")
    protected Boolean httpDigest;
    @XmlAttribute(name = "RELToken")
    protected Boolean relToken;
    @XmlAttribute(name = "SupportedEAPMethods")
    protected List<Integer> supportedEAPMethods;
    @XmlAttribute(name = "MaxUsers")
    protected Integer maxUsers;
    @XmlAttribute(name = "MaxUserNameLength")
    protected Integer maxUserNameLength;
    @XmlAttribute(name = "MaxPasswordLength")
    protected Integer maxPasswordLength;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取tls10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTLS10() {
        return tls10;
    }

    /**
     * 设置tls10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTLS10(Boolean value) {
        this.tls10 = value;
    }

    /**
     * 获取tls11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTLS11() {
        return tls11;
    }

    /**
     * 设置tls11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTLS11(Boolean value) {
        this.tls11 = value;
    }

    /**
     * 获取tls12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTLS12() {
        return tls12;
    }

    /**
     * 设置tls12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTLS12(Boolean value) {
        this.tls12 = value;
    }

    /**
     * 获取onboardKeyGeneration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnboardKeyGeneration() {
        return onboardKeyGeneration;
    }

    /**
     * 设置onboardKeyGeneration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnboardKeyGeneration(Boolean value) {
        this.onboardKeyGeneration = value;
    }

    /**
     * 获取accessPolicyConfig属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessPolicyConfig() {
        return accessPolicyConfig;
    }

    /**
     * 设置accessPolicyConfig属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessPolicyConfig(Boolean value) {
        this.accessPolicyConfig = value;
    }

    /**
     * 获取defaultAccessPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultAccessPolicy() {
        return defaultAccessPolicy;
    }

    /**
     * 设置defaultAccessPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultAccessPolicy(Boolean value) {
        this.defaultAccessPolicy = value;
    }

    /**
     * 获取dot1X属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDot1X() {
        return dot1X;
    }

    /**
     * 设置dot1X属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDot1X(Boolean value) {
        this.dot1X = value;
    }

    /**
     * 获取remoteUserHandling属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoteUserHandling() {
        return remoteUserHandling;
    }

    /**
     * 设置remoteUserHandling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteUserHandling(Boolean value) {
        this.remoteUserHandling = value;
    }

    /**
     * 获取x509Token属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isX509Token() {
        return x509Token;
    }

    /**
     * 设置x509Token属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setX509Token(Boolean value) {
        this.x509Token = value;
    }

    /**
     * 获取samlToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSAMLToken() {
        return samlToken;
    }

    /**
     * 设置samlToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSAMLToken(Boolean value) {
        this.samlToken = value;
    }

    /**
     * 获取kerberosToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKerberosToken() {
        return kerberosToken;
    }

    /**
     * 设置kerberosToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKerberosToken(Boolean value) {
        this.kerberosToken = value;
    }

    /**
     * 获取usernameToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsernameToken() {
        return usernameToken;
    }

    /**
     * 设置usernameToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsernameToken(Boolean value) {
        this.usernameToken = value;
    }

    /**
     * 获取httpDigest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHttpDigest() {
        return httpDigest;
    }

    /**
     * 设置httpDigest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHttpDigest(Boolean value) {
        this.httpDigest = value;
    }

    /**
     * 获取relToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRELToken() {
        return relToken;
    }

    /**
     * 设置relToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRELToken(Boolean value) {
        this.relToken = value;
    }

    /**
     * Gets the value of the supportedEAPMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedEAPMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedEAPMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSupportedEAPMethods() {
        if (supportedEAPMethods == null) {
            supportedEAPMethods = new ArrayList<Integer>();
        }
        return this.supportedEAPMethods;
    }

    /**
     * 获取maxUsers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxUsers() {
        return maxUsers;
    }

    /**
     * 设置maxUsers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxUsers(Integer value) {
        this.maxUsers = value;
    }

    /**
     * 获取maxUserNameLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxUserNameLength() {
        return maxUserNameLength;
    }

    /**
     * 设置maxUserNameLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxUserNameLength(Integer value) {
        this.maxUserNameLength = value;
    }

    /**
     * 获取maxPasswordLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPasswordLength() {
        return maxPasswordLength;
    }

    /**
     * 设置maxPasswordLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPasswordLength(Integer value) {
        this.maxPasswordLength = value;
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
