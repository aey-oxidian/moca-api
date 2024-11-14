package com.aey.moca.user.infrastructure.persistence.dao;

import com.aey.moca.user.application.adapters.repositories.RoleRepository;
import com.aey.moca.user.infrastructure.persistence.jpa.RoleJpa;

import java.util.List;
import java.util.Optional;

public class RoleDao implements RoleRepository {
    @Override
    public List<RoleJpa> findAll() {
        return List.of();
    }

    @Override
    public Optional<RoleJpa> create(Long id) {
        return Optional.empty();
    }
}
