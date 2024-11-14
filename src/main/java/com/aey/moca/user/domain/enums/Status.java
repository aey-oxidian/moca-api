package com.aey.moca.user.domain.enums;

import lombok.Getter;

@Getter
public enum Status {

    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    BLOCKED("BLOCKED"),
    RESTRICTED("RESTRICTED"),
    DELETED("DELETED");

    private final String value;
    Status(String value) {
        this.value = value;
    }
}
