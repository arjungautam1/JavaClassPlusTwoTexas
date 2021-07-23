package this_keyword;

class Student{
    int id;
    String name;
    String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("Id: "+id+" Name: "+name+" Address: "+address);
    }
}
public class ThisDemo {
    public static void main(String[] args) {
        Student student=new Student(1,"Arjun","Kathmandu");
        student.display();
    }
}
