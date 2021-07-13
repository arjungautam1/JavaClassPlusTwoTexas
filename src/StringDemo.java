import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {

        System.out.print("Enter your name:");

        Scanner name=new Scanner(System.in);
        String myName=name.nextLine();

        System.out.println("My name is "+myName);

    }
}
