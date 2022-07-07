package service;

import model.Owner;

import java.util.Set;

public interface OwnerService extends CRUDService<Owner, Integer> {

    Owner findByLastName(String LastName);

   /* Owner findById(Integer id);

    Owner save(Owner owner);

    Set<Owner> findAll();*/
}
