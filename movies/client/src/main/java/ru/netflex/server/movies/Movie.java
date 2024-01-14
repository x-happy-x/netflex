
package ru.netflex.server.movies;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for movie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="movie">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ageLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="countries" type="{http://service.moviesserver.netflex.ru/}country" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="director" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="genres" type="{http://service.moviesserver.netflex.ru/}genre" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="releaseYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="titles" type="{http://service.moviesserver.netflex.ru/}title" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movie", propOrder = {
    "ageLimit",
    "countries",
    "director",
    "genres",
    "id",
    "releaseYear",
    "titles"
})
public class Movie {

    protected int ageLimit;
    @XmlElement(nillable = true)
    protected List<Country> countries;
    protected String director;
    @XmlElement(nillable = true)
    protected List<Genre> genres;
    protected Long id;
    protected int releaseYear;
    @XmlElement(nillable = true)
    protected List<Title> titles;

    /**
     * Gets the value of the ageLimit property.
     * 
     */
    public int getAgeLimit() {
        return ageLimit;
    }

    /**
     * Sets the value of the ageLimit property.
     * 
     */
    public void setAgeLimit(int value) {
        this.ageLimit = value;
    }

    /**
     * Gets the value of the countries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the countries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Country }
     * 
     * 
     * @return
     *     The value of the countries property.
     */
    public List<Country> getCountries() {
        if (countries == null) {
            countries = new ArrayList<>();
        }
        return this.countries;
    }

    /**
     * Gets the value of the director property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector() {
        return director;
    }

    /**
     * Sets the value of the director property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector(String value) {
        this.director = value;
    }

    /**
     * Gets the value of the genres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the genres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Genre }
     * 
     * 
     * @return
     *     The value of the genres property.
     */
    public List<Genre> getGenres() {
        if (genres == null) {
            genres = new ArrayList<>();
        }
        return this.genres;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the releaseYear property.
     * 
     */
    public int getReleaseYear() {
        return releaseYear;
    }

    /**
     * Sets the value of the releaseYear property.
     * 
     */
    public void setReleaseYear(int value) {
        this.releaseYear = value;
    }

    /**
     * Gets the value of the titles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the titles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Title }
     * 
     * 
     * @return
     *     The value of the titles property.
     */
    public List<Title> getTitles() {
        if (titles == null) {
            titles = new ArrayList<>();
        }
        return this.titles;
    }

}
