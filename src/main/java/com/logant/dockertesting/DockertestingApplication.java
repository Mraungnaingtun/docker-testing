package com.logant.dockertesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockertestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockertestingApplication.class, args);
	}

}


@RestController
 class MyController {

    @GetMapping("/")
    public String hello() {
        return "Hellow Docker!🙄🙄";
    }
}