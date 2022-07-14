package data.model;

import lombok.Getter;

@Getter
public class Vet extends Person {

    public Vet(Integer id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
