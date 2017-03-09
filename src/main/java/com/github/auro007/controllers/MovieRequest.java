package com.github.auro007.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Auro on 07/03/17.
 */

@RestController
public class MovieRequest {

    @RequestMapping(value = "/")
    public String testCall() {
        return "Hey there, welcome to Auro's very-first backend project. This page is still under construction";
    }
}
