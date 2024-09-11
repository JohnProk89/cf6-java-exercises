package chapter10;

import java.util.Arrays;

/**
 * Demo of shallow and deep copy
 */
public class ShallowDeepCopy {

    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Traverse grid");
        traverse(grid);

        int[][] gridShallowCopy = shallowCopy(grid);
        gridShallowCopy[0][0] = 100;
        System.out.println("Traverse grid after altering shallow copy");
        traverse(grid);

        int[][] gridDeepCopy = deepCopy(grid);
        gridDeepCopy[0][0] = 200;
        System.out.println("Traverse grid after altering deep copy");
        traverse(grid);
        System.out.println("Traverse grid deep copy");
        traverse(gridDeepCopy);
    }

    /**
     * Creates a shallow copy
     * @param arr the input 2D array
     * @return a shallow copy
     */
    public static int[][] shallowCopy(int[][] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    /**
     * Creates deep copy
     * @param arr the input 2D array
     * @return a deep copy
     */
    public static int[][] deepCopy(int[][] arr) {
        int[][] arrayToReturn = new int[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            arrayToReturn[i] = new int[arr[i].length];
            arrayToReturn[i] = Arrays.copyOf(arr[i], arr[i].length);
        }
        return arrayToReturn;
    }
    public static void traverse(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
