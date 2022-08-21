package org.example.repository.memory;

import org.example.entity.Movie;
import org.example.repository.IMovieRepository;
import org.springframework.stereotype.Repository;

//@Repository
public class MemoryMovieRepository implements IMovieRepository {

    public void add(Movie movie){
        System.out.println("The movie"+movie.getTitle()+" has been added.");
    }
}
