package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionControllerTest {
    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    void setUp() {
        propertyInjectionController = new PropertyInjectionController();

        propertyInjectionController.greetingService = new ConstructorGreetingServiceImpl();
    }

    @Test
    void getGreetingService() {
        System.out.println(propertyInjectionController.getGreetingService());
    }
}