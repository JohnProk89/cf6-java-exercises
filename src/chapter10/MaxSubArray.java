package chapter10;

/**
 * The program calculates the maximum sum of the values of a sub array of an array
 */
public class MaxSubArray {

    static int globalMax = 0;
    static int endingIndex = 0;
    static int globalStartingIndex = 0;

    public static void main(String[] args) {

        // A. Describing with words and sketches

        // In need to find sub arrays and calculate their individual sums
        // In need to keep sums for future calculations
        // In need to find the maximum sum sub array
        // In need to design a linear algorithm O(n)

        // B. Coding

        int [] testArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        calculateMaxSum(testArray);

        System.out.println("Max sum " + globalMax + " of sub array: ");
        System.out.print("{");
        for (int i = globalStartingIndex; i <= endingIndex; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.print("}");

        // C. Show complexity
        // No nested loops -> O(n)
    }

    /**
     * Updates the static variables for maximum sum,starting and ending position of the wanted sub array
     * @param arr the input array
     */
    public static void calculateMaxSum(int [] arr) {
            int localMax = arr[0];
            int startIndex = 0;
            int tmp;

        for (int i = 1; i < arr.length; i++) {

            tmp = localMax + arr[i];

            if (tmp > arr[i]) {
                localMax = tmp;
            } else {
                localMax = arr[i];
                startIndex = i;
            }
            // The following is the same as the solution...
            if (localMax > globalMax) {
                globalMax = localMax;
                globalStartingIndex = startIndex;
                endingIndex = i;
            }
        }
    }
}
