package com.github.auro007.controllers;

import com.github.auro007.models.Error.Error;
import com.github.auro007.services.MovieService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 07/03/17.
 * @author Auro
 */

@RestController
public class MovieRequest {

    private static final Logger logger = Logger.getLogger(MovieRequest.class);

    @Autowired
    private MovieService movieService;

    @RequestMapping(value = "/")
    public String testCall() {
        return "Hey there, welcome to Auro's very-first backend project. This page is still under construction";
    }

    @RequestMapping("/movies/{id}")
    public Object getMovie(@PathVariable final String id) {

        try {
            if (movieService.getMovie(id) != null)
                return movieService.getMovie(id);
            else
                return new Error("No Such Record Found!");
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
            return new Error(e.getMessage());
        }


    }
}
