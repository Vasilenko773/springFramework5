package com.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String language;

    @ManyToMany
    @JoinTable(name = "programmer_software", joinColumns = @JoinColumn(name = "program_id"),
            inverseJoinColumns = @JoinColumn(name = "programmer_id"))
    private Set<Programmer> programmers;

    public Program() {
    }

    public Program(String title, String language, Set<Programmer> programmers) {
        this.title = title;
        this.language = language;
        this.programmers = programmers;
    }
}
