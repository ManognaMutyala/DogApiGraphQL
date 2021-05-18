package com.udacity.graphql.query;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.udacity.graphql.entity.Dog;
import com.udacity.graphql.exception.DogNotFoundException;
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
    public Iterable<Dog> findDogBreeds(){
        return dogRepository.findAll();
    }
    public Dog findDogBreedById(Long id){
        Optional<Dog> optionalDog= dogRepository.findById(id);
        if(optionalDog.isPresent()){
            return optionalDog.get();
        }
        else
        {
            throw new DogNotFoundException("Dog not found",id);
        }
    }
//    private List<String>findAllDogNames(){
//        return dogRepository.findAllDogNames();
//    }

}
