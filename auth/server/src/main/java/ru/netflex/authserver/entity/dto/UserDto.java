package ru.netflex.authserver.entity.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netflex.authserver.entity.Role;
import ru.netflex.authserver.entity.User;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private Set<RoleDto> roles;
    private boolean active;
    private boolean locked;
    private LocalDateTime accountExpirationDate;
    private LocalDateTime passwordExpirationDate;

    public static UserDto fromUser(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setActive(user.isActive());
        dto.setLocked(user.isLocked());
        dto.setAccountExpirationDate(user.getAccountExpirationDate());
        dto.setPasswordExpirationDate(user.getPasswordExpirationDate());
        dto.setRoles(user.getRoles().stream().map(RoleDto::fromRole).collect(Collectors.toSet()));
        return dto;
    }

    public static User toUser(UserDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setUsername(dto.getUsername());
        user.setActive(dto.isActive());
        user.setLocked(dto.isLocked());
        user.setAccountExpirationDate(dto.getAccountExpirationDate());
        user.setPasswordExpirationDate(dto.getPasswordExpirationDate());
        user.setRoles(dto.getRoles().stream().map(RoleDto::toRole).collect(Collectors.toSet()));
        return user;
    }
}
