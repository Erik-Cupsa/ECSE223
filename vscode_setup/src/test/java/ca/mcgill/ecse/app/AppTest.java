package ca.mcgill.ecse.app;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import ca.mcgill.ecse.model.Greeting;

public class AppTest {
    @Test
    public void assertGreeting() {
        Greeting greeting = new Greeting();
        assertNotNull(greeting.getGreeting(), "Greeting should not be null");
    }
}
