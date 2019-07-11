/* Name: Gustavo Adame Delarosa
 * Course: CSE 002
 * Professor: Arielle Carr 
 * Date: November 12 2018
 * Objectives: This homework gives you practice in manipulating arrays and 
 * in writing methods that have array parameters.
 */
//===============================================================================================
//Section: Import java libraries
import java.util.*;
//===============================================================================================
//Section: Program class, main method, methods being called, check for vaild number of cards, populate array
public class hw08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // suits club, heart, spade or diamond
        String[] suitNames = { "C", "H", "S", "D" };
        String[] rankNames = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] cards = new String[52];
        String[] hand = new String[5];

        int index = 51;
        System.out.println("Enter number of cards you want in your hand between 1-52 ONLY:");
        int numCards = scan.nextInt();
        String[] cards2 = new String[numCards];
        if (numCards >= 1 && numCards <= 52) {
        } else {
            while (cards2.length == 0 || cards2.length > cards.length) {
                System.out.println("Please input a vaild number of cards between 1-52:");
                numCards = scan.nextInt();
                cards2 = new String[numCards];
            }
        }

        int again = 1;
        for (int i = 0; i < 52; i++) {
            cards[i] = rankNames[i % 13] + suitNames[i / 13];
        }
        System.out.println("\nSample Output: ");
        printArray(cards);
        String[] shuffledCards = shuffle(cards);
        System.out.println("\nShuffled cards: ");
        printArray(shuffledCards);

        while (again == 1) {
            System.out.println("\nHand: ");
            hand = getHand(cards, index, numCards);
            printArray(hand);
            index = index - numCards;
            System.out.println("Enter a 1 if you want another hand drawn");
            again = scan.nextInt();
        }
    }
//===============================================================================================
//Section: printArray method, it prints out String[] cards
    public static void printArray(String[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
//===============================================================================================
//Section: shuffle method, it suffle String [] cards by creating a temp variable and randomizing index
    public static String[] shuffle(String[] list) {
        Random random = new Random();
        for (int i = 0; i < 500; i++) {
            int randomIndex = random.nextInt(list.length - 1) + 1;
            String placeholder = list[0];
            list[0] = list[randomIndex];
            list[randomIndex] = placeholder;
        }
        return list;

    }
//===============================================================================================
//Section: getHand method, prints out numCards until its out of bound 
    public static String[] getHand(String[] list, int index, int numCards) {
        String[] hand = new String[numCards];
        for (int i = 0; i < hand.length; i++) {
            int newIndex = index + 1 - numCards + i;
            if (hand.length > index && hand.length != 52) {
                System.out.println("Sorry no more cards available for this hand, restart the program");
                System.exit(0);
            } else if (hand.length > 0 && hand.length < 52) {
                hand[i] = list[newIndex];

            } else if (hand.length == 52) {
                printArray(list);
                System.out.println("\nSorry no more cards available for your next hand, restart the program");
                System.exit(0);

            }

        }
        return hand;
    }
//===============================================================================================    

}
