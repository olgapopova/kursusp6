/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author popova
 */
@RestController
@SpringBootApplication

public class App1 {

    @RequestMapping("/")
    public String helloFunction0() {
        return "First HELLO!";
    }

    @RequestMapping("/hello")
    public String helloFunction() {
        return "HELLO!";
    }

    @RequestMapping("/hello2")
    public String helloFunction2(String firstname) {
        return "HELLO! My name is " + firstname + ".";
    }

    public static void main(String[] args) {
        //System.getProperties().put("server.port",4201);
        SpringApplication.run(App1.class, args);
    }
}
