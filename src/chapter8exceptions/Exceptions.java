package chapter8exceptions;

import java.util.Scanner;

/**
 * Exception Demo Exercise
 */
public class Exceptions {

    // Declaration and Initialization
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Declaration and Initialization
        int choice = 0;

        // Calculations
        while (true) {
            showMenu();
            choice = getChoice();
            try {
                if (choice == 5) {
                    break;
                }
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("PLease provide an integer value between 1 and 5");
//                e.printStackTrace();
            }
        }
    }

    /**
     * Prints a menu
     */
    public static void showMenu() {
        System.out.println("Type one of the following choices:");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5 to exit");
    }

    /**
     * Takes user input
     * @return the user's choice
     */
    public static int getChoice() {
        // Declaration and Initialization
        int choice = 0;

        // Calculations
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            scanner.nextLine(); // consuming string
            System.out.println("Error in input");
        }

        // Results
        return  choice;
    }

    /**
     * Prints user choice
     */
    public static void printChoice(int choice) {
        if (choice < 1 | choice > 5) {
            throw new IllegalArgumentException();
        } else {
            System.out.println("User choice: " + choice);
        }
    }
}
