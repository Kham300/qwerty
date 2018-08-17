package ru.ursip.webservice.mgsn.workplace.model.passport.generated;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocContent" type="{http://xmlns.oracle.com/MSG_PassportObject}PassportObject"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "docContent"
})
@XmlRootElement(name = "DocData", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
public class DocData {

    @XmlElement(name = "DocContent", namespace = "http://xmlns.oracle.com/MSG_PassportObject", required = true)
    protected PassportObject docContent;

    /**
     * Gets the value of the docContent property.
     *
     * @return possible object is
     * {@link PassportObject }
     */
    public PassportObject getDocContent() {
        return docContent;
    }

    /**
     * Sets the value of the docContent property.
     *
     * @param value allowed object is
     *              {@link PassportObject }
     */
    public void setDocContent(PassportObject value) {
        this.docContent = value;
    }

}
