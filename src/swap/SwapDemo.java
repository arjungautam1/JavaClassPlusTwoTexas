package swap;

public class SwapDemo {
    //input // a=10  b=20
    //output // a=20  b=10

    public static void main(String[] args) {

        int a=10,b=20;
        System.out.println("Before swap a "+a +" b "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swap a "+a +" b "+b);

    }



}
