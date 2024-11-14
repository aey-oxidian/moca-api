package com.aey.moca.user.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String addressId;
    private String countryId;
    private String cityId;
    private String street;
    private String number;
    private String zipCode;
    private Date createdAt;
    private Date updatedAt;
    private Boolean isActive;
}
