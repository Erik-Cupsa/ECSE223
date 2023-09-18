package ca.mcgill.ecse.app;

import ca.mcgill.ecse.model.Greeting;

class App {
  public static void main(String[] args) {
    Greeting greeting = new Greeting();
    System.out.println(greeting.getGreeting());
  }
}
