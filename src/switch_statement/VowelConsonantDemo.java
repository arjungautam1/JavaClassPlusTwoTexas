package switch_statement;

import java.util.Scanner;

public class VowelConsonantDemo {
    public static void main(String[] args) {
        System.out.println("Enter the letter:");
        Scanner scanner=new Scanner(System.in);
        char input=scanner.next().charAt(0);
        switch (input){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
