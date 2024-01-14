
package ru.netflex.server.auth;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.netflex.server.auth package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Authorization_QNAME = new QName("http://web.service.authserver.netflex.ru/", "authorization");
    private static final QName _AuthorizationResponse_QNAME = new QName("http://web.service.authserver.netflex.ru/", "authorizationResponse");
    private static final QName _Registration_QNAME = new QName("http://web.service.authserver.netflex.ru/", "registration");
    private static final QName _RegistrationResponse_QNAME = new QName("http://web.service.authserver.netflex.ru/", "registrationResponse");
    private static final QName _UsernameNotFoundException_QNAME = new QName("http://web.service.authserver.netflex.ru/", "UsernameNotFoundException");
    private static final QName _InvalidPasswordException_QNAME = new QName("http://web.service.authserver.netflex.ru/", "InvalidPasswordException");
    private static final QName _UserAlreadyExistsException_QNAME = new QName("http://web.service.authserver.netflex.ru/", "UserAlreadyExistsException");
    private static final QName _InvalidUsernameException_QNAME = new QName("http://web.service.authserver.netflex.ru/", "InvalidUsernameException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.netflex.server.auth
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Authorization }
     * 
     * @return
     *     the new instance of {@link Authorization }
     */
    public Authorization createAuthorization() {
        return new Authorization();
    }

    /**
     * Create an instance of {@link AuthorizationResponse }
     * 
     * @return
     *     the new instance of {@link AuthorizationResponse }
     */
    public AuthorizationResponse createAuthorizationResponse() {
        return new AuthorizationResponse();
    }

    /**
     * Create an instance of {@link Registration }
     * 
     * @return
     *     the new instance of {@link Registration }
     */
    public Registration createRegistration() {
        return new Registration();
    }

    /**
     * Create an instance of {@link RegistrationResponse }
     * 
     * @return
     *     the new instance of {@link RegistrationResponse }
     */
    public RegistrationResponse createRegistrationResponse() {
        return new RegistrationResponse();
    }

    /**
     * Create an instance of {@link UsernameNotFoundException }
     * 
     * @return
     *     the new instance of {@link UsernameNotFoundException }
     */
    public UsernameNotFoundException createUsernameNotFoundException() {
        return new UsernameNotFoundException();
    }

    /**
     * Create an instance of {@link InvalidPasswordException }
     * 
     * @return
     *     the new instance of {@link InvalidPasswordException }
     */
    public InvalidPasswordException createInvalidPasswordException() {
        return new InvalidPasswordException();
    }

    /**
     * Create an instance of {@link UserAlreadyExistsException }
     * 
     * @return
     *     the new instance of {@link UserAlreadyExistsException }
     */
    public UserAlreadyExistsException createUserAlreadyExistsException() {
        return new UserAlreadyExistsException();
    }

    /**
     * Create an instance of {@link InvalidUsernameException }
     * 
     * @return
     *     the new instance of {@link InvalidUsernameException }
     */
    public InvalidUsernameException createInvalidUsernameException() {
        return new InvalidUsernameException();
    }

    /**
     * Create an instance of {@link UserAuthorizationDto }
     * 
     * @return
     *     the new instance of {@link UserAuthorizationDto }
     */
    public UserAuthorizationDto createUserAuthorizationDto() {
        return new UserAuthorizationDto();
    }

    /**
     * Create an instance of {@link UserDto }
     * 
     * @return
     *     the new instance of {@link UserDto }
     */
    public UserDto createUserDto() {
        return new UserDto();
    }

    /**
     * Create an instance of {@link LocalDateTime }
     * 
     * @return
     *     the new instance of {@link LocalDateTime }
     */
    public LocalDateTime createLocalDateTime() {
        return new LocalDateTime();
    }

    /**
     * Create an instance of {@link RoleDto }
     * 
     * @return
     *     the new instance of {@link RoleDto }
     */
    public RoleDto createRoleDto() {
        return new RoleDto();
    }

    /**
     * Create an instance of {@link UserRegistrationDto }
     * 
     * @return
     *     the new instance of {@link UserRegistrationDto }
     */
    public UserRegistrationDto createUserRegistrationDto() {
        return new UserRegistrationDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authorization }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Authorization }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.authserver.netflex.ru/", name = "authorization")
    public JAXBElement<Authorization> createAuthorization(Authorization value) {
        return new JAXBElement<>(_Authorization_QNAME, Authorization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthorizationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.authserver.netflex.ru/", name = "authorizationResponse")
    public JAXBElement<AuthorizationResponse> createAuthorizationResponse(AuthorizationResponse value) {
        return new JAXBElement<>(_AuthorizationResponse_QNAME, AuthorizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Registration }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.authserver.netflex.ru/", name = "registration")
    public JAXBElement<Registration> createRegistration(Registration value) {
        return new JAXBElement<>(_Registration_QNAME, Registration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.authserver.netflex.ru/", name = "registrationResponse")
    public JAXBElement<RegistrationResponse> createRegistrationResponse(RegistrationResponse value) {
        return new JAXBElement<>(_RegistrationResponse_QNAME, RegistrationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsernameNotFoundException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsernameNotFoundException }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.authserver.netflex.ru/", name = "UsernameNotFoundException")
    public JAXBElement<UsernameNotFoundException> createUsernameNotFoundException(UsernameNotFoundException value) {
        return new JAXBElement<>(_UsernameNotFoundException_QNAME, UsernameNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidPasswordException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidPasswordException }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.authserver.netflex.ru/", name = "InvalidPasswordException")
    public JAXBElement<InvalidPasswordException> createInvalidPasswordException(InvalidPasswordException value) {
        return new JAXBElement<>(_InvalidPasswordException_QNAME, InvalidPasswordException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAlreadyExistsException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserAlreadyExistsException }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.authserver.netflex.ru/", name = "UserAlreadyExistsException")
    public JAXBElement<UserAlreadyExistsException> createUserAlreadyExistsException(UserAlreadyExistsException value) {
        return new JAXBElement<>(_UserAlreadyExistsException_QNAME, UserAlreadyExistsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidUsernameException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidUsernameException }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.authserver.netflex.ru/", name = "InvalidUsernameException")
    public JAXBElement<InvalidUsernameException> createInvalidUsernameException(InvalidUsernameException value) {
        return new JAXBElement<>(_InvalidUsernameException_QNAME, InvalidUsernameException.class, null, value);
    }

}
