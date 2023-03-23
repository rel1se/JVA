package com.example.practice14.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private String name;
    private String creationDate;

    @Override
    public String toString() {
        return "Book {" + "book name = " + name + '\'' +
                ", creation date='" + creationDate + '\'' +
                "}";
    }
}
