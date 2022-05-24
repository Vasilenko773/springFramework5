package com.repository;

import com.domain.Programmer;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryProgrammer extends CrudRepository<Programmer, Integer> {
}
