package chapter6arrays;

/**
 * This programme returns the position of the max element of an array of integers
 */
public class MaxArrayElementPosition {

    public static void main(String[] args) {

        // Declaration and Initialization
        int[] arr = {1, 2, 3, 4, 20};
        int maxPosition = -1;
        int max = Integer.MIN_VALUE;

        //Calculations
        maxPosition = getMaxPosition(arr, 0, arr.length);
        max = arr[maxPosition];

        //Printing the results
        System.out.println("The max element is " + max + ". It is in the position " + (maxPosition + 1 ) + " of the array");
    }

    /**
     * This method returns the position of the max integer of a given array
     * @param arr the given array
     * @param low the starting index
     * @param high the ending index
     * @return the position of the max integer
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = -1;
        int max = Integer.MIN_VALUE;

        for (int i = low; i< high; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxPosition = i;
            }
        }
        return  maxPosition;
    }
}
