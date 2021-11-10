package com.kanishk.properties.inheritance;

public class Main {
    public static void main(String args[]){
        Box cube = new Box(4);
        // System.out.println("Height = "+ cube.h + ", Width = "+ cube.w+", Length = "+ cube.l);

        Box box1 = new Box();
        // System.out.println("Height = "+ box1.h + ", Width = "+ box1.w+", Length = "+ box1.l);

        Box box2 = new Box(2,3,4);
        // System.out.println("Height = "+ box2.h + ", Width = "+ box2.w+", Length = "+ box2.l);

        Box box3 = new Box(cube);
        // System.out.println("Height = "+ box3.h + ", Width = "+ box3.w+", Length = "+ box3.l);

        BoxWeight box4 = new BoxWeight(20);
        // System.out.println("Height = "+ box4.h + ", Width = "+ box4.w+", Length = "+ box4.l +", Weight = "+ box4.weight);
    }
}
