/*
Name: Gustavo Adame Delarosa
Date: 9/14/18
Course: CSE 002-110
About: This homework gives me practice in writing code that enables the user to input data and gives me 
practice in performing arithmetic operations.

Program #1. Hurricanes drop a tremendous amount of water on areas of land.  
Write a program that asks the user for doubles that represent the number of acres of land affected by hurricane precipitation 
and how many inches of rain were dropped on average.
*/
import java.util.Scanner; //Import Scanner library
public class Convert{ //The start of the class
  public static void main(String[] args){ //The start of the main method
    Scanner myScanner = new Scanner(System.in); //initializing myScanner 
  
    System.out.println("Enter the affected area in acres: "); //Output prompt and gets input numAcres
    double numAcres = myScanner.nextDouble (); //Sets numAcres with user input
    System.out.println("Enter the rainfall in the affected area: "); //Output prompt and gets input numRainDropped
    double numRainDropped = myScanner.nextDouble (); //Sets numRainDroppeds with user input
    double cubicInchesRain = Math.pow(numRainDropped,3.0); //Set cubicInchesRain with calculations of numRainDropped raised to the power of 3
    //Calculations line 21-25
    double squareFeet =  numAcres * 43560;
    double feetOfRain = numRainDropped / 12.0;
    double cubicFeet = squareFeet * feetOfRain; 
    double cubicMilesOfRain = cubicFeet / (double)Math.pow(5280, 3.0);
   
    System.out.println(cubicMilesOfRain + " cubic miles"); //Output prompt and gets input cubicMilesOfRain
    
  } //end of method
} //end of class