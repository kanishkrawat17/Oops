package com.kanishk.properties.Polymorphism.Abstraction.AbstractClass;

abstract class Bike {
    Bike(){
        System.out.println("Constrctor is created");
    }
    abstract void run();
    void highSpeed(int speed){
        System.out.println("High speed is "+ speed);
    }
}

class Yamaha extends Bike{
    void run(){
        System.out.println("Running Safely");
    }
}

public class TestAbstraction2 {
    public static void main(String args[]){
        Bike bike1 = new Yamaha();
        bike1.run();
        bike1.highSpeed(300);
    }
}
