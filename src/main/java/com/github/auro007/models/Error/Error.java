package com.github.auro007.models.Error;

/**
 * Created by Auro on 09/03/17.
 */
public class Error {

    private String error;

    public Error(final String error) { this.error = error; }

    // Getters
    public String getError() {
        return error;
    }


    // Setters
    public void setError(final String error) {
        this.error = error;
    }
}
