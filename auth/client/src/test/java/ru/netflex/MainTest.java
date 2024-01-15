package ru.netflex;

import lombok.extern.java.Log;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.netflex.server.auth.*;

import java.util.logging.Level;

import static org.junit.jupiter.api.Assertions.*;

@Log
class MainTest {
    private static AuthorisationService service;

    @BeforeAll
    static void getAuthService() {
        WebServiceAuthorization webServiceAuthorization = new WebServiceAuthorization();
        service = webServiceAuthorization.getAuthorizationPort();
    }

    @Test
    void clientRegistrationTest() {
        try {
            UserRegistrationDto userRegistrationDto = new UserRegistrationDto();
            userRegistrationDto.setUsername("Name2");
            userRegistrationDto.setPassword("Password2");
            UserDto user = service.registration(userRegistrationDto);
            log.info("User: " + user.getUsername());
            log.info(user.getRoles().get(0).getName());
        } catch (InvalidPasswordException_Exception | InvalidUsernameException_Exception |
                 UserAlreadyExistsException_Exception e) {
            log.log(Level.WARNING, e::getLocalizedMessage);
        }
    }

    @Test
    void clientAuthorizationTest() {
        try {
            UserAuthorizationDto userAuthorizationDto = new UserAuthorizationDto();
            userAuthorizationDto.setUsername("Name");
            userAuthorizationDto.setPassword("Password");
            UserDto user = service.authorization(userAuthorizationDto);
            log.info("User: " + user.getUsername());
            log.info(user.getRoles().get(0).getName());
        } catch (InvalidPasswordException_Exception | UsernameNotFoundException_Exception e) {
            log.log(Level.WARNING, e::getLocalizedMessage);
        }
    }
}