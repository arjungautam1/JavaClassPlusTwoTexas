import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {




        System.out.println("Enter the marks you obtained:");
        Scanner marks=new Scanner(System.in);
        int obtainedMarks=marks.nextInt();

        if(obtainedMarks>40){
            System.out.println("You are passed.");
        }
        else{
            System.out.println("You are failed.");
        }
    }
}
