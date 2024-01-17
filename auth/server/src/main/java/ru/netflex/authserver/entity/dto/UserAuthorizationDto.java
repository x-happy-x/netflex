package ru.netflex.authserver.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netflex.authserver.entity.User;

@Data
@NoArgsConstructor
public class UserAuthorizationDto {
    private String username;
    private String password;

    public static UserAuthorizationDto fromUser(User user) {
        UserAuthorizationDto dto = new UserAuthorizationDto();
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        return dto;
    }

    public static User toUser(UserAuthorizationDto dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        return user;
    }
}
