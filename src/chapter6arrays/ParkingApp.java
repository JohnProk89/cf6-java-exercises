package chapter6arrays;

/**
 * In a parking area, the max number of cars simultaneously parked is printed.
 * The user is asked about the total number of cars parked throughout the day and about the
 * arrival and departure time of each car
 * @author johnp
 */
public class ParkingApp {

    public static void main(String[] args) {
        //Declaration and initialization
//        Scanner scanner = new Scanner(System.in);
        int maxCars = 0;
//
//        // Taking user input
//        System.out.println("Please type the total number of cars that have parked today");
//        int dailyCarThroughput = scanner.nextInt();
//        int [][] userInputArray = new int[dailyCarThroughput][2];
//        for (int i = 0; i < dailyCarThroughput; i++) { // needs refinement I guess...hm...
//            System.out.println("For the car in the position " + (i + 1) + " in your list, type the arrival time" +
//                    " in a format of four digits, indicating hours and minutes");
//            userInputArray[i][0] = scanner.nextInt();
//            System.out.println("For the car in the position " + (i + 1) + " in your list, type the departure time" +
//                    " in a format of four digits, indicating hours and minutes");
//            userInputArray[i][1] = scanner.nextInt();
//        }

        int [][] testArray = {{1012, 1136}, {1317, 1417}, {1015, 1020}}; // test array

        //Calculations
        maxCars = doCalculations(testArray); // expected 2 cars
//        maxCars = doCalculations(userInputArray);

        //Printing Results
        System.out.println("The maximum number of cars simultaneously parked has been counted as " + maxCars);
    }

    /**
     * Method who calls methods inside the same class, so that main can only do the interaction with the user
     * @param rawData the user input data
     * @return the number of cars
     */
    public static int doCalculations(int [][] rawData) {
//        traverse(rawData);
        int [][] transformedArray = transformArray(rawData);
//        traverse(transformedArray);
        selectionSort(transformedArray);
//        traverse(transformedArray);
        return getMaxNumberOfCarsParked(transformedArray);
    }

    /**
     * Alters inputs array's dimensions and transforms its data to ease calculations.
     * 1st dimension is resized 2*n, where n is the total number of cars that parked throughout the day.
     * It now has the times of cars that either enter or leave, the 2nd dimension has a 0 or 1 value,
     * 0 indicating leaving, 1 indicating arriving to the parking area
     * @param arr user input array
     * @return rearrangedArray
     */
    public static int [][] transformArray(int [][] arr) {
        int [][] transArr = new int[arr.length * 2][2];

        for (int i = 0, j = arr.length ; i < arr.length && j< transArr.length; i++, j++) {
            transArr[i][0] = arr[i][0];
            transArr[i][1] = 1;
            transArr[j][0] = arr[i][1];
            transArr[j][1] = 0;
        }
//        for (int i = 0; i < arr.length; i++) {
//            int arrivalIndex = i;
//            int departureIndex = arrivalIndex + arr.length;
//            transArr[arrivalIndex][0] = arr[i][0];
//            transArr[arrivalIndex][1] = 1;
//            transArr[departureIndex][0] = arr[i][1];
//            transArr[departureIndex][1] = 0;
//        }
        return transArr;
    }

    /**
     * Calculates the maximum number of cars parked simultaneously
     * @param carArray rearranged car array
     * @return maximum number of cars parked
     */
    public static int getMaxNumberOfCarsParked(int[][] carArray) {
        int maxSum = 1;
        int sum = 0;

        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i][1] == 1) {
                sum++;
            } else {
                sum--;
            }
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    /**
     * Sorting based on Selection sort. Time-complexity: O(n^2)
     * @param arr the input array
     */
    public static void selectionSort(int[][] arr) {
        if (arr == null) return;
        int min;
        int minPosition;

        for (int i = 0; i < arr.length - 1; i++) {
            minPosition = i;
            min = arr[i][0];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][0] < min) {
                    min = arr[j][0];
                    minPosition = j;
                }
            }
            swap(arr, i, minPosition);
        }
    }

    /**
     * Swaps two rows of an array
     * @param arr the given array
     * @param i the one row
     * @param j the other row
     */
    public static void swap(int[][] arr, int i, int j) {
        int tmpTime = arr[i][0];
        arr[i][0] = arr[j][0];
        arr[j][0] = tmpTime;
        int tmpKey = arr[i][1];
        arr[i][1] = arr[j][1];
        arr[j][1] = tmpKey;
    }

    /**
     * Traverses a 2D array and prints its contents
     * @param arr the given array
     */
    public static void traverse(int[][] arr) {
        for (int[] row: arr) {
            for (int element: row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
}
