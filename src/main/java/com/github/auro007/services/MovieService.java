package com.github.auro007.services;

import com.github.auro007.models.Movie;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created on 09/03/17.
 * @author Auro
 */

@Service
public class MovieService {

    private static Logger logger = Logger.getLogger(MovieService.class);

    private final HashMap<String, Movie> movieHashMap = new HashMap<>();


    public Movie getMovie(final String id) {

        populateMovieMap();
        return movieHashMap.getOrDefault(id,null);

    }


    private void populateMovieMap() {

        logger.info("populateMovieMap got called!!");
        movieHashMap.put("1",new Movie("1","Blah Blah","2020","SHIT"));
        movieHashMap.put("2",new Movie("2","The Day After Tomorrow","2007","Action, Drama, Disaster"));
        movieHashMap.put("3",new Movie("3","When Trouble Comes Barging On Your Door","2013","Action, Drama"));

    }
}
