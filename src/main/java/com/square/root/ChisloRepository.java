package com.square.root;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChisloRepository extends CrudRepository<Chislo, Long> {
}
