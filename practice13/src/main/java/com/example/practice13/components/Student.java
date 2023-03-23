package com.example.practice13.components;

import jakarta.annotation.PostConstruct;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Student {
    @Value("${student.name}")
    private String name;

    @Value("${student.last_name}")
    private String lastName;

    @Value("${student.group}")
    private String group;

    @PostConstruct
    public void init(){
        System.out.println(this);
    }

}
