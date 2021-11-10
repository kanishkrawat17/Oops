class Developer extends Person{
   
    Developer(int age, String name){
        super(age,name);
    }
    public void walk(){
        System.out.println(name + " is walking");  // Run-time polymorphism
    }
}


class  Person {
    int age;
    String name;
    static int count = 0;
    Person(){
        System.out.println("Constructor can be called in another constructor using this()");
    }

    Person(int age, String name){
        this();
        count++;
        System.out.println("Object no "+count);
        this.age = age;
        this.name = name;
    }

   public  void walk(){
       System.out.println("Person is Walking");
   }

   public   void eat(){
       count++;
       System.out.println("Person is Walking");
   }

   public void walk(int steps){
       count++;
       System.out.println(steps+" steps");
   }
}

public class basic{
    public static void main(String args[]){
        // Person p = new Person();
        // p.age = 21;
        // p.name ="Bobby";

        // System.out.println(p.age);
        // System.out.println(p.name);
        // p.walk(5);
        // p.walk();

        // Person p1 = new Person(25, "Paras");
        // System.out.println(p1.age);
        // System.out.println(p1.name);

        // Person p2= new Person(30, "AAku");
        // System.out.println(p2.age);
        // System.out.println(p2.name);

        Developer d = new Developer(4,"Rahul");
        System.out.println(d.name + " is " + d.age + " years old.");
        d.walk();
    }

}


