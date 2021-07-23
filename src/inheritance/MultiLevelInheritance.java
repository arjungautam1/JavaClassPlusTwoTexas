package inheritance;

class Animals{
    void eat(){
        System.out.println();
    }
}
class Dogs extends Animals{
    void bark(){
        System.out.println("Barking..");
    }
}
class BabyDog extends Dogs{
    void weep(){
        System.out.println("Weeping..");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        BabyDog babyDog=new BabyDog();
        babyDog.weep();
        babyDog.bark();
        babyDog.eat();
    }
}
