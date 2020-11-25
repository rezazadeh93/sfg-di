package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectionControllerTest {
    ConstructorInjectionController injectionController;

    @BeforeEach
    void setUp() {
        injectionController = new ConstructorInjectionController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreetingService() {
        System.out.println(injectionController.getGreetingService());
    }
}