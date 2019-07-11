/* Name: Gustavo Adame Delarosa
 * Course: CSE 002
 * Professor Carr
 * Date: 16 Novemeber 2018
 * Objectives. This lab will illustrate the effect of passing arrays as method arguments.
 */
//====================================================================================
//Section: import java libraries
import java.util.Scanner;
//====================================================================================
//Section: program class, main method, calling and initializing methods
public class lab09 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] array0 = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] array1 = copy(array0);
        int[] array2 = copy(array0);
        
        inverter(array0);
        System.out.print("Printing array0: ");
        print(array0);

        System.out.println();
        inverter2(array1);
        System.out.print("Printing array1: ");
        print(array1);

        System.out.println();
        System.out.print("Printing array2: ");
        print(array2);

        System.out.println();
        int[] array3 = inverter2(array2);
        System.out.print("Printing array3: ");
        print(array3);
    }
//====================================================================================
//Section: int array copy method, accepts an int array as input, and returns an int array as output.
    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
//====================================================================================
//Section:  void inverter method, which reverses the order of an array
    public static void inverter(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
//====================================================================================
//Section:  int inverter2 method, uses copy() to make a copy of the input array.  
//Then it uses a copy of the code from inverter() to invert the members of the copy. 
//Finally, it returns the copy as output.
    public static int[] inverter2(int[] array) {
        int[] a = copy(array);
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        return a;
    }
//====================================================================================
//Section:  void print method, uses a for-loop to print all members of the array.
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
//====================================================================================
}