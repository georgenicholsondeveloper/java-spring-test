package org.example.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import services.NameGeneratorService;

@SpringBootApplication(scanBasePackages = {
        "org.example.springtest",
        "services"
})
@RestController
public class SpringTestApplication {

    private final NameGeneratorService _nameGeneratorService;

    public SpringTestApplication(NameGeneratorService nameGeneratorService) {
        _nameGeneratorService = nameGeneratorService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringTestApplication.class, args);
    }


    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name){
        return _nameGeneratorService.GetFormattedString(name);
    }
}
