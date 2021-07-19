package student;

public class MainClass {
    public static void main(String[] args) {

        Student student=new Student(); //Object Creation
        student.id=1;
        student.name="Arjun";
        student.address="Kathmandu";


        Student student1=new Student();
        student1.id=2;
        student1.name="Rupesh";
        student1.address="Ktm";
        //Printing Data
        System.out.println(student.id+" "+ student.name+" "+student.address);
        System.out.println(student1.id+" "+ student1.name+" "+student1.address);





    }
}
