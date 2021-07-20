package oop.class_obj;


class Hello {
    void message() {
        System.out.println("Hello World");
    }
    String message1(){
        return "Hello I am Arjun";
    }
}

public class MethodsDemo {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.message();
        System.out.println(hello.message1());

    }
}
