package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControllerTest {
    SetterInjectionController injection;

    @BeforeEach
    void setUp() {
        injection = new SetterInjectionController();

        injection.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreetingService() {
        System.out.println(injection.getGreetingService());
    }
}