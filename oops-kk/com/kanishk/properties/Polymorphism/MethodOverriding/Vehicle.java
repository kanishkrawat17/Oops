package com.kanishk.properties.Polymorphism.MethodOverriding;
// Example of overriding

// class Car extends Vehicle{ // Child Class
//     void vehicle(){
//         System.out.print("Child Class");
//     }
// }
// public class Vehicle { // Parent Class
//     void vehicle(){
//         System.out.print("Parent Class");
//     }
//     public static void main(String args[]){
//         Vehicle obj = new Car(); // Upcasting ->  when parents class referencve varibale refers to object of child class
//         obj.vehicle(); // Child class
//     }
// }
// **************Run time polymorphism with data members****************

// class Car extends Vehicle{
//     int speedLimit = 200;
// }
// public class Vehicle { // Parent Class
//     int speedLimit = 125;
//     public static void main(String args[]){
//       Vehicle obj = new Car(); // 125 -> run -time polymorphism can't be achieved with data members
//       System.out.print(obj.speedLimit);
//     }
// }


// ****************Run time Polymorphism in Multilevel inhertance********************
class Car extends Vehicle{ // Child Class
    void vehicle(){
        System.out.println(" Grand Parent ");
    }
}
class Innova extends Car{
     void  vehicle(){
        System.out.println("Parent "); 
    }
}
class Tyre extends Innova{
      void  vehicle(){
        System.out.println("Child "); 
    }
}
public class Vehicle { // Parent Class
      void vehicle(){
        System.out.println(" Grand Grand Parent ");
    }
    public static void main(String args[]){
       Vehicle o1, o2, o3;
       o1=  new Car();
       o2=  new Innova();
       o3=  new Tyre();

       o1.vehicle(); //Grand  Parent
       o2.vehicle(); // Parent 
       o3.vehicle(); // Child
       Innova obj = new Tyre();
       obj.vehicle();  // Child

       // Parent can refer to child but vice vers is not true;
      //Innova obj1 = new Car(); // this is wrong child can't refer to parent.
    }
}




