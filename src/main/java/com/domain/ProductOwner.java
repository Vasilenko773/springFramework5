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
@Table(name = "product_owners")
public class ProductOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany
    @JoinTable(name = "owner_programs", joinColumns = @JoinColumn(name = "product_owner_id"),
            inverseJoinColumns = @JoinColumn(name = "program_id"))
    private Set<Program> programs = new HashSet<>();

    public ProductOwner() {
    }

    public ProductOwner(String name) {
        this.name = name;
    }
}
