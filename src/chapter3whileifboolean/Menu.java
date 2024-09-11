package chapter3whileifboolean;

import java.util.Scanner;

/**
 * Εκτυπώνει ένα μενού έως ότου ο χρήστης δώσει κατάλληλες επιλογές
 * @author johnp
 */
public class Menu {
    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        //Εντολές και Εκτύπωση αποτελεσμάτων
        System.out.println("Παρακαλώ πληκτρολόγησε μία από τις παρακάτω επιλογές");
        do {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            option = scanner.nextInt();

            if (option < 0 || option > 5) {
                System.out.println("Μη έγκυρη επιλογή");
            } else if (option == 1 ) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (option == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (option == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (option == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (option == 5) {
                System.out.println("Επιλέξατε Έξοδος");
                break;
            }
        }  while (true);
    }
}
