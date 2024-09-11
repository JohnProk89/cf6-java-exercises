package chapter4forswitchcharacter;

import java.util.Scanner;
/**
 * The programme asks the user to type the number rows of stars to print with a descending order from n to 1 stars
 */
public class NtoOneStars {
    public static void main(String[] args) {
        // Initialization and declaration
        Scanner scanner = new Scanner(System.in);
        int stars = 0;

        //User Input
        System.out.println("Type the number of rows of stars to print in a descending order from n to 1 stars");
        stars = scanner.nextInt();

        //Printing
        for (int i = 1; i <= stars; i++) {
            for (int j = stars; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
