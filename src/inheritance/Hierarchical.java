package inheritance;

class Animal1{
    void eat(){
        System.out.println("Eating..");
    }
}
class Dog1 extends Animal1{
    void bark(){
        System.out.println("Barking..");
    }
}
class Cat extends Animal1{
    void meow(){
        System.out.println("Meowing..");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Cat cat=new Cat();
        System.out.println("For cat:");
        cat.meow();
        cat.eat();

        Dog1 dog1=new Dog1();
        System.out.println("For Dog:");
        dog1.eat();
        dog1.bark();


    }


}
