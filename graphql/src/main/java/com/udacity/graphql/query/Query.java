package com.udacity.graphql.query;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.udacity.graphql.entity.Dog;
import com.udacity.graphql.repository.DogRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Query implements GraphQLResolver {
    private DogRepository dogRepository;
    public Query(DogRepository dogRepository){
        this.dogRepository=dogRepository;
    }
    private List<String> findDogBreeds(){
        return dogRepository.findAllBreed();
    }
    private Optional<Dog> findDogBreedById(Long id){
        return dogRepository.findById(id);
    }
    private List<String>findAllDogNames(){
        return dogRepository.findAllDogNames();
    }

}
