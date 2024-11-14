package com.aey.moca.user.domain.enums;

import lombok.Getter;

@Getter
public enum Roles {

    ADMIN_ROLE("ADMIN_ROLE"),
    MANAGER_ROLE("MANAGER_ROLE"),
    EMPLOYEE_ROLE("EMPLOYEE_ROLE"),
    CUSTOMER_ROLE("CUSTOMER_ROLE"),
    GUESTS_ROLE("GUESTS_ROLE");

    private final String type;
    Roles(String type) {
        this.type = type;
    }
}
