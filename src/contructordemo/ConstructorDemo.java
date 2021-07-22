package contructordemo;

class Student{
    int id;
    String name;
    String address;
    static String college;

    static void changeCollegeName(){
        college="Texas International College";
    }

    public Student(int i,String n,String a){
        id=i;
        name=n;
        address=a;
    }
    void display(){
        System.out.println("Id "+id+" Name "+name+" Address "+address +"College "+ college);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Student student=new Student(1,"Hari","Butwal");
        Student student1=new Student(2,"Ram","Kathmandu");
        Student student2=new Student(3,"Sita","Bhaktapur");
        Student.college="Texas College";
        Student.changeCollegeName();
        student.display();
        student1.display();
        student2.display();
    }
}
