public class student {

    static class Student{
        int rno;
        String name;
        float marks ;

        Student(){}

        // passing other object in the constuctor
        Student (Student other){
            this.name = other.name ;
            this.rno = other.rno ;
            this.marks = other.marks ;
        }

        Student(int roll, String naam , float ank){
            this.rno = roll;
            this.name = naam;
            this.marks = ank;
        }
    }
    public static void main(String args[]){
        Student kanishk = new Student(12, "Kanishk", 84.3f); // objects gets memory during run time i.e dynamic memory allocation
        Student bobby = new Student(kanishk); //passing other object in constructor

        
        Student one = new Student();
        // one and two points to same memory location in heap , therefore any change happening in any of them will be reflected in both.
        Student two = one;


        System.out.println(bobby.rno);
        System.out.println(bobby.name);
        System.out.println(bobby.marks);
    }
}


