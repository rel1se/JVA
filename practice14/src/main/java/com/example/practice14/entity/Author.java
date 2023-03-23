package com.example.practice14.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private String firstName, lastName, middleName, birthDate;

    @Override
    public String toString() {
        return "Author {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birth date='" + birthDate + '\'' +
                '}';
    }
}
