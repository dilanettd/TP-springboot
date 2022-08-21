package org.example.service;

import org.example.entity.Movie;
import org.example.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultMovieService implements IMovieService {
    public IMovieRepository getIMovieRepository() {
        return iMovieRepository;
    }

    public void setIMovieRepository(IMovieRepository iMovieRepository) {
        this.iMovieRepository = iMovieRepository;
    }
    @Autowired
    private IMovieRepository iMovieRepository;

    public void registerMovie(Movie movie){
        iMovieRepository.add(movie);
    }
}
