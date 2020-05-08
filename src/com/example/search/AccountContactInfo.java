
package com.example.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountContactInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountContactInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountContactPublicId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountContactInfo", propOrder = {
    "accountContactName",
    "accountContactPublicId"
})
public class AccountContactInfo {

    @XmlElement(name = "AccountContactName")
    protected String accountContactName;
    @XmlElement(name = "AccountContactPublicId")
    protected String accountContactPublicId;

    /**
     * Gets the value of the accountContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountContactName() {
        return accountContactName;
    }

    /**
     * Sets the value of the accountContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountContactName(String value) {
        this.accountContactName = value;
    }

    /**
     * Gets the value of the accountContactPublicId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountContactPublicId() {
        return accountContactPublicId;
    }

    /**
     * Sets the value of the accountContactPublicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountContactPublicId(String value) {
        this.accountContactPublicId = value;
    }

}
