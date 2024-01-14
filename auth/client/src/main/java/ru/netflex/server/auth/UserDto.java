
package ru.netflex.server.auth;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="userDto">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="accountExpirationDate" type="{http://web.service.authserver.netflex.ru/}localDateTime" minOccurs="0"/>
 *         <element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="passwordExpirationDate" type="{http://web.service.authserver.netflex.ru/}localDateTime" minOccurs="0"/>
 *         <element name="roles" type="{http://web.service.authserver.netflex.ru/}roleDto" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userDto", propOrder = {
    "accountExpirationDate",
    "active",
    "id",
    "locked",
    "passwordExpirationDate",
    "roles",
    "username"
})
public class UserDto {

    protected LocalDateTime accountExpirationDate;
    protected boolean active;
    protected Long id;
    protected boolean locked;
    protected LocalDateTime passwordExpirationDate;
    @XmlElement(nillable = true)
    protected List<RoleDto> roles;
    protected String username;

    /**
     * Gets the value of the accountExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getAccountExpirationDate() {
        return accountExpirationDate;
    }

    /**
     * Sets the value of the accountExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setAccountExpirationDate(LocalDateTime value) {
        this.accountExpirationDate = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
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
     * Gets the value of the locked property.
     * 
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     */
    public void setLocked(boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the passwordExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getPasswordExpirationDate() {
        return passwordExpirationDate;
    }

    /**
     * Sets the value of the passwordExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setPasswordExpirationDate(LocalDateTime value) {
        this.passwordExpirationDate = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleDto }
     * 
     * 
     * @return
     *     The value of the roles property.
     */
    public List<RoleDto> getRoles() {
        if (roles == null) {
            roles = new ArrayList<>();
        }
        return this.roles;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
