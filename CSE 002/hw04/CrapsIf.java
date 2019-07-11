/*
Name: Gustavo Adame Delarosa
Date: 9/21/18
Course: CSE 2-110
About: This homework gives me practice with random number generation, selection statements, operators, and String manipulation. 
*/

//Import all java classes which I only used scanner and random
import java.util.*;
//----------------------------------------------------------------------------------------------------------------- 
//Start of class
public class CrapsIf { 
  //Start of main mathod   
  public static void main(String[] args) { 
//-----------------------------------------------------------------------------------------------------------------     
      //First prompt to determine whether is random or not
        System.out.println("Do you want to roll two random dice or input the two dice yourself \nPress 1 for random or Press 2 for yourself");
        Scanner userInput = new Scanner(System.in);
        int diceHolder = userInput.nextInt();

//----------------------------------------------------------------------------------------------------------------- 
        //Scanners used for recieving dice values
        Scanner dice1 = new Scanner(System.in);
        Scanner dice2 = new Scanner(System.in);

        Scanner diceRollC = new Scanner(System.in);
        Scanner diceRollD = new Scanner(System.in);
//----------------------------------------------------------------------------------------------------------------- 
        //Random Dice 
        Random rand = new Random();
        if (diceHolder == 1) {
            int diceRollA = rand.nextInt(6) + 1;
            int diceRollB = rand.nextInt(6) + 1;
            System.out.println("Here's dice 1: " + diceRollA + "\nHere's dice 2: " + diceRollB);
//-----------------------------------------------------------------------------------------------------------------           
          //Section: Game Scoring and Terminology 
            if (diceRollA == 1 && diceRollB == 1) {
                System.out.println("Snakes Eyes");
            } else if (diceRollA == 1 && diceRollB == 2) {
                System.out.println("Ace Deuce");
            } else if (diceRollA == 1 && diceRollB == 3) {
                System.out.println("Easy Four");
            } else if (diceRollA == 1 && diceRollB == 4) {
                System.out.println("Fever Five");
            } else if (diceRollA == 1 && diceRollB == 5) {
                System.out.println("Easy Six");
            } else if (diceRollA == 1 && diceRollB == 6) {
                System.out.println("Seven Out");
            } else if (diceRollA == 2 && diceRollB == 2) {
                System.out.println("Hard Four");
            } else if (diceRollA == 2 && diceRollB == 3) {
                System.out.println("Fever five");
            } else if (diceRollA == 2 && diceRollB == 4) {
                System.out.println("Easy six");
            } else if (diceRollA == 2 && diceRollB == 5) {
                System.out.println("Seven out");
            } else if (diceRollA == 2 && diceRollB == 6) {
                System.out.println("Easy Eight");
            } else if (diceRollA == 3 && diceRollB == 3) {
                System.out.println("Hard six");
            } else if (diceRollA == 3 && diceRollB == 4) {
                System.out.println("Seven out");
            } else if (diceRollA == 3 && diceRollB == 5) {
                System.out.println("Easy Eight");
            } else if (diceRollA == 3 && diceRollB == 6) {
                System.out.println("Nine");
            } else if (diceRollA == 4 && diceRollB == 4) {
                System.out.println("Hard Eight");
            } else if (diceRollA == 4 && diceRollB == 5) {
                System.out.println("Nine");
            } else if (diceRollA == 4 && diceRollB == 6) {
                System.out.println("Easy Ten");
            } else if (diceRollA == 5 && diceRollB == 5) {
                System.out.println("Hard Ten");
            } else if (diceRollA == 5 && diceRollB == 6) {
                System.out.println("Yo-leven");
            } else if (diceRollA == 6 && diceRollB == 6) {
                System.out.println("Boxcars");
            }
        }
 //-----------------------------------------------------------------------------------------------------------------     
        //Input Dice
        else if (diceHolder == 2) {
 //-----------------------------------------------------------------------------------------------------------------    
            //Section: The two dices from user input 
                //Prompt to get first dice number 
            System.out.println("Input first number of dice, ONLY NUMBERS between 1-6"); 
                // Scanner diceA to get input 1
            int diceA = diceRollC.nextInt(); 
                //Prompt to get second dice number
            System.out.println("Input second number of dice, ONLY NUMBERS between 1-6"); 
              // Scanner diceD to get input 2
            int diceD = diceRollD.nextInt(); 
//-----------------------------------------------------------------------------------------------------------------  
           //If Statement that sets the range of dice numbers  
            if ((diceA == 1 || diceA == 2 || diceA == 3 || diceA == 4 || diceA == 5 || diceA == 6) && 
                (diceD == 1 || diceD == 2 || diceD == 3 || diceD == 4 || diceD == 5 || diceD == 6)) {
//-----------------------------------------------------------------------------------------------------------------    
              //Section: Game Scoring and Terminology 
                if (diceA == 1 && diceD == 1) {
                    System.out.println("Snakes Eyes");
                } else if (diceA == 1 && diceD == 2) {
                    System.out.println("Ace Deuce");
                } else if (diceA == 1 && diceD == 3) {
                    System.out.println("Easy Four");
                } else if (diceA == 1 && diceD == 4) {
                    System.out.println("Fever Five");
                } else if (diceA == 1 && diceD == 5) {
                    System.out.println("Easy Six");
                } else if (diceA == 1 && diceD == 6) {
                    System.out.println("Seven Out");
                } else if (diceA == 2 && diceD == 2) {
                    System.out.println("Hard Four");
                } else if (diceA == 2 && diceD == 3) {
                    System.out.println("Fever five");
                } else if (diceA == 2 && diceD == 4) {
                    System.out.println("Easy six");
                } else if (diceA == 2 && diceD == 5) {
                    System.out.println("Seven out");
                } else if (diceA == 2 && diceD == 6) {
                    System.out.println("Easy Eight");
                } else if (diceA == 3 && diceD == 3) {
                    System.out.println("Hard six");
                } else if (diceA == 3 && diceD == 4) {
                    System.out.println("Seven out");
                } else if (diceA == 3 && diceD == 5) {
                    System.out.println("Easy Eight");
                } else if (diceA == 3 && diceD == 6) {
                    System.out.println("Nine");
                } else if (diceA == 4 && diceD == 4) {
                    System.out.println("Hard Eight");
                } else if (diceA == 4 && diceD == 5) {
                    System.out.println("Nine");
                } else if (diceA == 4 && diceD == 6) {
                    System.out.println("Easy Ten");
                } else if (diceA == 5 && diceD == 5) {
                    System.out.println("Hard Ten");
                } else if (diceA == 5 && diceD == 6) {
                    System.out.println("Yo-leven");
                } else if (diceA == 6 && diceD == 6) {
                    System.out.println("Boxcars");
                }
//-----------------------------------------------------------------------------------------------------------------          
            //else if statement if user input number outside of 1-6
            } else if ((diceA == 0 || diceA > 6) || (diceD == 0 || diceD > 6)) { 
                System.out.println("Sorry only input dice numbers (1-6), Try Again by restarting the program!");
            }
//-----------------------------------------------------------------------------------------------------------------           

        } //end of else if statment 
    } // end of main method 
} //end of class