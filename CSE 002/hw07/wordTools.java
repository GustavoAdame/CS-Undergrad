/* Name: Gustavo Adame Delarosa
 * Course: CSE 002 - 110
 * Professor: Arielle Carr
 * Objectives: This homework has the objective of giving you practice writing methods, 
 * manipulating strings and forcing the user to enter good input. 
 * @ Some of parts of the code comes from stack overflow, 
 * because some of the things requires specific things that is beyond us. It works tho :)
*/
//Imports all java libraries 
import java.util.*;
//=======================================================================================
//Section: Class (wordTools), main method, various methods called in main  
public class wordTools {
    public static void main(String[] args) {
        String userText = sampleText();
        printMenu(userText);
        getNumOfNonWSCharacters(userText);
        getNumOfWords(userText);
        findText(userText);
    }
// =======================================================================================
// Section: Method(sampleText)
// Purpose: Prompts user to input text which is going to used later on as reference
    public static String sampleText() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a sample text:");
        String sampleText = userInput.next();
        sampleText += userInput.nextLine();
        String returnText = "\n" + "You entered: " + "\n" + sampleText;
        System.out.println(returnText);
        return sampleText;
    }

// =======================================================================================
// Section: Method(printMenu)
// Purpose: Output a menu of choices which is run by various while loop when user choose one
    public static String printMenu(String userText) {
        Scanner userInput = new Scanner(System.in);
        String title = "Menu";
        String numSpace = "c";
        String numWords = "w";
        String findText = "f";
        String replaceChar = "r";
        String shortSpace = "s";
        String quit = "q";
        String mainMenu = title + "\n" + numSpace + " - Number of non-whitespace characters" + "\n" + numWords
                + " - Number of words" + "\n" + findText + " - Find text" + "\n" + replaceChar + " - Replace all !'s"
                + "\n" + shortSpace + " - Shorten spaces" + "\n" + quit + " - Quit";
        System.out.println("\n" + mainMenu);
        System.out.println("\n" + "Choose an option: ");

        String userChoice = userInput.next();
        while (!userChoice.equals(numSpace) && !userChoice.equals(numWords) && !userChoice.equals(findText)
                && !userChoice.equals(replaceChar) && !userChoice.equals(shortSpace) && !userChoice.equals(quit)) {
            System.out.println("Please input a valid statement");
            userChoice = userInput.next();
        }
        while (userChoice.equals(numSpace) || userChoice.equals(quit) || userChoice.equals(numWords)
                || userChoice.equals(findText) || userChoice.equals(replaceChar) || userChoice.equals(shortSpace)) {
            if (userChoice.equals(quit)) {
                System.out.println("Quitting...");
                System.exit(0);
            } else if (userChoice.equals(numSpace)) {
                getNumOfNonWSCharacters(userText);
                System.out.println("\n" + mainMenu + "\n" + "Choose an option: ");
                userChoice = userInput.next();

            } else if (userChoice.equals(numWords)) {
                getNumOfWords(userText);
                System.out.println("\n" + mainMenu + "\n" + "Choose an option: ");
                userChoice = userInput.next();
           
            } else if (userChoice.equals(findText)) {
                findText(userText);
                System.out.println("\n" + mainMenu + "\n" + "Choose an option: ");
                userChoice = userInput.next();

            } else if (userChoice.equals(replaceChar)) {
                replaceExclamation(userText);
                System.out.println("\n" + mainMenu + "\n" + "Choose an option: ");
                userChoice = userInput.next();
          

            } else if (userChoice.equals(shortSpace)) {
                shortenSpace(userText);
                System.out.println("\n" + mainMenu + "\n" + "Choose an option: ");
                userChoice = userInput.next();
            
            }
        }

        return printMenu(userText);
    }

// =======================================================================================
// Section: Method(getNumOfNonWSCharacters)
// Purpose: Checks all the non-whitespace characters and outputs value as int
    public static int getNumOfNonWSCharacters(String userText) {
        int numSpace = userText.replace(" ", "").length();
        System.out.println("Number of non-whitespace characters: " + numSpace);
        return numSpace;
    }

// =======================================================================================
// Section: Method(getNumOfWords)
// Purpose: Checks all the words in the text and outputs value as int
    public static int getNumOfWords(String userText) {
        if (userText == null || userText.isEmpty()) {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(userText);
        System.out.println("Number of words: " + tokens.countTokens());
        return tokens.countTokens();
    }

// =======================================================================================
// Section: Method(findText)
// Purpose: Checks all the words in the text that you are searching for and outputs the frequency
    public static int findText(String userText) {
        String[] words = userText.split(" ");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a word or phrase to be found: ");

        String text = userInput.next();
        Map<String, Integer> frequency = new HashMap<String, Integer>();

        for (String word : words) {

            Integer f = frequency.get(word);
            // checking null
            if (f == null)
                f = 0;
            frequency.put(word, f + 1);
        }
        System.out.println("\"" + text + "\"" + " instance: " + frequency.get(text));
        return frequency.get(text);
    }

// =======================================================================================
// Section: Method(replaceExclamation)
// Purpose: Replaces all the ! to . in the text and outputs the edited text
    public static String replaceExclamation(String userText) {
        String s1 = userText;
        String replaceString = s1.replace('!', '.');// replaces all occurrences of 'a' to 'e'
        System.out.println("Edited text: " + "\n" + replaceString);
        return replaceString;
    }

// =======================================================================================
// Section: Method(shortenSpace)
// Purpose: Minimizes all the spaces in the text to one space and outputs the edited text
    public static String shortenSpace(String userText) {
        String s2 = userText;
        s2 = userText.replaceAll("\\s+", " ");
        System.out.println("Edited text: " + "\n" + s2);
        return s2;
    }

}
