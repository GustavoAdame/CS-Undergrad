
/*
Name: Gustavo Adame Delarosa
Date: 9/14/18
Course: CSE 002-110
About: This homework gives me practice in writing code that enables the user to input data and gives me 
practice in performing arithmetic operations.
Program #2. Write a program that prompts the user for the dimensions of a pyramid and returns the volume inside the pyramid. 
*/
import java.util.Scanner; //Import Scanner library

public class Pyramid { // The start of the class
  public static void main(String[] args) { // The start of the main method
    Scanner myScanner = new Scanner(System.in); // initializing myScanner
    System.out.println("The square side of the pyramid is (input length): "); // Output prompt and gets input numLength
    double numLength = myScanner.nextDouble(); // Sets numLength with user input
    System.out.println("The height of the pyramid is (input height): "); // Output prompt and gets input numHeight
    double numHeight = myScanner.nextDouble(); // Sets numHeight with user input
    double volumePyramid = ((numHeight * numLength * numLength) / 3); // Set volumePyramid with calculations of pyramid
                                                                      // volume

    System.out.println("The volume inside the pyramid is: " + volumePyramid); // Output prompt and volumePyramid

  } // end of method
} // end of class