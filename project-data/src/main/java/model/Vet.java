package model;

import lombok.Getter;

@Getter
public class Vet extends Person {

    public Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }
}