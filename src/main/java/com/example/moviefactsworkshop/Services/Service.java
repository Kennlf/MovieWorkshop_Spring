package com.example.moviefactsworkshop.Services;

import com.example.moviefactsworkshop.Models.Movie;
import com.example.moviefactsworkshop.Repositories.Moviehandler;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Service {
    private ArrayList<Movie> movies;
    private Random random = new Random();

    public Service() {
        Moviehandler moviehandle = new Moviehandler();
        movies = moviehandle.addFileDataToList();
    }

    //3.2
    public String getFirstMovieTitle(){
        String title = movies.get(0).getTitle();
        return title;
    }

    //3.3
    public String getRandomMovieTitle(){
        String title = movies.get(random.nextInt(movies.size()+1)).getTitle();
        return title;
    }

    //3.4
    public ArrayList<Movie> getTenMovesSorted(){
        ArrayList<Movie> tenRandomMovies = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            tenRandomMovies.add(movies.get(random.nextInt(movies.size())+1));
        }
        Collections.sort(tenRandomMovies);
        return tenRandomMovies;
    }

    //3.5
    public int howManyMoviesHaveAward(){
        int count = 0;
        for(Movie m : movies){
            if(m.getAward().equals("Yes")){
                count++;
            }
        }
        return count;
    }

    public ArrayList<Movie> moviesBasedOnCharAmount(char letter, int amount){
        ArrayList<Movie> moviesWithLetter = new ArrayList<>();
        for(Movie m : movies){
            if(movies.contains(letter)){

            }
        }
        return moviesWithLetter;
    }


}
