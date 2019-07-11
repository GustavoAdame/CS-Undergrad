/*
Name: Gustavo Adame Delarosa
Course: CSE 2-110
Instructor: Dr. Carr
Date: 10/5/18
Objectives: TThe objective of this homework is to use while loops to calculate poker probabilities
*/
import java.util.*;

public class Hw05 {
    public static void main(String[] args) {
 //==============================================================================================================
        int twopair_counter = 0; //counts two pair hands
        int onepair_counter = 0; //counts one pair hands
        int fourKind_counter = 0; //counts two pair hands
        int threeKind_counter = 0; //counts one pair hands

        Scanner input = new Scanner(System.in); //Scanner in the program
//==============================================================================================================
        //check for int from user 
        System.out.println("Enter number of hands: ");
        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Please input an integer only");
        }
        int totalrounds = input.nextInt();
//==============================================================================================================        
        //Section: The loop that generates the number of hands by the user's input 
        int round = 1; //Counter: round
        while (round <= totalrounds) {
            boolean twopair = false;
            boolean onepair = false;

            boolean fourKind = false;
            boolean threeKind = false;
//============================================================================================================== 
            //Section: Draw five distinct cards
            int c1 = (int)(Math.random() * 52) + 1;
            int c2 = (int)(Math.random() * 52) + 1;
            while (c2 == c1) {
                c2 = (int)(Math.random() * 52) + 1;
            }
            int c3 = (int)(Math.random() * 52) + 1;
            while ((c3 == c1) || (c3 == c2)) {
                c3 = (int)(Math.random() * 52) + 1;
            }
            int c4 = (int)(Math.random() * 52) + 1;
            while ((c4 == c1) || (c4 == c2) || (c4 == c3)) {
                c4 = (int)(Math.random() * 52) + 1;
            }
            int c5 = (int)(Math.random() * 52) + 1;
            while ((c5 == c1) || (c5 == c2) || (c5 == c3) || (c5 == c4)) {
                c5 = (int)(Math.random() * 52) + 1;
            }
//==============================================================================================================      
            /*  Section: Set value for suit and the value 
                Key (Use for reference): 
                diamonds = 0, clubs = 1, hearts = 2, spades = 3 
                ace = 0, jack = 11, queen = 12, king = 13, else = number
            */
            int c1suit = (c1 - 1) / 13;
            int c2suit = (c2 - 1) / 13;
            int c3suit = (c3 - 1) / 13;
            int c4suit = (c4 - 1) / 13;
            int c5suit = (c5 - 1) / 13;

            int c1num = (c1 % 13);
            int c2num = (c2 % 13);
            int c3num = (c3 % 13);
            int c4num = (c4 % 13);
            int c5num = (c5 % 13);
            /*           
                Use this section to test out if the program works by printing out types of cards
                        
                  System.out.println("\nCard ID is: " + c1 + ". Suit is: " + c1suit + ". Number is: " + c1num + ".");
            			System.out.println("Card ID is: " + c2 + ". Suit is: " + c2suit + ". Number is: " + c2num + ".");
            			System.out.println("Card ID is: " + c3 + ". Suit is: " + c3suit + ". Number is: " + c3num + ".");
            			System.out.println("Card ID is: " + c4 + ". Suit is: " + c4suit + ". Number is: " + c4num + ".");
            			System.out.println("Card ID is: " + c5 + ". Suit is: " + c5suit + ". Number is: " + c5num + ".");
            */
 //==============================================================================================================
            //Section: Compares to figure out what type of hand the user has
            //checks four of a kind 
            if (
                ((c1num == c2num && c1num == c3num && c1num == c4num)) ||
                ((c2num == c1num && c2num == c3num && c2num == c4num)) ||
                ((c3num == c1num && c3num == c2num && c3num == c4num)) ||
                ((c4num == c1num && c4num == c2num && c4num == c3num)) ||
                ((c5num == c1num && c5num == c2num && c5num == c3num && c5num == c4num))) {
                fourKind_counter++;
                fourKind = true;
                // Use this to test code
                //System.out.println("Four of a Kind!!!!");
            }

            //checks three of a kind
            if (fourKind == false) {
                if ((c1num == c2num && c1num == c3num) ||
                    (c1num == c3num && c1num == c4num) ||
                    (c1num == c4num && c1num == c5num) ||
                    (c2num == c1num && c2num == c3num) ||
                    (c3num == c1num && c3num == c2num) ||
                    (c3num == c4num && c3num == c5num) ||
                    (c4num == c1num && c4num == c2num) ||
                    (c4num == c3num && c1num == c5num) ||
                    (c5num == c1num && c5num == c2num) ||
                    (c5num == c3num && c1num == c4num)) {
                    threeKind_counter++;
                    threeKind = true;
                    //Use this to test code
                    //System.out.println("Three of a Kind!!!!!");
                }
            }
            //checks for two pair
            if (((c1num == c2num) && (c3num == c4num)) ||
                ((c1num == c3num) && (c2num == c4num)) ||
                ((c1num == c4num) && (c2num == c3num)) ||
                ((c1num == c2num) && (c3num == c5num)) ||
                ((c1num == c3num) && (c2num == c5num)) ||
                ((c1num == c4num) && (c3num == c5num)) ||
                ((c1num == c3num) && (c2num == c5num)) ||
                ((c3num == c2num) && (c5num == c4num)) ||
                ((c1num == c3num) && (c5num == c4num))) {
                twopair_counter++;
                twopair = true;
                //Use this to test code
                //System.out.println("Two pair!!!!!");
            }

            //checks for one pair
            if (twopair == false) {
                if ((c1num == c2num) ||
                    (c1num == c3num) ||
                    (c1num == c4num) ||
                    (c1num == c5num) ||
                    (c2num == c3num) ||
                    (c2num == c4num) ||
                    (c2num == c5num) ||
                    (c3num == c4num) ||
                    (c3num == c5num) ||
                    (c4num == c5num)) {
                    onepair_counter++;
                    onepair = true;
                    //Use this to test code
                    //System.out.println("One pair!!!!!");
                }
            }
            round++;
        }
//==============================================================================================================       
        //Section: Prints out all the output in the code
        System.out.println("The number of loops: " + totalrounds);
        System.out.println("The probability of Four-of-a-kind: " + new java.text.DecimalFormat("0.000").format(((double) fourKind_counter / totalrounds)));
        System.out.println("The probability of Three-of-a-kind: " + new java.text.DecimalFormat("0.000").format(((double) threeKind_counter / totalrounds)));
        System.out.println("The probability of Two-pair: " + new java.text.DecimalFormat("0.000").format(((double) twopair_counter / totalrounds)));
        System.out.println("The probability of One-pair: " + new java.text.DecimalFormat("0.000").format(((double) onepair_counter / totalrounds)));
//==============================================================================================================        
    }

}