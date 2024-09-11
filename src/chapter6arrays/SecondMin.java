package chapter6arrays;

import java.util.Arrays;

/**
 * This program finds the 2nd smallest element of an array of integers
 */
public class SecondMin {

    public static void main(String[] args) {

        // Declaration and Initialization
        int[] testArray = {1, 4, 9, 6};
        int min = Integer.MIN_VALUE;
        int secondMin = Integer.MIN_VALUE;

        // Calculations
        Arrays.sort(testArray);
        for (int i = 1; i < testArray.length - 1; i++) {
            if (testArray[i] > min) {
                secondMin = testArray[i];
                break;
            }
        }

        // Printing Results
        System.out.println("The second smallest element is " + secondMin);
    }
}
