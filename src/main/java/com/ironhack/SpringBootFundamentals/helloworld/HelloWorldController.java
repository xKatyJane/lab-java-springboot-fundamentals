package com.ironhack.SpringBootFundamentals.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ironhack")
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String nameGreeting (@PathVariable String name) {
        String nameCapitalized = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        return "Hello " + nameCapitalized + "!";
    }

    @GetMapping("/add/{nr1}/{nr2}")
    public int addNumbers (@PathVariable int nr1, @PathVariable int nr2) {
        int sumOfNumbers = nr1 + nr2;
        return sumOfNumbers;
    }

    @GetMapping("multiply/{nr1}/{nr2}")
    public int multiplyNumber (@PathVariable int nr1, @PathVariable int nr2) {
        int multipliedNumbers = nr1 * nr2;
        return multipliedNumbers;
    }
}