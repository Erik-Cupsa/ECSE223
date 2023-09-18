/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

package ca.mcgill.ecse.model;

// line 4 "../../../../Test.ump"
public class Greeting
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Greeting Attributes
  private String greeting;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Greeting()
  {
    greeting = "Hello World!";
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getGreeting()
  {
    return greeting;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "greeting" + ":" + getGreeting()+ "]";
  }
}