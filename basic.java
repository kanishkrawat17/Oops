class  Person {
   int age;
   String name;

   void walk(){
       System.out.println("Person is Walking");
   }

   void eat(){
       System.out.println("Person is Walking");
   }

   void walk(int steps){
       System.out.println(this.name+" walked "+steps+" steps");
   }
}

public class basic{
    public static void main(String args[]){
        Person p = new Person();
        p.age = 21;
        p.name ="Bobby";

        System.out.println(p.age);
        System.out.println(p.name);
        p.walk(5);
        p.eat();
    }

}


