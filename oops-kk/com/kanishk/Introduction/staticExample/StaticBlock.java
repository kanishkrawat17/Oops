package com.kanishk.Introduction.staticExample;


// Demo to show initialisation of static variables.
public class StaticBlock {
    static int a =13 ;
    static int b  ;


    // this will run only, when the first object is created i.e. one time when the main () class is loaded 
    static {
        System.out.println("Hi im static block");
        b = 2*a;
    }
    public static void main(String args[]){
         StaticBlock obj1 =  new StaticBlock();
         System.out.println(StaticBlock.a + "  "+ StaticBlock.b);
         StaticBlock obj2 =  new StaticBlock();
         System.out.println(StaticBlock.a+2 + "  "+StaticBlock.b);
    }
}
