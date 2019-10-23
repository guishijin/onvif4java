
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
 * <p>RecordingJobStateSource complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RecordingJobStateSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceToken" type="{http://www.onvif.org/ver10/schema}SourceReference"/>
 *         &lt;element name="State" type="{http://www.onvif.org/ver10/schema}RecordingJobState"/>
 *         &lt;element name="Tracks" type="{http://www.onvif.org/ver10/schema}RecordingJobStateTracks"/>
 *         &lt;any processContents='lax' namespace='http://www.onvif.org/ver10/schema' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RecordingJobStateSource", propOrder = {
    "sourceToken",
    "state",
    "tracks",
    "any"
})
public class RecordingJobStateSource {

    @XmlElement(name = "SourceToken", required = true)
    protected SourceReference sourceToken;
    @XmlElement(name = "State", required = true)
    protected String state;
    @XmlElement(name = "Tracks", required = true)
    protected RecordingJobStateTracks tracks;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * ��ȡsourceToken���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SourceReference }
     *     
     */
    public SourceReference getSourceToken() {
        return sourceToken;
    }

    /**
     * ����sourceToken���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SourceReference }
     *     
     */
    public void setSourceToken(SourceReference value) {
        this.sourceToken = value;
    }

    /**
     * ��ȡstate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * ����state���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * ��ȡtracks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordingJobStateTracks }
     *     
     */
    public RecordingJobStateTracks getTracks() {
        return tracks;
    }

    /**
     * ����tracks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingJobStateTracks }
     *     
     */
    public void setTracks(RecordingJobStateTracks value) {
        this.tracks = value;
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