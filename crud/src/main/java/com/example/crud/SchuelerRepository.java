package com.example.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchuelerRepository extends CrudRepository<schueler, Integer> {

}
