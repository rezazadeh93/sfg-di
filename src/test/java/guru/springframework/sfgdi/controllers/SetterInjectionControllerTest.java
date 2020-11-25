package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionControllerTest {
    SetterInjectionController injection;

    @BeforeEach
    void setUp() {
        injection = new SetterInjectionController();

        injection.setGreetingService(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreetingService() {
        System.out.println(injection.getGreetingService());
    }
}