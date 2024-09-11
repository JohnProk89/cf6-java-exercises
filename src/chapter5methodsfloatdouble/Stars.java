package chapter5methodsfloatdouble;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού και προτρέπει τον χρήστη να επιλέξει την απεικόνιση διάφορων διατάξεων από αστεράκια
 * @author johnp
 * @since cf6
 */
public class Stars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int numberOfStars = 0;

        do {
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1-n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n-1");
            System.out.println("6. Έξοδος από το πρόγραμμα");
            System.out.println("Δώσε επιλογή:");
            choice = scanner.nextInt();
            if (choice == 6) {
                break;
            }
            System.out.println("Δώστε αριθμό για αστεράκια");
            numberOfStars = scanner.nextInt();
            switch (choice) {
                case 1:
                case 3:
                case 4:
                case 5:
                    horizontal(choice, numberOfStars);
                    break;
                case 2:
                    vertical(numberOfStars);
                    break;
                default:
                    break;
            }
        }
        while (true);
    }

    /**
     * Εκτυπώνει n αστεράκια για τις επιλογές χρήστη 1,3,4,5
     * @param stars πλήθος αστεράκια
     * @param choice επιλογή χρήστη
     */
    public static void horizontal(int choice, int stars) {
        for (int i = 1; i <= stars; i++) {
            switch (choice) {
                case 1:
                    System.out.print("*");
                    break;
                case 3:
                    for (int j = 1; j <= stars; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    break;
                case 4:
                    for (int j = 1; j <= i ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    break;
                case 5:
                    for (int j = stars; j >= i ; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                    break;
                default:
                    break;
            }
        }
        System.out.println();
    }

    /**
     * Εκτυπώνει n αστεράκια κάθετα
     * @param stars
     */
    public static void vertical(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.println("*");
        }
    }
}
