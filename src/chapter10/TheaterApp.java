package chapter10;

/**
 * This is a booking management program for a theater
 */
public class TheaterApp {

    static boolean [][] gridStatus = new boolean[30][12];

    public static void main(String[] args) {

        // We assume 30 rows and 12 columns in the theater
        // Columns are described by characters A to L
        // Rows are described by numbers 1 to 30
        // Positions are a combination of a column and a row such as C2
        // Meaning 3rd column, 2nd row

        // Assuming 2D boolean grid
        // booked -> true
        // not-booked -> false

        // Test code
        book('L',2);
        book('L',2);
        cancel('L', 2);
        cancel('L', 2);
    }

    /**
     * Books a position
     * @param column the column of the position
     * @param row the row of the position
     */
    public static void book(char column, int row) {

        // A 65 ASCII Value , L 76 ASCII value
        // If I remove 65 from them, I transform them into the range
        // 0 - 11 to fit the array index
        int columnNumber = column - 65;

        if (gridStatus[row][columnNumber]) {
            System.out.println("This position is already booked");
        } else {
            gridStatus[row][columnNumber] = true;
            System.out.println("Position " + column + row + " booked");
        }
    }

    /**
     * Cancels a position
     * @param column the column of the position
     * @param row the row of the position
     */
    public static void cancel(char column, int row) {

        int columnNumber = column - 65;

        if (gridStatus[row][columnNumber]) {
            gridStatus[row][columnNumber] = false;
            System.out.println("Position booked is canceled");
        } else {
            System.out.println("Position is not booked");
        }
        // if position is booked
        // cancel position
    }

}
