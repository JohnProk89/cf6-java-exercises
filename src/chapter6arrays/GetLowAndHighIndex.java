package chapter6arrays;

/** Practice on arrays
 * @author johnp
 */
public class GetLowAndHighIndex {
    public static void main(String[] args) {
        int [] array = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int [] indexes = getLowAndHighIndexOf(array,8);

        //Printing results
        for (int i:indexes) {
            System.out.println(i);
        }
    }

    /**
     * In a sorted array, the method returns the lowest and highest index of a given value
     * @param arr the given array
     * @param key the given value
     * @return a 2-cell array, 1st cell has the lowest index, 2nd cell has the highest index
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        // Declaration and Initialization
        int [] array = new int[2];

        //Getting low index
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == key) {
                array[0] = i;
                break;
            }
        }

        //Getting high index
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == key) {
                array[1] = i;
                break;
            }
        }
        return array;
    }
}
