package chapter4forswitchcharacter;

import java.util.Scanner;

/**
 * The programme asks the user to type the number of stars to print vertically
 */
public class NVerticalStarts {
    public static void main(String[] args) {
        // Initialization and declaration
        Scanner scanner = new Scanner(System.in);
        int stars = 0;

        //User Input
        System.out.println("Type the number of stars to print vertically");
        stars = scanner.nextInt();

        //Printing
        for (int i = 1; i <= stars; i++) {
            System.out.println("*");
        }


    }
}
