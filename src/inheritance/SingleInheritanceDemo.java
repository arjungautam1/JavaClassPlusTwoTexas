package inheritance;
// Program to demonstrate single inheritance
//Super class/ Parent class
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
    void walk(){
        System.out.println("Walking...");
    }
}
// Sub class/ Child class
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}


public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.bark();
        dog.eat();
        dog.walk();
    }
}
