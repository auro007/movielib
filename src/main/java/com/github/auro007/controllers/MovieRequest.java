package com.github.auro007.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Auro on 07/03/17.
 */

@RestController
public class MovieRequest {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testCall() {
        return "HELLO!!!";
    }
}
