package data.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Person extends Entity{

    private final String firstName;
    private final String lastName;
}
