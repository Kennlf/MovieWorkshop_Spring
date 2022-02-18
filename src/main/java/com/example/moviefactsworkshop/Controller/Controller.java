package com.example.moviefactsworkshop.Controller;

import com.example.moviefactsworkshop.Models.Movie;
import com.example.moviefactsworkshop.Services.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class Controller {

    Service service = new Service();

    @GetMapping
    public String greeting(){
        return "Welcome"+
                " Fedt man spa";
    }
    @GetMapping("/getFirst")
    public String getFirst(){
        return service.getFirstMovieTitle();
    }

    @GetMapping("/getRandom")
    public String getRandom(){
        return service.getRandomMovieTitle();
    }

    @GetMapping("/getTenRandomMovies")
    public ArrayList<Movie> getTenRandomMoviesSorted(){
        return service.getTenMovesSorted();
    }

    @GetMapping("/howManyMoviesHaveAward")
    public int howManyMoviesHaveAward(){
        return service.howManyMoviesHaveAward();
    }

    public ArrayList<Movie> listOfMoviesBasedOnCharAmount(char l, int a){
        return service.moviesBasedOnCharAmount(l, a);


    }
}
