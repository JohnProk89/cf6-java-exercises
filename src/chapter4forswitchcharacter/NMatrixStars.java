package chapter4forswitchcharacter;

import java.util.Scanner;
/**
 * The programme asks the user to type the number of stars to print vertically and horizontally
 */
public class NMatrixStars {
    public static void main(String[] args) {
        // Initialization and declaration
        Scanner scanner = new Scanner(System.in);
        int stars = 0;

        //User Input
        System.out.println("Type the number of rows and columns of stars to print in a n*n matrix");
        stars = scanner.nextInt();

        //Printing
        for (int i = 1; i <= stars; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
