package org.example.controller;

import org.example.entity.Movie;
import org.example.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;
@Controller
public class MovieController {

    public IMovieService getMovieService() {
        return movieService;
    }

    public void setMovieService(IMovieService movieService) {
        this.movieService = movieService;
    }
    @Autowired
    private IMovieService movieService;

    public void addUsingConsole(){
        System.out.println( "Veillez saisir le titre du film!" );
        Scanner sc = new Scanner(System.in);
        String movieTitle = sc.nextLine();
        System.out.println( "Veillez saisir le genre du film!" );
        String movieGenre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(movieTitle);
        movie.setGenre(movieGenre);
        movieService.registerMovie(movie);
    }

}
