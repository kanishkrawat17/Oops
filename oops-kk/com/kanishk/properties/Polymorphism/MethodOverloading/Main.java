package com.kanishk.properties.Polymorphism.MethodOverloading;
// Example of method overLoading 
public class Main {
    static class Shapes{
        public void area(){
            System.out.print("The Area of ");
        }
        public void area(int s){
            System.out.println("Square =  "+ s*s);
        }
        public void area(int l, int b){
            System.out.println("Rectangle =  "+ l * b);
        }
        public void area(double r ){
            System.out.println("Circle =  "+ 3.14 * r * r);
        }
    }

    public static void main(String args[]){
        Shapes myShape = new Shapes();
        Shapes Rectangle = new Shapes();
        Shapes Square = new Shapes();
        Shapes Circle = new Shapes();

        myShape.area();
        Rectangle.area(2,4);
        myShape.area();
        Square.area(4);
        myShape.area();
        Circle.area(4); // it will considered it as Square 
    }
}
