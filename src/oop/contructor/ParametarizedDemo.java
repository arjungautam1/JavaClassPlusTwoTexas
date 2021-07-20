package oop.contructor;

class Student{
    int id;
    String name;
    public Student(int i, String n){
       id=i;
       name=n;
    }
    void display(){
        System.out.println("Id :"+id+" Name: "+name);
    }
}

public class ParametarizedDemo {
    public static void main(String[] args) {
        Student student=new Student(1,"Arjun");
        student.display();
    }

}
