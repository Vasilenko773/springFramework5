package data.model;

import data.model.pet.Pet;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Visit {

    private LocalDate date;
    private String description;
    private Pet pet;
}
