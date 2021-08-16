package abstractdemo;
//Comment to check the dot operation in VSCode
abstract class Bike{
    abstract void run();

    void hello() {
        System.out.println("Hello from Bike");
    }
}
class Honda extends Bike{
    void run(){
        System.out.println("Running safely..");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Bike bike=new Honda();
        bike.run();
        bike.hello();
    }
}
