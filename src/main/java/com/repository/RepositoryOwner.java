package com.repository;

import com.domain.ProductOwner;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryOwner extends CrudRepository<ProductOwner, Integer> {
}
