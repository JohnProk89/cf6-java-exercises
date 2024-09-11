package chapter2integer;

import java.util.Scanner;

/**
 * Ζητείται από τον χρήστη να εισαγάγει 3 ακεραίους που αναπαριστούν ημέρα, μήνα, έτος και
 * επιστρέφει την ημερομηνία σε μορφή ΗΗ/ΜΜ/ΕΕ
 */
public class FormattedDate {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        // Εισαγωγή δεδομένων
        System.out.println("Please tell me the day, month, year in integer values");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt()%100; // Κρατάει μόνο τις δεκαετίες

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%02d/%02d/%02d", day, month, year);
    }
}
