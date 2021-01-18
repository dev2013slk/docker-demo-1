package com.lj.dockerdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MyController
 * All rights reserved.
 * Created by lasath on 11/3/2020
 * Copyright (c) 2017 6willow.com to present.
 */
@RestController
public class MyController {

    @GetMapping(value = "/test-docker")
    public String getData() {
        return "In docker plroject";
    }

}
