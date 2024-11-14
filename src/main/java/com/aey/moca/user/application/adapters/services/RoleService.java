package com.aey.moca.user.application.adapters.services;

import com.aey.moca.user.infrastructure.rest.dtos.role.RoleDTO;
import io.vavr.control.Either;

public interface RoleService {
    Either<RoleDTO, Error> getAllRoles();
    Either<RoleDTO, Error> postRole(RoleDTO role);
}
