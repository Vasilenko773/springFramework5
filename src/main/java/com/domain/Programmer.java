package com.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Programmer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String programLanguage;

    @ManyToMany(mappedBy = "programmers")
    private Set<Program> programs = new HashSet<>();

    public Programmer() {
    }

    public Programmer(String name, String programLanguage) {
        this.name = name;
        this.programLanguage = programLanguage;
    }

    public Programmer(String name, Set<Program> programs) {
        this.name = name;
        this.programs = programs;
    }

    public void addProgram(Program program) {
        this.programs.add(program);
    }
}
