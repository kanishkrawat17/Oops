package com.kanishk.Introduction.staticExample;

import com.kanishk.src.packages.a.Greeting;

public class Main { 
    // static int count =3234;
        public static void main(String args[]){package com.kanishk.Introduction.staticExample;
        
        public class InnerClasses {
            
        }
        
        // Human kanishk = new Human(90, 23, "Kanishk");
        // Human bobby = new Human(65, 26, "Bobby");
        // Human paras = new Human(24, 74, "Paras");
        
        
        // System.out.println(kanishk);
        // System.out.println(paras);
        // System.out.println(bobby);
        
        
        // System.out.println(kanishk);
        // System.out.println(kanishk.name);
        // System.out.println(kanishk.wt);
        // System.out.println(kanishk.population);
        

        // ================= static variable count =========================
        // System.out.print(Human.population);
        // Main.count =23;
        // Main.count =2;
        // System.out.print("COUNT "+ Main.count);
            // Main obj = new Main();
            // obj.greeting();
            greeting();

    }
 
    static void greeting(){
        Main obj = new Main();
        obj.fun();
        System.out.print("Welcome to Main function ");
    }

    void fun(){
        System.out.println("hello world");
    }
}

// Do run java in upper right corner in run otherwise it is throwing error IDK why