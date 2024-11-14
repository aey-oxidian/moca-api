package com.aey.moca.user.application.implementations;

import com.aey.moca.user.application.adapters.services.RoleService;
import com.aey.moca.user.infrastructure.rest.dtos.role.RoleDTO;
import io.vavr.control.Either;

public class RoleUseCase implements RoleService {

    @Override
    public Either<RoleDTO, Error> getAllRoles() {
        return null;
    }

    @Override
    public Either<RoleDTO, Error> postRole(RoleDTO role) {
        return null;
    }
}
