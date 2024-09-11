package chapter10.lotto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This Program reads a file with numbers and prints groups of 6 numbers
 * under certain criteria
 */
public class LottoTypicalSetGenerator {

    public static void main(String[] args) {

        final int THRESHOLD = 6;
        int value;
        int tooManyNumbersCounter = 0;
        File inFile = new File("C:/tmp/project1/numbers-in.txt");
        File outFile = new File("C:/tmp/project1/numbers-out.txt");
        int [] column = new int[THRESHOLD];
        ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(inFile);
                PrintWriter pw = new PrintWriter(outFile)) {
            while (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (!(value > 0 && value < 50)) {
                    System.out.println("Number value out of bounds");
                    System.exit(1);
                }
                numbers.add(value);
                tooManyNumbersCounter++;
            }

            if (tooManyNumbersCounter < 7 | tooManyNumbersCounter > 49) {
                System.out.println("File has too many numbers");
                System.exit(1);
            }

            int [] sorter = new int[numbers.size()];

            for (int i = 0; i < sorter.length; i++) {
                sorter[i] = numbers.get(i);
            }

            Arrays.sort(sorter);

            for (int i = 0; i <= sorter.length - THRESHOLD; i++) {
                for (int j = i + 1; j <= sorter.length - THRESHOLD + 1; j++) {
                    for (int k = j + 1; k <= sorter.length - THRESHOLD + 2; k++) {
                        for (int m = k + 1; m <= sorter.length - THRESHOLD + 3; m++) {
                            for (int l = m + 1; l <= sorter.length - THRESHOLD + 4; l++) {
                                for (int o = l + 1; o < sorter.length; o++) {
                                    column[0] = sorter[i];
                                    column[1] = sorter[j];
                                    column[2] = sorter[k];
                                    column[3] = sorter[m];
                                    column[4] = sorter[l];
                                    column[5] = sorter[o];

                                    if (!isEven(column) && (!isOdd(column)) && (!isContiguous(column)) && (!isSameEnding(column)) && (!isSameTen(column))) {
                                        pw.printf("%d\t%d\t%d\t%d\t%d\t%d\n", column[0], column[1], column[2], column[3], column[4], column[5]);
                                        System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n", column[0], column[1], column[2], column[3], column[4], column[5]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    /**
     * Checks if an array contains more than 4 even numbers
     * @param row the source array of integers
     * @return true, if the count of evens is greater than 4
     */
    public static boolean isEven(int[] row) {
        int count = 0;

        for ( int num : row) {
            if (num % 2 == 0) count++; // If it is even
        }
        return (count > 4);
    }

    /**
     * Checks if an array has more than 4 odd numbers
     * @param row the input array
     * @return true if the count of odd numbers is greater than 4
     */
    private static boolean isOdd(int[] row) {
        int count = 0;

        for ( int num : row) {
            if (num % 2 != 0) count++;
        }
        return (count > 4);
    }

    /**
     * Checks if an array has more than 2 consecutive numbers
     * @param row the input array
     * @return returns true if there are more than 2 consecutive numbers
     */
    private static boolean isContiguous(int[] row) {
        int counter = 0;
        for (int i = 0; i< row.length -1; i++) {
            if (row[i+1] - row[i] == 1) {
                counter++;
            }
        }
        return counter > 2;
    }

    /**
     * Checks if an array has more than 3 numbers with the same ending digit
     * @param row the input array
     * @return true if there are more than 3 numbers with the same ending digit
     */
    private static boolean isSameEnding(int[] row) {
        int[] endings = new int[10];
        boolean sameEnding = false;

        for (int item : row) {
            endings[item % 10]++;
        }
        for (int item : endings) {
            if (item > 3) {
                sameEnding = true;
                break;
            }
        }
        return sameEnding;
    }

    /**
     * Checks if an array has more than 3 numbers in the same group of ten
     * @param row the input array
     * @return true if there are more than 3 numbers in the same group of ten
     */
    private static boolean isSameTen(int[] row) {
        int[] tens = new int[10];
        boolean sameTen = false;

        for (int item : row) {
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
