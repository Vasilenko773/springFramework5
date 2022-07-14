package data.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Owner extends Person {

    public Owner(Integer id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
