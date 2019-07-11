/*
Name: Gustavo Adame Delarosa
Course: CSE 002
Date: 10/19/18 
Objectives: The objective of this homework is to practice using nested loops. 
*/
import java.util.Scanner; //import java scanner class 
public class EncryptedX { // class
  public static void main(String [] args){ // main method
    Scanner myScanner = new Scanner(System.in); 
    boolean run = true; 
    int input = 0;
    System.out.println("Please enter an integer from 0-100: ");
//====================================================================================================================================  
    while (run){  // beginning of for loop 
      if (myScanner.hasNextInt()){ // if scanner input is an integer 
        input=myScanner.nextInt()+1;  // input = the input of the scanner 
        
        if (0<input && input <= 100){ // check if it is in the right range 
          run = false;
        } else { 
          System.out.println("Invalid input. Number not in range. Please enter a valid integer: "); // asks again if not in range 
          
          run=true;
        }  
      } else { 
        System.out.println("Invalid input. Please enter an integer: ");  // other error of not putting anything in 
        run = true; 
        myScanner.next();
        
      } // end of else statement
    }  // end of while loop
//====================================================================================================================================== 
    System.out.println("The user input is: "); 
    System.out.println(input-1); 
      for (int column = 0; column < input; column++){ // beginning of first for loop
        for(int row = 0; row < input; row++ ) { // beginning for second for loop 
        if (row==column ||(column+1) ==(input-row)){ 
          System.out.print(" "); 
        }
        else{
            System.out.print("*");
        }
       // if()
    }// end of for loop 
        System.out.println(""); 
      
      } // end of for loop 

    } // end of main method 
 
 } // end of class