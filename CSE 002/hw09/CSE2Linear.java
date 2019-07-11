/* Name: Gustavo Adame Delarosa
 * Course: CSE 002
 * Professor Carr
 * Date: Nov 24 2018
 * Objectives: This homework gives you practice with arrays and in searching single dimensional arrays
 */
//=============================================================================================
//Section: Import java libraries, program class, CSE2Linear,begins 
import java.util.*;
public class CSE2Linear { 
//=============================================================================================
//Section: Main method, initializing myScanner, inititalize int array grade w/new operator 
//size of 15, initialized int userinput to 0
public static void main(String[] args) { 
    Scanner myScanner = new Scanner(System.in); 
    System.out.println("Please enter 15 ascending ints for final grades in CSE2: ");
    int[] grades = new int[15]; 
    int userInput = 0; 
//=============================================================================================    
//Section: Populates array with userInput with set conditions that must be met
// 1) Must be int 2) Must be between 0-100 3) Must be in ascending order 
for (int i = 0; i < grades.length; i++) {
    while (true) {
      if (myScanner.hasNextInt()) {
        userInput = myScanner.nextInt();
        if (userInput <= 100 && userInput >= 0) {
          if (userInput >= 0) {
            grades[i] = userInput;
            break;
          } else {
              System.out.println("Error. Not in ascending order. Please try agin.");
            }
          }
          else {
            System.out.println("Error. Not within range. Please try again.");
          }
        }
        else {
          myScanner.next();
          System.out.println("Error. Not an integer. Please try again.");
        }
      }
    }
//=============================================================================================
//Section: Calling binarySearch and printing out prompts, statements, and scrambled array  
  System.out.print("Enter a grade to search for: ");
    int target = myScanner.nextInt(); 
    int numSearch = binarySearch(target, grades); 
    if (numSearch >= 0) {
      System.out.println(target + " was found on the list with " + numSearch + " iterations");
    } else {
      System.out.println(target + " was not found on the list with " + -numSearch + " iterations");
    } 

    int[] newArray = scrambledArray(grades);
    for (int i = 0; i < newArray.length; i++) {
      System.out.print(newArray[i] + " ");
    }
//=============================================================================================
//Section: Calling linearSearch and printing out prompts and statements according to set conditions
// 1) If count was greater than 0, then the key was found with # of iterations being count
// 2) If count was negative, then the key was not found but -(-count) still gives # of iterations
  System.out.print("\nEnter a grade to search for: "); 
    int nsearch = myScanner.nextInt(); 
    int linSearch = linearSearch(grades, 15, nsearch); 
    if (linSearch > 0) { 
      System.out.println(nsearch + " was found in the list with " + linSearch + " iterations");
    } 
    else { 
      System.out.println(nsearch + " was not found in the list with " + -linSearch + " iterations");
    } 
  } 
//=============================================================================================
//Section: int binarySearch method, a basic binary search algorithm and count is # of iterations
  public static int binarySearch(int data, int[] array) {
    int low = 0;
    int high = array.length - 1;
    int middle = (low + high) / 2;;
    int count = 0;
    while (high >= low){
      count++;
      if (array[middle] == data) {
        return count;
      }
      if (array[middle] < data) {
        low = middle + 1;
      }
      if (array[middle] > data) {
        high = middle - 1;
      }
    }
    return -count;
  }
//=============================================================================================
//Section: int array scrambledArray method, scrambles grades list by using temp variable
  public static int[] scrambledArray(int[] array) {
    int y = 0;
    int z = 0;
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      z = random.nextInt(array.length);
      y = array[z];
      array[z] = array[i];
      array[i] = y;

    }
    System.out.println("Scrambled: ");
    return array;
  }
//=============================================================================================
//Section: int linearSearch method, a basic linear search algoritm and count is # of iterations
  public static int linearSearch(int array[], int size, int key) {
    int counter = 0;
    for (int i = 0; i < size; i++) {
      counter++;
      if (array[i] == key) {
        return counter;
      }
    } 
    return -counter;
  }
//=============================================================================================
} //end of class 

