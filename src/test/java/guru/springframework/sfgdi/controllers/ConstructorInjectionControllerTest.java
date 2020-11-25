package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectionControllerTest {
    ConstructorInjectionController injectionController;

    @BeforeEach
    void setUp() {
        injectionController = new ConstructorInjectionController(new GreetingServiceImpl());
    }

    @Test
    void getGreetingService() {
        System.out.println(injectionController.getGreetingService());
    }
}