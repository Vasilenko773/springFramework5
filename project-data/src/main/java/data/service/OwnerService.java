package data.service;

import data.model.Owner;

public interface OwnerService extends CRUDService<Owner, Integer> {

    Owner findByLastName(String LastName);

   /* Owner findById(Integer id);

    Owner save(Owner owner);

    Set<Owner> findAll();*/
}
