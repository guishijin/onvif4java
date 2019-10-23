
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>AnalyticsEngineControl complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AnalyticsEngineControl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       &lt;sequence>
 *         &lt;element name="EngineToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         &lt;element name="EngineConfigToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         &lt;element name="InputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded"/>
 *         &lt;element name="ReceiverToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded"/>
 *         &lt;element name="Multicast" type="{http://www.onvif.org/ver10/schema}MulticastConfiguration" minOccurs="0"/>
 *         &lt;element name="Subscription" type="{http://www.onvif.org/ver10/schema}Config"/>
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}ModeOfOperation"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AnalyticsEngineControl", propOrder = {
    "engineToken",
    "engineConfigToken",
    "inputToken",
    "receiverToken",
    "multicast",
    "subscription",
    "mode",
    "any"
})
public class AnalyticsEngineControl
    extends ConfigurationEntity
{

    @XmlElement(name = "EngineToken", required = true)
    protected String engineToken;
    @XmlElement(name = "EngineConfigToken", required = true)
    protected String engineConfigToken;
    @XmlElement(name = "InputToken", required = true)
    protected List<String> inputToken;
    @XmlElement(name = "ReceiverToken", required = true)
    protected List<String> receiverToken;
    @XmlElement(name = "Multicast")
    protected MulticastConfiguration multicast;
    @XmlElement(name = "Subscription", required = true)
    protected Config subscription;
    @XmlElement(name = "Mode", required = true)
    protected ModeOfOperation mode;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取engineToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineToken() {
        return engineToken;
    }

    /**
     * 设置engineToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineToken(String value) {
        this.engineToken = value;
    }

    /**
     * 获取engineConfigToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineConfigToken() {
        return engineConfigToken;
    }

    /**
     * 设置engineConfigToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineConfigToken(String value) {
        this.engineConfigToken = value;
    }

    /**
     * Gets the value of the inputToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInputToken() {
        if (inputToken == null) {
            inputToken = new ArrayList<String>();
        }
        return this.inputToken;
    }

    /**
     * Gets the value of the receiverToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiverToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiverToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReceiverToken() {
        if (receiverToken == null) {
            receiverToken = new ArrayList<String>();
        }
        return this.receiverToken;
    }

    /**
     * 获取multicast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MulticastConfiguration }
     *     
     */
    public MulticastConfiguration getMulticast() {
        return multicast;
    }

    /**
     * 设置multicast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MulticastConfiguration }
     *     
     */
    public void setMulticast(MulticastConfiguration value) {
        this.multicast = value;
    }

    /**
     * 获取subscription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Config }
     *     
     */
    public Config getSubscription() {
        return subscription;
    }

    /**
     * 设置subscription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Config }
     *     
     */
    public void setSubscription(Config value) {
        this.subscription = value;
    }

    /**
     * 获取mode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ModeOfOperation }
     *     
     */
    public ModeOfOperation getMode() {
        return mode;
    }

    /**
     * 设置mode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ModeOfOperation }
     *     
     */
    public void setMode(ModeOfOperation value) {
        this.mode = value;
    }

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
     * {@link java.lang.Object }
     * {@link Element }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
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
