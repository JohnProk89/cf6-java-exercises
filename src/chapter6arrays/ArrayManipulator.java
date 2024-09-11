package chapter6arrays;

/**
 * The program uses various methods around array manipulation
 */
public class ArrayManipulator {

    public static void main(String[] args) {

        // Declaration and Initialization
        int[] testArray = {1, 2, 3, 4, 5, 6, 9, 7, 8};
        int[] returnedArray = new int[testArray.length];
        int position = -1;
        int testElement = 7;

        //Calculations
        position =  getPosition(testArray,7);
        returnedArray = arrayMapper(testArray);

        //Printing results
        System.out.println("The initial array goes as follows: ");
        traverseArray(testArray);
        System.out.println("Located " + testElement + " in position " + (position + 1) + " of the testArray");
        System.out.println("The even numbers located in the test array are the following: ");
        filterEvens(testArray);
        System.out.println("The mapped array multiplied by 2 each element goes as follows");
        traverseArray(returnedArray);
        System.out.println("Checking if there is at least one even element in the test array: " + isThereEven(testArray));
        System.out.printf("Checking if all elements are even numbers in the test array: " + areAllEven(testArray));

    }

    /**
     * Prints a given array
     * @param arr the given array
     */
    public static void traverseArray(int[] arr) {
        for (int element: arr) {
            System.out.println(element + " ");
        }
    }
    /**
     * Searches an element of a given array
     * @param arr the given array
     * @return the position of the element
     */
    public static int getPosition(int[] arr, int element) {
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                position = i;
                break;
            }
        }
        return position;
    }

    /**
     * This method filters even number
     * @param arr the given array
     */
    public static void filterEvens(int[] arr) {
        for (int element : arr) {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }
    }

    /**
     * The method multiplies each element by 2
     * @param arr the given array
     * @return a new array
     */
    public static int[] arrayMapper(int[] arr) {
        int[] returnedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            returnedArr[i] = 2 * arr[i];
        }
        return returnedArr;
    }

    /**
     * Predicate which checks if there is at least one even element
     * @param arr the given array
     * @return true if even number found, false otherwise
     */
    public static boolean isThereEven(int[] arr) {
        for( int element: arr) {
            if (element % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Predicate which checks if all the elements of a given array are even numbers
     * @param arr the given array
     * @return true if all elements are even, false otherwise
     */
    public static boolean areAllEven(int[] arr) {
        for( int element: arr) {
            if (element % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
