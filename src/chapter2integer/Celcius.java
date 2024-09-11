package chapter2integer;

import java.util.Scanner;

/**
 * Το πρόγραμμα ζητάει από τον χρήστη να εισαγάγει μία ακέραια τιμή θερμοκρασίας σε κλίμακα Fahrenheit
 * και του επιστρέφει την αντίστοιχη τιμή σε κλίμακα Celcius
 *
 */
public class Celcius {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int temperatureCelcius = 0;
        int temperatureFahrenheit = 0;

        // Υπολογισμοί
        System.out.println("Please type an integer number of the temperature in Fahrenheit");
        temperatureFahrenheit = scanner.nextInt();
        temperatureCelcius = ( (temperatureFahrenheit -32)*5)/9; // Fahrenhetit to Celcius formula


        //Εκτύπωση αποτελεσμάτων
        System.out.printf("%d\u2109 = %d\u2103\n", temperatureFahrenheit, temperatureCelcius);
    }
}
