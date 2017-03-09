package com.github.auro007.models;

/**
 * Created on 09/03/17.
 * @author Auro
 */
public class Movie {

    private String id;
    private String name;
    private String yearOfRelease;
    private String genre;


    public Movie() {}

    public Movie(
            final String id,
            final String name,
            final String yearOfRelease,
            final String genre) {

        this.id = id;
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    // Getters
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getYearOfRelease() {
        return yearOfRelease;
    }
    public String getGenre() {
        return genre;
    }


    // Setters
    public void setId(final String id) {
        this.id = id;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public void setYearOfRelease(final String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    public void setGenre(final String genre) {
        this.genre = genre;
    }
}
