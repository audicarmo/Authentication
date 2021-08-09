package com.authentic.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserContactResponse {

    private String email;

    private List<PhoneUser> phones;
}
