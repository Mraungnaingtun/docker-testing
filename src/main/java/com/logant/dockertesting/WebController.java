package com.logant.dockertesting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping("/hello-docker")
    public String home() {
        return "Welcome!";
    }
}
