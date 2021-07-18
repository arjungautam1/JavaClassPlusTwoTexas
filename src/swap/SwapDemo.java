package swap;
//Program to swap two numbers in java
//input a=10 b=20
//output a=20 b=10
public class SwapDemo {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before swap a "+a+" b "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swap a "+a+" b "+b);
    }

}
