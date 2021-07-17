package assignment;

//Operators
// > < <= >= ==
// && || !=
// && - AND
// || - OR
// !=

import java.util.Scanner;

public class VowelConsonantMethod2 {

    public static void main(String[] args) {

        for (;;) {

            System.out.println("Enter any alphabet(a-z)");
            Scanner scanner = new Scanner(System.in);
            char input = scanner.next().charAt(0);

            if((input>='a' && input<='z' || (input>='A'&& input<='Z'))) {
                if (input == 'a' || input == 'e' || input == 'o' || input == 'i' || input == 'u') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            }
            else
                System.out.println("Input is not alphabet");
        }

    }
}
