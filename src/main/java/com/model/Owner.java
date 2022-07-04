package com.model;

import lombok.Getter;

@Getter
public class Owner extends Person{

    public Owner(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
