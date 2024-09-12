package com.logant.dockertesting;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class WebController {

    @RequestMapping("/hello-docker")
    public String home() {
        return "Welcome! Successfully Docker";
    }
}
