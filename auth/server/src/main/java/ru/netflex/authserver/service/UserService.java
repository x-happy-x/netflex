package ru.netflex.authserver.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.netflex.authserver.entity.User;
import ru.netflex.authserver.exception.InvalidPasswordException;
import ru.netflex.authserver.exception.InvalidUsernameException;
import ru.netflex.authserver.exception.UserAlreadyExistsException;
import ru.netflex.authserver.exception.UserNotFoundException;

import java.util.List;


public interface UserService extends UserDetailsService {
    User findById(Long userId) throws UserNotFoundException;

    List<User> all();

    User save(User user) throws UserAlreadyExistsException, InvalidUsernameException, InvalidPasswordException;

    boolean delete(Long userId);
}
