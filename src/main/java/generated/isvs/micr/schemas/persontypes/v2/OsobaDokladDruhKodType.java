//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvs.micr.schemas.persontypes.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * K�d pro ozna�en� druhu dokladu toto�nosti, pop�. druhu dokladu, podle kter�ho byla toto�nost zji�t�na. Uvede se ozna�en� v souladu s ��seln�kem.
 * 
 * <p>Java class for OsobaDokladDruhKodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OsobaDokladDruhKodType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:cz:isvs:micr:schemas:PersonTypes:c:AL0092:v1>OsobaDokladDruhKodContentType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OsobaDokladDruhKodType", propOrder = {
    "value"
})
public class OsobaDokladDruhKodType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;

    /**
     * K�d pro ozna�en� druhu dokladu toto�nosti, pop�. druhu dokladu, podle kter�ho byla toto�nost zji�t�na. Uvede se ozna�en� v souladu s ��seln�kem.
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

}
