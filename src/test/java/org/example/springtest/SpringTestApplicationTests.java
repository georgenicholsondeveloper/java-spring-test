package org.example.springtest;

import services.NameGeneratorService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringTestApplicationTests {

    @Test
    void contextLoads() {
        var api = new SpringTestApplication(new NameGeneratorService());
        var result = api.sayHello("hi");

        assertEquals("Hello, hi!", result);
    }
}