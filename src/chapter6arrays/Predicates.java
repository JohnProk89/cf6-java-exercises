package chapter6arrays;

import java.util.Scanner;

/**
 * Test a couple of predicates methods
 */
public class Predicates {

    public static void main(String[] args) {
        // Declaration and initialization
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        boolean areMT3Even = false;
        boolean areMT3Odd = false;
        boolean areMT3Consecutive = false;
        boolean areMT3SameEnding = false;
        boolean areMT3SameTens = false;

        System.out.println("Please type 6 integers between 1 and 49");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The integers typed are the following");
        for (int element: arr) {
            System.out.println(element);
        }

        //Calculations
        areMT3Even = areMT3Even(arr);
        areMT3Odd = areMT3Odd(arr);
        areMT3Consecutive = areMT3Consecutive(arr); // Index out of bounds inside the method on the RHS
        areMT3SameEnding = areMT3SameEnding(arr);
        areMT3SameTens = areMT3SameTens(arr);

        //Printing results
        System.out.println("Checking if there are more than 3 even numbers: " + areMT3Even);
        System.out.println("Checking if there are more than 3 odd numbers: " + areMT3Odd);
        System.out.println("Checking if there are more than 3 consecutive numbers: " + areMT3Consecutive);
        System.out.println("Checking if there are more than 3 numbers with the same ending: " + areMT3SameEnding);
        System.out.println("Checking if there are more than 3 numbers in the same group of tens : " + areMT3SameTens);
    }

    /**
     * Checks if there are more than 3 even numbers in a given array
     * @param arr the input array
     * @return true/false
     */
    public static boolean areMT3Even(int[] arr) {
        int counter = 0;
        for (int element: arr) {
            if (element % 2 == 0) {
                counter++;
            }
        }
        return counter > 3;
    }

    /**
     * Checks if there are more than 3 odd numbers in a given array
     * @param arr the input array
     * @return true/false
     */
    public static boolean areMT3Odd(int[] arr) {
        int counter = 0;
        for (int element: arr) {
            if (element % 2 != 0) {
                counter++;
            }
        }
        return counter > 3;
    }

    /**
     * Checks if there are more than 3 consecutive numbers in a given array
     * @param arr the input array
     * @return true/false
     */
    public static boolean areMT3Consecutive(int[] arr) {
        int counter = 0;
        for (int i = 0; i< arr.length -1; i++) {
            if (arr[i+1] - arr[i] == 1) { // Index out of bounds
                counter++;
            }
        }
        return counter > 3;
    }

    /**
     * Checks if there are more than 3 numbers with the same ending in a given array
     * @param arr the given array
     * @return true/false
     */
    public static boolean areMT3SameEnding(int[] arr) {
        //Declaration and Initialization
        boolean sameEnding = false;
        int[] endings = new int[10];

        //Calculations
        for (int item : arr) {
            endings[item % 10]++;
        }

        for (int item : endings) {
            if (item >= 3) {
                sameEnding = true;
                break;
            }
        }
        return sameEnding;
    }

    /**
     * Checks if there are more than 3 numbers within the same tens in a given array
     * @param arr the given array
     * @return true/false
     */
    public static boolean areMT3SameTens(int[] arr) {
        int[] tens = new int[10];
        boolean sameTen = false;

        for (int item : arr) {
            tens[item / 10]++;
        }

        for (int item : tens) {
            if (item >= 3) {
                sameTen = true;
                break;
            }
        }
        return sameTen;
    }

}
