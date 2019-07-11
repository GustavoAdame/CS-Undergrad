/* Name: Gustavo Adame Delarosa 
 * Course: CSE 002-110
 * Professor: Arielle Carr
 * Date: 8 November 2018
 * Lab Objectives: This lab session will get you familiar with one-dimensional arrays.
*/
//===================================================================================
//Section: Java library import
import java.util.*;
//===================================================================================
//Section: Class, Main Method, Arrays, necessary variables, and Math.random
public class Arrays {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 99 + 0);
        int[] container = new int[100];
        int[] frequency = new int[100];
        int i; int temp =0;
//===================================================================================        
//Section: STDOUT Array contains of random numbers from 0-99        
    System.out.print("Array 1 holds the following integers: ");
        for ( i= 0; i < container.length; i++) {
            container[i] = (int) (Math.random() * 99+ 0) ;
            System.out.print(" " + container[i] + " ");
        }
//===================================================================================        
//Section: Connects the array container to array frequency by temp             
        for (i = 0; i < container.length; i++) {
            temp = container[i];
            frequency[temp]++;
        }
        System.out.println();
//===================================================================================        
//Section: STDOUT Array frequency respect to the true statement        
        for (i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0 && frequency[i] == 1) {
                System.out.printf("%d occurs %d time\n", i, frequency[i]);
            } else if (frequency[i] >= 2) {
                System.out.printf("%d occurs %d times\n", i, frequency[i]);
            }

        }
//===================================================================================        
    } //End of main method
}// End of class 


