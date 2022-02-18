package com.example.moviefactsworkshop.Models;

import java.time.Year;

public class Movie implements Comparable<Movie>{

    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private String award;


    public Movie(int year, int length, String title, String subject, int popularity, String award) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.award = award;
    }

    public Movie() {
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getAward() {
        return award;
    }

    @Override
    public String toString() {
        return "Year: " + year + "Length: " + length + "Title: " + title +
                "subject: " + subject + "Popularity: " + popularity +
                "awards?: " + award;
    }

    @Override
    public int compareTo(Movie o) {
        return this.popularity - o.getPopularity();
    }
}
