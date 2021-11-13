package com.kanishk.properties.Polymorphism.Abstraction.AbstractClass.Interfaces;


interface Printable{
    void print();
}
interface Showable{
    void show();
}


// 1. abstract class can implement an interface but vice versa is not true  
// 2. abstract can also have non abstract methods.
// 3. interface keyword is used to declare an interface, with abtract class abstract is used.
// 4. interface can extend only one interface , but abstract class can extend another class and implement multiple interfaces.
// 5. interface have members public by default , where as abstract class can have private public protected members.
// so we can that Simply, abstract class achieves partial abstraction (0 to 100%) whereas interface achieves fully abstraction (100%).
abstract class test implements Printable{
    public void print(){
        System.out.print("test");
    }
}
public class A7 implements Printable , Showable{    
    public void print(){
        System.out.println("Printing");
    }
    public void show(){
        System.out.println("Showing");
    }
    public static void main(String args[]){
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
    
}
