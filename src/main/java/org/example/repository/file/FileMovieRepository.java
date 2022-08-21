package org.example.repository.file;

import org.example.entity.Movie;
import org.example.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
@Repository
public class FileMovieRepository implements IMovieRepository {
@Value("${movies.file.location}")
    private File file;
    public void add(Movie movie){
        FileWriter writer;
        try{
            writer=new FileWriter(file,true);
            writer.write(movie.getTitle() +";"+movie.getGenre()+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Le film "+movie.getTitle()+" de genre "+movie.getGenre()+"a été ajouté");
    }

}
