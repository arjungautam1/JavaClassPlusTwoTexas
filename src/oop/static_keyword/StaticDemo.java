package oop.static_keyword;

class Student{
    int id;
    String name;
    static String college;
    static void changeCollege(){
        college="TCMIT";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("Id :"+id+"Name :"+name+"College :"+college);
    }
}

public class StaticDemo {

    public static void main(String[] args) {
        Student student=new Student(1,"Arjun");
        Student student1=new Student(2,"Ram");
        Student.college="Texas";
        Student.changeCollege();
        student.display();
        student1.display();

    }
}
