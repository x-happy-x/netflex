package ru.netflex.authserver.service.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.netflex.authserver.entity.User;
import ru.netflex.authserver.entity.dto.UserAuthorizationDto;
import ru.netflex.authserver.entity.dto.UserDto;
import ru.netflex.authserver.entity.dto.UserRegistrationDto;
import ru.netflex.authserver.exception.InvalidPasswordException;
import ru.netflex.authserver.exception.InvalidUsernameException;
import ru.netflex.authserver.exception.UserAlreadyExistsException;
import ru.netflex.authserver.service.UserService;

@Service
@WebService(serviceName = "WebServiceAuthorization", portName = "AuthorizationPort", targetNamespace = "http://auth.netflex.ru")
public class AuthorisationServiceImpl implements AuthorisationService {

    private final UserService service;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public AuthorisationServiceImpl(UserService service, BCryptPasswordEncoder passwordEncoder) {
        this.service = service;
        this.passwordEncoder = passwordEncoder;
    }

    @WebMethod
    public UserDto registration(UserRegistrationDto user) throws UserAlreadyExistsException, InvalidUsernameException, InvalidPasswordException {
        return UserDto.fromUser(service.save(UserRegistrationDto.toUser(user)));
    }

    @WebMethod
    public UserDto authorization(UserAuthorizationDto user) throws UsernameNotFoundException, InvalidPasswordException {
        UserDetails userDetails = service.loadUserByUsername(user.getUsername());
        if (user.getPassword().equals(passwordEncoder.encode(user.getPassword()))) {
            throw new InvalidPasswordException("Invalid password");
        }
        return UserDto.fromUser((User) userDetails);
    }
}
