package com.example.moviefactsworkshop.Repositories;

import com.example.moviefactsworkshop.Models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Moviehandler {


    public ArrayList<Movie> addFileDataToList(){
        File movieFile = new File("resources/imdb-data.csv");
        ArrayList<Movie>allMovies = new ArrayList<>();
        try{
            Scanner sc = new Scanner(movieFile);
            while(sc.hasNext()){
                String line = sc.nextLine();
                String[] data = line.split(";");
                //Year;Length;Title;Subject;Popularity;Awards
                int year = Integer.parseInt(data[0]);
                int length = Integer.parseInt(data[1]);
                String title = data[2];
                String subject = data[3];
                int popularity = Integer.parseInt(data[4]);
                String award = data[5];
                Movie newMovie = new Movie(year,length,title,subject,popularity,award);
                allMovies.add(newMovie);
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File could not be found");

        }
        return allMovies;
    }

  /*  public static void main(String[] args) {
        Moviehandler moviehandler = new Moviehandler();
        moviehandler.addFileDataToList();
        //System.out.println(moviehandler.getAllMovies());

        for(Movie m : moviehandler.getAllMovies()){
            System.out.println(m);
        }


    }*/

}
