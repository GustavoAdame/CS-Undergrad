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
public class CrapsSwitch {
    //Start of main mathod   
    public static void main(String[] args) {
//-----------------------------------------------------------------------------------------------------------------     
        //First prompt to determine whether is random or not
        System.out.println("Do you want to roll two random dice or input the two dice yourself \nPress 1 for random or Press 2 for yourself");
        Scanner userInput = new Scanner(System.in);
        int diceHolder = userInput.nextInt();
        int inputDice;
//----------------------------------------------------------------------------------------------------------------- 
        //Scanners used for recieving dice values
        Scanner dice1 = new Scanner(System.in);
        Scanner dice2 = new Scanner(System.in);

        Scanner diceRollC = new Scanner(System.in);
        Scanner diceRollD = new Scanner(System.in);
        Random rand = new Random();
 //-----------------------------------------------------------------------------------------------------------------    
        //Section: Random Dice 
        switch (diceHolder) {
            case 1:
                int diceRollA = rand.nextInt(6) + 1;
                int diceRollB = rand.nextInt(6) + 1;
                int diceGame1 =  diceRollA + diceRollB;
                int diceGameA = diceRollA * diceRollB;
                System.out.println("Here's dice 1: " + diceRollA + "\nHere's dice 2: " + diceRollB);
//-----------------------------------------------------------------------------------------------------------------        
                //Section: Game Scoring and Terminology 
                switch (diceGame1) {
                    case 2:
                        System.out.println("Snakes Eyes");
                        break;
                    case 3:
                        System.out.println("Ace Deuce");
                        break;
                    case 4:
                        System.out.println("Easy Four");
                        break;
                    case 5:
                        System.out.println("Fever Five");
                        break;
                    case 6:
                        System.out.println("Easy Six");
                        break;
                    case 7:
                        System.out.println("Seven Out");
                        break;
                    case 8:
                        System.out.println("Easy Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 10:
                        System.out.println("Easy Ten");
                        break;
                    case 11:
                        System.out.println("Yo-leven");
                        break;
                    case 12:
                        System.out.println("Boxcars");
                        break;
                }  
                //The duplicates are here
                switch (diceGameA) {
                    case 4:
                        System.out.println("Hard Four, if the dice are the same");
                        break;
                    case 9:
                        System.out.println("Hard Six, if the dice are the same");
                        break;
                    case 16:
                        System.out.println("Hard Eight, if the dice are the same");
                        break;
                    case 25:
                        System.out.println("Hard Ten, if the dice are the same");
                        break;
                }
                break;
//----------------------------------------------------------------------------------------------------------------- 
                //Section: The two dices from user input 
            case 2:
                //Prompt to get first dice number 
                System.out.println("Input first number of dice, ONLY NUMBERS between 1-6");
                // Scanner diceA to get input 1
                int diceA = diceRollC.nextInt();
                //Prompt to get second dice number
                System.out.println("Input second number of dice, ONLY NUMBERS between 1-6");
                // Scanner diceD to get input 2
                int diceD = diceRollD.nextInt();
                //Sum of dice equals score
                int diceGame2 = diceA + diceD;
                int diceGameB = diceA * diceD;
 //----------------------------------------------------------------------------------------------------------------- 
            //Section: Inclusive dice roll 
            switch (diceA) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        break;
                }
                switch (diceD) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        System.out.println("Sorry only input dice numbers (1-6), Try Again by restarting the program!");
                        break;
                }

 //----------------------------------------------------------------------------------------------------------------- 
                //Section: Game Scoring and Terminology 
                switch (diceGame2) {
                    case 2:
                        System.out.println("Snakes Eyes");
                        break;
                    case 3:
                        System.out.println("Ace Deuce");
                        break;
                    case 4:
                        System.out.println("Easy Four");
                        break;
                    case 5:
                        System.out.println("Fever Five");
                        break;
                    case 6:
                        System.out.println("Easy Six");
                        break;
                    case 7:
                        System.out.println("Seven Out");
                        break;
                    case 8:
                        System.out.println("Easy Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 10:
                        System.out.println("Easy Ten");
                        break;
                    case 11:
                        System.out.println("Yo-leven");
                        break;
                    case 12:
                        System.out.println("Boxcars");
                        break;
                }
            //The duplicates are here 
              switch (diceGameB) {
                    case 4:
                        System.out.println("Hard Four, if the dice are the same");
                        break;
                    case 9:
                        System.out.println("Hard Six, if the dice are the same");
                        break;
                    case 16:
                        System.out.println("Hard Eight, if the dice are the same");
                        break;
                    case 25:
                        System.out.println("Hard Ten, if the dice are the same");
                        break;
                }
                break;
        }
//-----------------------------------------------------------------------------------------------------------------          
    } // end of main method 
} //end of class