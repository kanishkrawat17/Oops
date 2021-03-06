package com.kanishk.properties.inheritance;

public class Box {
    private double l;
    double h;
    double w;
    protected int test = 30;
    Box(){ 
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    //cube
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    // Cuboid
    Box(double l, double h , double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){ // taking in object
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("I'm running");
    }
}
