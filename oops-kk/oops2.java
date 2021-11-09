
import java.util.*;

public class oops2{ 

    static class A{
        int age ;
        int wt ;
        A(){}
        A(int age, int wt){
            this.age = age;
            this.wt = wt;
        }

        @Override
        public String toString(){
            return "Age is "+this.age + "Weight is "+ this.wt;
        }

    }
    public static void main(String args[]) {
        A obj1 = new A(14, 55);
        System.out.println(obj1);  // THis will give some random value bcs object can't be printed like this toString() will be used in A class
    }
}