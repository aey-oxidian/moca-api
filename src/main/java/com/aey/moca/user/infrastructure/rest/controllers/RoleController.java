package com.aey.moca.user.infrastructure.rest.controllers;

import com.aey.moca.user.infrastructure.rest.dtos.role.RoleDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/roles")
public class RoleController {

    @GET
    public Response getRoles() {
        return null;
    }
}
