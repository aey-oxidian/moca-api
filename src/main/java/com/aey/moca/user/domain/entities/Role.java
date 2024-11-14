package com.aey.moca.user.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private String roleId;
    private String type;
    private String description;
    private Date createdAt;
    private Date updatedAt;
    private Boolean isActive;
}
