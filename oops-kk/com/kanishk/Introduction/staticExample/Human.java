package com.kanishk.Introduction.staticExample;

public class Human {
    
    int age ; 
    int wt ;
    String name;
    static long population = 0;

        static void message (){
            Human h1 = new Human();
            System.out.print(h1.age);
        }

        public Human(){}

        public Human(int age , int wt , String name){
            this.age = age;
            this.wt = wt;
            this.name = name;
            Human.population += 1; // need to make population static 
        }

        public String toString(){ // to show the user defined object 
            return "Name -> "+ this.name + " Weight -> "+ this.wt + " Age-> "+ this.age + "Population= "+ Human.population ;
        }
        public static void main(String args[]){
            Human h1 = new Human();
            System.out.println(h1.age);
            // h1.message();
            message();
        }
    
}

// Do run java in upper right corner in run otherwise it is throwing error IDK why