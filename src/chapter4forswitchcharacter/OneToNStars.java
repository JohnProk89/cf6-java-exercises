package chapter4forswitchcharacter;

import java.util.Scanner;
/**
 * The programme asks the user to type the number rows of stars to print with an ascending order from 1 to n stars
 */
public class OneToNStars {
    public static void main(String[] args) {
        // Initialization and declaration
        Scanner scanner = new Scanner(System.in);
        int stars = 0;

        //User Input
        System.out.println("Type the number of rows of stars to print in an ascending order from 1 to n stars");
        stars = scanner.nextInt();

        //Printing
        for (int i = 1; i <= stars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
