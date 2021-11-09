package com.kanishk.Introduction.staticExample;

public class Innerclass {

    static class Test{
        String name;
        Test(String name){
            this.name = name;
        }
    }

    public static void main(String args[]){
        Test obj1 = new Test("kanishk");
        System.out.println(obj1.name);
        OuterClass oc = new OuterClass("Audi", 20000);
        System.out.print(oc.carName);
        System.out.print(oc.price);
       
    }
}

class OuterClass{
    String carName;
    int price;
    OuterClass(String carName , int price){
        this.carName = carName;
        this.price= price;
    }

}
