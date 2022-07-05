package model.pet;

import model.Owner;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Pet {

    private Type type;
    private Owner owner;
    private String name;
}