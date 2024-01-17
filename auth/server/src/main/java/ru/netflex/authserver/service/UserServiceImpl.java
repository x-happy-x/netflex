package ru.netflex.authserver.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.netflex.authserver.entity.Role;
import ru.netflex.authserver.entity.User;
import ru.netflex.authserver.exception.InvalidPasswordException;
import ru.netflex.authserver.exception.InvalidUsernameException;
import ru.netflex.authserver.exception.UserAlreadyExistsException;
import ru.netflex.authserver.exception.UserNotFoundException;
import ru.netflex.authserver.repository.RoleRepository;
import ru.netflex.authserver.repository.UserRepository;
import ru.netflex.authserver.service.UserService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository,
                           RoleRepository roleRepository,
                           BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
        return user.orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    public User findById(Long userId) throws UserNotFoundException {
        Optional<User> user = userRepository.findById(userId);

        return user.orElseThrow(() -> new UserNotFoundException("User not found"));
        //return user.orElseGet(User::new);
    }

    public List<User> all() {
        return userRepository.findAll();
    }

    public User save(User user) throws UserAlreadyExistsException, InvalidUsernameException, InvalidPasswordException {
        if (user.getUsername().contains(".")) {
            throw new InvalidUsernameException("Username contains invalid symbols");
        }
        if (user.getPassword().contains(".")) {
            throw new InvalidPasswordException("Password contains invalid symbols");
        }
        Optional<User> optionalUser = userRepository.findByUsername(user.getUsername());

        if (optionalUser.isPresent()) throw new UserAlreadyExistsException("User already exists");
        Optional<Role> optionalRole = roleRepository.findByName("USER");
        Role role = optionalRole.orElse(new Role(1L, "USER"));
        user = userRepository.save(user);
        user.setRoles(Collections.singleton(role));
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }


    public boolean delete(Long userId) {
        if (userRepository.findById(userId).isPresent()) {
            userRepository.deleteById(userId);
            return true;
        }
        return false;
    }
}
