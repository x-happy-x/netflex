package ru.netflex.authserver.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netflex.authserver.entity.User;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class UserRegistrationDto {
    private String username;
    private String password;

    public static UserRegistrationDto fromUser(User user) {
        UserRegistrationDto dto = new UserRegistrationDto();
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        return dto;
    }

    public static User toUser(UserRegistrationDto dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        return user;
    }
}
