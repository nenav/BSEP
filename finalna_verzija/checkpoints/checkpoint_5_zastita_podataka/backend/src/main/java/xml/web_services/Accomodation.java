//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.20 at 12:09:54 AM CEST 
//


package xml.web_services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accomodation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accomodation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agent" type="{http://xml/web-services}agent"/>
 *         &lt;element name="address" type="{http://xml/web-services}Adress"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numOfPersons">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;pattern value="[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accomodationType" type="{http://xml/web-services}accomodation-type"/>
 *         &lt;element name="accomodationCategory" type="{http://xml/web-services}accomodation-category"/>
 *         &lt;element name="pricePlan" type="{http://xml/web-services}PricePlan"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="images" type="{http://xml/web-services}Images" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="wifi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="halfBoard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fullBoard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tv" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="kitchen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="privateBathroom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accomodation", propOrder = {
    "agent",
    "address",
    "name",
    "description",
    "numOfPersons",
    "accomodationType",
    "accomodationCategory",
    "pricePlan",
    "id",
    "images",
    "parking",
    "wifi",
    "breakfast",
    "halfBoard",
    "fullBoard",
    "tv",
    "kitchen",
    "privateBathroom",
    "rate"
})
@Entity
public class Accomodation implements Comparable<Accomodation>{

	@ManyToOne
    @XmlElement(required = true)
    protected Agent agent;
    @XmlElement(required = true)
    @ManyToOne
    protected Adress address;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    protected int numOfPersons;
    @XmlElement(required = true)
    @ManyToOne
    protected AccomodationType accomodationType;
    @XmlElement(required = true)
    @ManyToOne
    protected AccomodationCategory accomodationCategory;
    @ManyToOne
    @XmlElement(required = true)
    protected PricePlan pricePlan;
    @Id
    @GeneratedValue
    protected long id;
    @OneToMany(fetch = FetchType.EAGER)
    protected List<Images> images;
    protected boolean parking;
    protected boolean wifi;
    protected boolean breakfast;
    protected boolean halfBoard;
    protected boolean fullBoard;
    protected boolean tv;
    protected boolean kitchen;
    protected boolean privateBathroom;
    protected float rate;

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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Adress }
     *     
     */
    public Adress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adress }
     *     
     */
    public void setAddress(Adress value) {
        this.address = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the accomodationType property.
     * 
     * @return
     *     possible object is
     *     {@link AccomodationType }
     *     
     */
    public AccomodationType getAccomodationType() {
        return accomodationType;
    }

    /**
     * Sets the value of the accomodationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccomodationType }
     *     
     */
    public void setAccomodationType(AccomodationType value) {
        this.accomodationType = value;
    }

    /**
     * Gets the value of the accomodationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AccomodationCategory }
     *     
     */
    public AccomodationCategory getAccomodationCategory() {
        return accomodationCategory;
    }

    /**
     * Sets the value of the accomodationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccomodationCategory }
     *     
     */
    public void setAccomodationCategory(AccomodationCategory value) {
        this.accomodationCategory = value;
    }

    /**
     * Gets the value of the pricePlan property.
     * 
     * @return
     *     possible object is
     *     {@link PricePlan }
     *     
     */
    public PricePlan getPricePlan() {
        return pricePlan;
    }

    /**
     * Sets the value of the pricePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricePlan }
     *     
     */
    public void setPricePlan(PricePlan value) {
        this.pricePlan = value;
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
     * Gets the value of the images property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the images property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Images }
     * 
     * 
     */
    public List<Images> getImages() {
        if (images == null) {
            images = new ArrayList<Images>();
        }
        return this.images;
    }

    /**
     * Gets the value of the parking property.
     * 
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Sets the value of the parking property.
     * 
     */
    public void setParking(boolean value) {
        this.parking = value;
    }

    /**
     * Gets the value of the wifi property.
     * 
     */
    public boolean isWifi() {
        return wifi;
    }

    /**
     * Sets the value of the wifi property.
     * 
     */
    public void setWifi(boolean value) {
        this.wifi = value;
    }

    /**
     * Gets the value of the breakfast property.
     * 
     */
    public boolean isBreakfast() {
        return breakfast;
    }

    /**
     * Sets the value of the breakfast property.
     * 
     */
    public void setBreakfast(boolean value) {
        this.breakfast = value;
    }

    /**
     * Gets the value of the halfBoard property.
     * 
     */
    public boolean isHalfBoard() {
        return halfBoard;
    }

    /**
     * Sets the value of the halfBoard property.
     * 
     */
    public void setHalfBoard(boolean value) {
        this.halfBoard = value;
    }

    /**
     * Gets the value of the fullBoard property.
     * 
     */
    public boolean isFullBoard() {
        return fullBoard;
    }

    /**
     * Sets the value of the fullBoard property.
     * 
     */
    public void setFullBoard(boolean value) {
        this.fullBoard = value;
    }

    /**
     * Gets the value of the tv property.
     * 
     */
    public boolean isTv() {
        return tv;
    }

    /**
     * Sets the value of the tv property.
     * 
     */
    public void setTv(boolean value) {
        this.tv = value;
    }

    /**
     * Gets the value of the kitchen property.
     * 
     */
    public boolean isKitchen() {
        return kitchen;
    }

    /**
     * Sets the value of the kitchen property.
     * 
     */
    public void setKitchen(boolean value) {
        this.kitchen = value;
    }

    /**
     * Gets the value of the privateBathroom property.
     * 
     */
    public boolean isPrivateBathroom() {
        return privateBathroom;
    }

    /**
     * Sets the value of the privateBathroom property.
     * 
     */
    public void setPrivateBathroom(boolean value) {
        this.privateBathroom = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     */
    public float getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     */
    public void setRate(float value) {
        this.rate = value;
    }

	@Override
	public int compareTo(Accomodation o) {
		// TODO Auto-generated method stub
		return 0;
	}

}