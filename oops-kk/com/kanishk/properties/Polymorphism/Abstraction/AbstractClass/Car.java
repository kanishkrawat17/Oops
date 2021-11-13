package com.kanishk.properties.Polymorphism.Abstraction.AbstractClass;

abstract class Vehicle{
    abstract void run();
    void warning(){
        System.out.print("Dont drive vehicle in high speed");
    }
} 
public class Car extends Vehicle {
    void run (){
        System.out.println("Running Safely");
    }
    public static void main(String args[]){
        Vehicle obj = new Car();
             // or //
        Car obj1 = new Car();
        obj.run(); //Running Safely
        obj1.run(); // Running Safely
        obj1.warning();
    }
}
