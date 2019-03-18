package com.hyecheon.cardatabase.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountCredentials {
    private String username;
    private String password;
}
