package service;

import model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String LastName);

    Owner findById(int id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
