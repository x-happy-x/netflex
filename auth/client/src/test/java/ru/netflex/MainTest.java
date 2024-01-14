package ru.netflex;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import ru.netflex.server.auth.*;

import java.util.logging.Level;

import static org.junit.jupiter.api.Assertions.*;

@Log
class MainTest {

    @Test
    void clientTest() {
        WebServiceAuthorization webServiceAuthorization = new WebServiceAuthorization();
        AuthorisationService service = webServiceAuthorization.getAuthorizationPort();
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