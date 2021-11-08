public class student {
    
    public static void main(String args[]){
        Student kanishk = new Student(12, "Kanishk", 84.3f);
        System.out.println(kanishk.rno);
        System.out.println(kanishk.name);
        System.out.println(kanishk.marks);
        System.out.println("Hello world");
    }
    static class Student{
        int rno;
        String name;
        float marks ;
        Student(){}
        Student(int roll, String naam , float ank){
            this.rno = roll;
            this.name = naam;
            this.marks = ank;
        }
    }
}


