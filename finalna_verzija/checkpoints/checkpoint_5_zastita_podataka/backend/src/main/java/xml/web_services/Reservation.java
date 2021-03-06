//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.20 at 12:34:48 PM CEST 
//


package xml.web_services;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for reservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agent" type="{http://xml/web-services}agent"/>
 *         &lt;element name="accomodation" type="{http://xml/web-services}accomodation"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numOfPersons">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;pattern value="[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="startDdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="endDdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "agent",
    "accomodation",
    "id",
    "serverId",
    "userId",
    "numOfPersons",
    "accepted",
    "price",
    "startDdate",
    "endDdate"
})
@Entity
public class Reservation {

	@ManyToOne
    @XmlElement(required = true)
    protected Agent agent;
	@ManyToOne
    @XmlElement(required = true)
    protected Accomodation accomodation;
	@Id
	@GeneratedValue
    protected long id;
    protected long serverId;
    protected long userId;
    protected int numOfPersons;
    protected boolean accepted;
    protected float price;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date startDdate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date endDdate;

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link Agent }
     *     
     */
    public Agent getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent }
     *     
     */
    public void setAgent(Agent value) {
        this.agent = value;
    }

    /**
     * Gets the value of the accomodation property.
     * 
     * @return
     *     possible object is
     *     {@link Accomodation }
     *     
     */
    public Accomodation getAccomodation() {
        return accomodation;
    }

    /**
     * Sets the value of the accomodation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accomodation }
     *     
     */
    public void setAccomodation(Accomodation value) {
        this.accomodation = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the serverId property.
     * 
     */
    public long getServerId() {
        return serverId;
    }

    /**
     * Sets the value of the serverId property.
     * 
     */
    public void setServerId(long value) {
        this.serverId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the numOfPersons property.
     * 
     */
    public int getNumOfPersons() {
        return numOfPersons;
    }

    /**
     * Sets the value of the numOfPersons property.
     * 
     */
    public void setNumOfPersons(int value) {
        this.numOfPersons = value;
    }

    /**
     * Gets the value of the accepted property.
     * 
     */
    public boolean isAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     */
    public void setAccepted(boolean value) {
        this.accepted = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Gets the value of the startDdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getStartDdate() {
        return startDdate;
    }

    /**
     * Sets the value of the startDdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDdate(Date value) {
        this.startDdate = value;
    }

    /**
     * Gets the value of the endDdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getEndDdate() {
        return endDdate;
    }

    /**
     * Sets the value of the endDdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDdate(Date value) {
        this.endDdate = value;
    }

}
