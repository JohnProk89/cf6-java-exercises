package chapter3whileifboolean;

import java.util.Scanner;

/**
 * Υπολογίζει εάν ένα έτος είναι δίσεκτο
 * @author johnp
 */
public class LeapYear {
    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean isDividedBy4 = false;
        boolean isDividedBy100 = false;
        boolean isDividedBy400 = false;
        boolean isLeapYear = false;

        // Εντολές
        System.out.println("Please give a year to check if it is a leap year");
        year = scanner.nextInt();
        if (year%4 == 0) {
            isDividedBy4 = true;
        }
        if (year%100 == 0) {
            isDividedBy100 = true;
        }
        if (year%400 == 0) {
            isDividedBy400 = true;
        }
        if ((isDividedBy4 && !isDividedBy100)||(isDividedBy400)) { // Λογική δίσεκτου έτους
            isLeapYear = true;
        }

        //Εκτύπωση αποτελεσμάτων
        System.out.println("It is a leap year: " + isLeapYear);
    }
}
