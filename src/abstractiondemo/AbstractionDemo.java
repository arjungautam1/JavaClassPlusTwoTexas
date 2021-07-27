package abstractiondemo;

abstract class Bike{
   abstract void run();
   void ride(){
       System.out.println("we can ride bike..");
   }
}
class BikeImpl extends Bike{
    void run(){
        System.out.println("Bike can run safely...");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        BikeImpl bike=new BikeImpl();
        bike.run();
        bike.ride();
    }
}
