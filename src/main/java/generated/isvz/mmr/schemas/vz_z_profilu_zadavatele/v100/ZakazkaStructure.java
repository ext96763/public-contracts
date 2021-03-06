//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvz.mmr.schemas.vz_z_profilu_zadavatele.v100;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import generated.isvs.micr.schemas.commontypes.v1.URLType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ZakazkaStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZakazkaStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vz" type="{urn:cz:isvz:mmr:schemas:vz-z-profilu-zadavatele:v100}VZStructure"/>
 *         &lt;element name="uchazec" type="{urn:cz:isvz:mmr:schemas:vz-z-profilu-zadavatele:v100}UchazecStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dodavatel" type="{urn:cz:isvz:mmr:schemas:vz-z-profilu-zadavatele:v100}DodavatelStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="url_zakazky" type="{urn:cz:isvs:micr:schemas:CommonTypes:v1}URLType" minOccurs="0"/>
 *         &lt;element name="url_zakazky_xml" type="{urn:cz:isvs:micr:schemas:CommonTypes:v1}URLType" minOccurs="0"/>
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZakazkaStructure", propOrder = {
    "vz",
    "uchazec",
    "dodavatel",
    "urlZakazky",
    "urlZakazkyXml",
    "any"
})
public class ZakazkaStructure {

    @XmlElement(required = true)
    protected VZStructure vz;
    protected List<UchazecStructure> uchazec;
    protected List<DodavatelStructure> dodavatel;
    @XmlElement(name = "url_zakazky")
    protected URLType urlZakazky;
    @XmlElement(name = "url_zakazky_xml")
    protected URLType urlZakazkyXml;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the vz property.
     * 
     * @return
     *     possible object is
     *     {@link VZStructure }
     *     
     */
    public VZStructure getVz() {
        return vz;
    }

    /**
     * Sets the value of the vz property.
     * 
     * @param value
     *     allowed object is
     *     {@link VZStructure }
     *     
     */
    public void setVz(VZStructure value) {
        this.vz = value;
    }

    /**
     * Gets the value of the uchazec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uchazec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUchazec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UchazecStructure }
     * 
     * 
     */
    public List<UchazecStructure> getUchazec() {
        if (uchazec == null) {
            uchazec = new ArrayList<UchazecStructure>();
        }
        return this.uchazec;
    }

    /**
     * Gets the value of the dodavatel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dodavatel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDodavatel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DodavatelStructure }
     * 
     * 
     */
    public List<DodavatelStructure> getDodavatel() {
        if (dodavatel == null) {
            dodavatel = new ArrayList<DodavatelStructure>();
        }
        return this.dodavatel;
    }

    /**
     * Gets the value of the urlZakazky property.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getUrlZakazky() {
        return urlZakazky;
    }

    /**
     * Sets the value of the urlZakazky property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setUrlZakazky(URLType value) {
        this.urlZakazky = value;
    }

    /**
     * Gets the value of the urlZakazkyXml property.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getUrlZakazkyXml() {
        return urlZakazkyXml;
    }

    /**
     * Sets the value of the urlZakazkyXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setUrlZakazkyXml(URLType value) {
        this.urlZakazkyXml = value;
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
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

}
