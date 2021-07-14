package basic_programming;

import java.util.Scanner;

//Program to multiply two numbers taking user input

/*

@author : Arjun Codes
*/


/**
 * @author Arjun Gautam
 * Project :Texas Java Training
 * Date : 2021-06-17
 */


public class UserInput {
    public static void main(String[] args) {

        int firstNumber,secondNumber,result;
        System.out.println("Enter first Number:");
        Scanner input=new Scanner(System.in);
        firstNumber=input.nextInt();

        System.out.println("Enter second number:");
        secondNumber=input.nextInt();

        result=firstNumber*secondNumber;
        System.out.println("Result is "+result);
    }
}
