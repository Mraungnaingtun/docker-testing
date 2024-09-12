package com.logant.dockertesting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class WebController {

    @GetMapping("/hello-docker")
    public ResponseEntity<List<String>> hello() {
        List<String> messages = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            messages.add("Welcome message " + i);
        }
        return ResponseEntity.ok(messages);
    }
}
