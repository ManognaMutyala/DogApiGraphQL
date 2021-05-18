package com.udacity.graphql.repository;

import com.udacity.graphql.entity.Dog;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Long> {

}
