package abstractiondemo;

interface Bike1 {
    void run1();
}

class Bike1Impl implements Bike1 {
    public void run1() {
        System.out.println("Bike running...");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Bike1Impl bike1 = new Bike1Impl();
        bike1.run1();
    }

}
