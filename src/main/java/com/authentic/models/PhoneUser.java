package com.authentic.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PhoneUser {

    private String ddd;

    private LocalDate dateChange;

    private LocalDate inclusionDate;

    private String number;

    private TypePhoneUser type;
}
