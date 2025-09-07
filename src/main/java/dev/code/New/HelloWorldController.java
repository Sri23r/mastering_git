package dev.code.New;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/name")
    String sayMyName(){
        return "Srinath...!";
    }
}
