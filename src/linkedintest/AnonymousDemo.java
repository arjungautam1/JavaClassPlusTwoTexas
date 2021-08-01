package linkedintest;

interface Age{
    int x=21;
    void getAge();
}

public class AnonymousDemo {
    public static void main(String[] args) {

        MyClass myClass=new MyClass();
        myClass.getAge();

    }
}

class MyClass implements Age
{
    @Override
    public void getAge() {
        System.out.println("Age is "+x);

    }
}