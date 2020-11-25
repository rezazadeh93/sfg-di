package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControllerTest {
    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    void setUp() {
        propertyInjectionController = new PropertyInjectionController();

        propertyInjectionController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreetingService() {
        System.out.println(propertyInjectionController.getGreetingService());
    }
}