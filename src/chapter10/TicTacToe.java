package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Tic Tac Toe demo
 */
public class TicTacToe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        int column = 0;
        int player = 0;
        char currentPlayer;
        boolean isInputInteger = false;
        boolean isMoveEligible = false;
        boolean isWinnerEligible = false;
        boolean isDraw = false;

        // Populating a 2D array
        char [][] grid = new char[3][3];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = '-';
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        while (!(isDraw | isWinnerEligible)) {

            // Defining which player is on the move
            if (player % 2 == 0) {
                currentPlayer = 'X';
            } else {
                currentPlayer = 'O';
            }
            System.out.println("Player " + currentPlayer + " make a move");

            // Taking input
            while (!(isMoveEligible & isInputInteger)) {
                try {
                    System.out.println("Firstly define an eligible row 1 to 3");
                    row = scanner.nextInt();
                    System.out.println("Then define an eligible column 1 to 3");
                    column = scanner.nextInt();
                    isInputInteger = true;
                    isMoveEligible = checkMove(grid, row, column);
                } catch (InputMismatchException e) {
                    System.out.println("Provide an integer please");
                    scanner.nextLine();
                }
            }

            grid[row - 1][column - 1] = currentPlayer;
            printGrid(grid);
            isWinnerEligible = checkWinner(currentPlayer, grid);
            if (isWinnerEligible) {
                continue;
            }
            isDraw = checkDraw(grid);
            isInputInteger = false;
            player++;
        }
    }

    /**
     * Checks if we have a winner
     * @param player the current player
     * @param grid the current grid
     * @return true if we have a winner
     */
    public static boolean checkWinner(char player, char [][] grid) {
        int counter = 0;
        boolean isWinner = false;

        for (char[] chars : grid) {
            for (int j = 0; j < grid.length; j++) {
                if (chars[j] == player) {
                    counter++;
                }
            }
            if (counter == 3) {
                System.out.println("We have a winner: Player " + player);
                isWinner = true;
            }
            counter = 0;
        }

        for (int i = 0; i < grid.length; i++) {
            for (char[] chars : grid) {
                if (chars[i] == player) {
                    counter++;
                }
            }
            if (counter == 3) {
                System.out.println("We have a winner: Player " + player);
                isWinner = true;
            }
            counter = 0;
        }

        if (player == grid[0][0] & grid[0][0] == grid[1][1] & grid[1][1] == grid[2][2]) {
            System.out.println("We have a winner: Player " + player);
            isWinner = true;
        }
        if (player == grid[0][2] & grid[0][2] == grid[1][1] & grid[1][1] == grid[2][0]) {
            System.out.println("We have a winner: Player " + player);
            isWinner = true;
        }

        return isWinner;
    }

    /**
     * Checks if we have a draw
     * @param grid the current grid
     * @return true if we have a draw
     */
    public static boolean checkDraw(char[][] grid) {
        boolean isDraw = false;
        int counter = 9;

        for (char[] chars : grid) {
            for (int j = 0; j < grid.length; j++) {
                if (chars[j] != '-') {
                    counter--;
                }
            }
        }

        if (counter == 0) {
            isDraw = true;
            System.out.println("We have a draw");
        }
        return isDraw;
    }

    public static void printGrid(char[][] grid) {
        for (char[] chars : grid) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Checks if a move is valid
     * @param grid the current grid
     * @param row the row to put the move
     * @param column the column to put the grid
     * @return true if move is valid
     */
    public static boolean checkMove(char[][] grid, int row, int column) {
        boolean isMoveOnGrid = false;
        boolean isSpaceFree = false;

        if ((row == 1 | row == 2 | row == 3) & (column == 1 | column == 2 | column == 3)) {
            isMoveOnGrid = true;
            if (grid[row - 1][column - 1] == '-') {
                isSpaceFree = true;
            }
        }

        return isMoveOnGrid & isSpaceFree;
    }
}
