package com.sunil.payload;

import lombok.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private Long id;

    private String firstName;

    private String lastName;

    private String otherName;

    private String gender;

    private String address;

    private String stateOfOrigin;

    private String accountNumber;

    private String email;

    private String password;

    private String phoneNumber;

    private String alternatePhoneNumber;

}
