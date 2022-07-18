package data.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class Person extends Entity{

    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
