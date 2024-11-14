package com.aey.moca.user.domain.entities;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userId;
    private String name;
    private String firstSurname;
    private String secondSurname;
    private LocalDate birthDate;
    private Date createdAt;
    private Date updatedAt;
    private Boolean isActive;
    private String roleId;
    private String accountId;
    private String genderId;
}
