package com.kishore.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MaitriController {

    // Exposing addy() method as an API endpoint
    @GetMapping("/add")
    public int addy(@RequestParam int a, @RequestParam int b) {
        Maitri mai = new Maitri();
        return mai.addy(a, b);  // Correctly returning the addition result
    }

    // Exposing okay() method as an API endpoint
    @GetMapping("/okay")
    public String okay() {
        Maitri mai = new Maitri();
        mai.okay();  // This prints to the console, not as a response
        return "Message logged successfully!";
    }
}
