
package ares;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * IO organizace nebo fyzick osoby s atributem
 * 
 * <p>Java class for ico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ico">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2>icoSimpleType">
 *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="zdroj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zdroj_type" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ico", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "value"
})
public class Ico {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "dod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute(name = "ddo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;
    @XmlAttribute(name = "zdroj")
    protected ZdrojType zdroj;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the dod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDod() {
        return dod;
    }

    /**
     * Sets the value of the dod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDod(XMLGregorianCalendar value) {
        this.dod = value;
    }

    /**
     * Gets the value of the ddo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDdo() {
        return ddo;
    }

    /**
     * Sets the value of the ddo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDdo(XMLGregorianCalendar value) {
        this.ddo = value;
    }

    /**
     * Gets the value of the zdroj property.
     * 
     * @return
     *     possible object is
     *     {@link ZdrojType }
     *     
     */
    public ZdrojType getZdroj() {
        return zdroj;
    }

    /**
     * Sets the value of the zdroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZdrojType }
     *     
     */
    public void setZdroj(ZdrojType value) {
        this.zdroj = value;
    }

}