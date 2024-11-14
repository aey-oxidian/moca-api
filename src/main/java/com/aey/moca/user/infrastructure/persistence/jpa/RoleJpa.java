package com.aey.moca.user.infrastructure.persistence.jpa;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "t_rol01_roles")
public class RoleJpa {

    @Id
    @Column(name = "role_id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roleId;

    @Column(name = "role_tx_type", length = 45)
    private String type;

    @Column(name = "role_tx_create_at")
    private Date createdAt;

    @Column(name = "role_tx_update_at")
    private Date updatedAt;

    @Column(name = "role_tx_is_active")
    private Boolean isActive;
}
