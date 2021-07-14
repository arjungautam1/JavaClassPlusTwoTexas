package switch_statement;
import java.util.Scanner;

public class SwitchStatementDemo {

    public static void main(String[] args) {
        System.out.println("Enter any number:(1-7)");
        Scanner scanner=new Scanner(System.in);
        int day=scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }
}
