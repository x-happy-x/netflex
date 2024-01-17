package ru.netflex.authserver.service.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.netflex.authserver.entity.dto.UserAuthorizationDto;
import ru.netflex.authserver.entity.dto.UserDto;
import ru.netflex.authserver.entity.dto.UserRegistrationDto;
import ru.netflex.authserver.exception.InvalidPasswordException;
import ru.netflex.authserver.exception.InvalidUsernameException;
import ru.netflex.authserver.exception.UserAlreadyExistsException;


@WebService
public interface AuthorisationService {
    @WebMethod
    UserDto registration(UserRegistrationDto user) throws UserAlreadyExistsException, InvalidUsernameException, InvalidPasswordException;

    @WebMethod
    UserDto authorization(UserAuthorizationDto user) throws UsernameNotFoundException, InvalidPasswordException;
}
