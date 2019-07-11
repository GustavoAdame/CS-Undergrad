/**
 * Name: Gustavo Adame Delarosa 
 * Email: gua222@lehigh.edu 
 * Program Name: Prog1
 */

/**
 * Info: 
 * import all package java.util class collections
 * start of program class
 * start of main method
 */

import java.util.*;

public class Square {
    public static void main(String args[]) {
        /**
         * Info: initialize Scanner object "keyboard" Initialize String array to store
         * String input Used the replaceAll method to deal with extra spaces Used the
         * split method to store characters in a index while loop to ask for input 6
         * times but last one doesn't matter at all
         */
        Scanner keyboard = new Scanner(System.in);
        String[] arr = new String[25];
        String input = keyboard.next();
        int count = 0;
        while (count <= 5) {
            input = input.replaceAll("\\s+", " ") + " " + keyboard.nextLine() + " ";
            count++;
        }
        arr = input.split(" ");
        // Please uncomment to see use: printStringarray(arr);

        /**
         * Info: Declared a 5 x 5 2D array Nested for loop to populate the 2D array
         * Variable index is used to increment its index to populate int[][] compGrid
         * Call sumrowsandcols method to do the computations
         */
        int[][] compGrid = new int[5][5];
        int index = 0;
        for (int row = 0; row < compGrid.length; row++) {
            for (int col = 0; col < compGrid[row].length; col++) {
                compGrid[row][col] = Integer.parseInt(arr[index]);
                index++;
            }
        }
        System.out.println();
        sumrowsandcols(compGrid);
        // Please uncomment to see use: print2Darray(compGrid);
    }

    /**
     * Info: These methods are only used to help me visualize the data structures in
     * this program print2Darray, prints out the 2D array being referenced
     * printStringarray, prints out the 1D array being referenced
     */
    public static void print2Darray(int[][] c) {
        System.out.println("Data Stored in grid");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }

    public static void printStringarray(String[] b) {
        System.out.println("Data stored in array helper " + Arrays.toString(b));
    }

    /**
     * Info: sumrowsandcols method contains and does the following: 1) initialize 10
     * int variables to contain the sum of each row and column 2) for loop to go
     * through every index in column/ or row 3) print out the values
     */
    private static void sumrowsandcols(int[][] a) {
        int sumR1 = 0, sumR2 = 0, sumR3 = 0, sumR4 = 0, sumR5 = 0;
        int sumC1 = 0, sumC2 = 0, sumC3 = 0, sumC4 = 0, sumC5 = 0;
        for (int col = 0; col < 5; col++) {
            sumR1 += a[0][col];
            sumR2 += a[1][col];
            sumR3 += a[2][col];
            sumR4 += a[3][col];
            sumR5 += a[4][col];
        }
        for (int row = 0; row < 5; row++) {
            sumC1 += a[row][0];
            sumC2 += a[row][1];
            sumC3 += a[row][2];
            sumC4 += a[row][3];
            sumC5 += a[row][4];
        }
        System.out.println(sumR1 + " " + sumR2 + " " + sumR3 + " " + sumR4 + " " + sumR5);
        System.out.println(sumC1 + " " + sumC2 + " " + sumC3 + " " + sumC4 + " " + sumC5);
    }
}
