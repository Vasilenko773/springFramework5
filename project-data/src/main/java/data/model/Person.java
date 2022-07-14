package data.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class Person extends Entity{

    private final String firstName;
    private final String lastName;

    public Person(Integer id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
