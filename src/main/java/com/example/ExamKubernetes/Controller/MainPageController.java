package com.example.ExamKubernetes.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Daniel Bojic
 * Date: 2021-09-16
 * Time: 11:36
 * Project: ExamKubernetes
 * Copyright: MIT
 */

@RestController
public class MainPageController {

    @GetMapping("/hello")
    public String hello(){

        return "Hello, World!";
    }

}
