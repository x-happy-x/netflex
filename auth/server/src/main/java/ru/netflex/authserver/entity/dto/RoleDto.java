package ru.netflex.authserver.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netflex.authserver.entity.Role;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {
    private Long id;
    private String name;

    public static RoleDto fromRole(Role role) {
        return new RoleDto(role.getId(), role.getName());
    }

    public static Role toRole(RoleDto dto) {
        Role role = new Role();
        role.setId(dto.getId());
        role.setName(dto.getName());
        return role;
    }
}
