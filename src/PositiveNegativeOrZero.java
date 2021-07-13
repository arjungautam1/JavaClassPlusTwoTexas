import java.util.Scanner;

public class PositiveNegativeOrZero {

    public static void main(String[] args) {

        System.out.println("Enter any number:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        if(number>0){
            System.out.println("Number is Positive.");
        }
        else if(number<0)
        {
            System.out.println("Number is negative.");
        }
        else{
            System.out.println("Number is 0");
        }
    }

}
