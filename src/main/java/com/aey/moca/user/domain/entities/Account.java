package com.aey.moca.user.domain.entities;

import com.aey.moca.user.domain.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String accountId;
    private String nickname;
    private String email;
    private String backupEmail;
    private String password;
    private String mobilePhone;
    private String phoneNumber;
    private Status status;
    private List<Map<String, String>> images;
    private Date createdAt;
    private Date updatedAt;
    private Boolean isActive;
}
