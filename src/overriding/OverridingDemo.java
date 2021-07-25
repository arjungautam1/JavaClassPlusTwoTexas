package overriding;

class Bank{
    int getRateOfInterest(){
        return 0;
    }
}
class NMB extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class NICASIA extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}
public class OverridingDemo {
    public static void main(String[] args) {
        NMB nmb=new NMB();
        System.out.println("Rate of Interest of NMB:"+nmb.getRateOfInterest());
        NICASIA nicasia=new NICASIA();
        System.out.println("Rate of Interest of NIC "+nicasia.getRateOfInterest());
    }
}
