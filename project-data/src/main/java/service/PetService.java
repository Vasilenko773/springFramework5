package service;

import model.pet.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(int id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
