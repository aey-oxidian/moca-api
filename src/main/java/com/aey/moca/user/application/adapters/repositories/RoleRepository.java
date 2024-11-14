package com.aey.moca.user.application.adapters.repositories;

import com.aey.moca.user.infrastructure.persistence.jpa.RoleJpa;

import java.util.List;
import java.util.Optional;

public interface RoleRepository {
    List<RoleJpa> findAll();
    Optional<RoleJpa> create(Long id);
}
