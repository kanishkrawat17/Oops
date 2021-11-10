package com.kanishk.properties.inheritance;

public class BoxWeight extends Box {

    int weight ;

    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(int weight){
        // this.l = l;
        // this.h = h;
        // this.w = w;
        super();                       // super->  calls the constructor and initilaise the values for child class
        this.weight = weight;
    }

}
