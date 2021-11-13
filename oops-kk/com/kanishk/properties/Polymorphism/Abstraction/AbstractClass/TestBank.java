package com.kanishk.properties.Polymorphism.Abstraction.AbstractClass;
// Real life scenario

abstract class Bank{
    abstract int getInterestRate();
}
class SBI extends Bank{
    int getInterestRate(){
        return 7;
    }
}
class PNB extends Bank{
    int getInterestRate(){
        return 10;
    }
}

public class TestBank {
    public static void main(String args[]){
        Bank PNB,SBI;
        PNB = new PNB();
        SBI = new SBI();
        System.out.println(PNB.getInterestRate()); // 10
        System.out.print(SBI.getInterestRate()); // 7


        // PNB obj = new PNB();
        // System.out.println(obj.getInterestRate());
    }
}
