package com.authentic.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserContact {

    private String cpf;

    private LocalDate birthDate;
}
