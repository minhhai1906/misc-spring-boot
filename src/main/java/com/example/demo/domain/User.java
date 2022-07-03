package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String fullName;
    private int age;
    private boolean employed;
    private String gender;

    public User() {
    }

    public User(String fullName, int age, boolean employed, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.employed = employed;
        this.gender = gender;
    }
}
