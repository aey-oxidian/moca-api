package com.aey.moca.user.infrastructure.rest.dtos.role;

import com.aey.moca.user.domain.entities.Role;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class RoleDTO {
    private String roleId;
    private String type;
    private String description;
    private Date createdAt;
    private Date updatedAt;
    private Boolean isActive;

    public static RoleDTO fromEntity(Role role) {
        return RoleDTO.builder()
                .roleId(role.getRoleId())
                .type(role.getType())
                .description(role.getDescription())
                .createdAt(role.getCreatedAt())
                .updatedAt(role.getUpdatedAt())
                .isActive(role.getIsActive())
                .build();
    }
}
