package com.Douglas;

public class Simulator{

  public static void main(String[] args){
    FinalClass fc = new FinalClass();
    
    //Line doesn't work because were trying to
    //reassign the value of a variable
    //fc.type = "New Value";
    //fc.classA = new ClassA();
    
    fc.classA.greeting = "New Greeting";
  }
}