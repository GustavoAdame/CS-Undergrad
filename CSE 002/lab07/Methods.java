/*Gustavo Adame Delarosa
 *10-26-18
 *CSE 002-110
 *Professor Carr
 *Objectives. Methods allow software developers to modularize and reuse their code in many contexts, reducing the chance for bugs and increasing productivity. 
  This lab will give you basic experience in declaring and calling methods. 
 */
import java.util.Random;//importing the random number generator
import java.util.Scanner;//importing scanner
public class Methods {//begining of every class
  //main method required for every java program
  public static void main(String[]args){//main method
    
    Scanner myScanner = new Scanner (System.in);//calling a scanner
    
      String subject = Subject();//declaring the subject as a string
      System.out.println("The" + " " + Adjectives() + " " + Adjectives() + " " + subject + " " + Verbs() + " " + "the" + " " + Adjectives() + " " + Objects() + ". ");//prints out the first sentence
      laterSentence(subject);//using the same subject fo rlater sentence
      System.out.println("Enter 1 for new sentence, enter 2 to exit");//prints our line to ask user for input
      int newSentence = myScanner.nextInt ();//declaring user input to variable
      
      
     while (newSentence==1){ //begins the while loop for following sentences
      subject = Subject();//putting the subject in a variable
      System.out.println("The" + " " + Adjectives() + " " + Adjectives() + " " + subject + " " + Verbs() + " " + "the" + " " + Adjectives() + " " + Objects() + ". ");
      laterSentence(subject);//using the same subject 
      System.out.println("Enter 1 for new sentence, enter 2 to exit");//prompts user to enter 1 or 2
      newSentence = myScanner.nextInt ();//declaring user input in variable
   }//end of while loop
    
    
  }//end of main method
  
  public static void laterSentence(String subject){//begining of later sentences method
    
      System.out.print("This" + " " + subject + " " + "was " + Adverb() + " " + Adjectives() + " " + "to" + " " + Adjectives() + " " + Objects() + ". ");//prints out second sentence
      System.out.print("It" + " " + "used a" + " " + Objects() + " " + "to " + Verbs() + " " + Objects() + " at the " + Adjectives() + " " + Subject() + ". ");//prints out third sentence
      System.out.println("That " + subject + " " + Verbs() + " her " + Objects() + ". ");//prints out last sentence
    }//end of later sentences method 
  
  public static String Adjectives(){//begining of adjectives method
    int adjectives = (int)(Math.random()*10);//declaring randomly generated number to an integer
      
    switch (adjectives){//begining of switch statement for variable adjevtives
        case 0:
        return "red";//returns red for case 0
        
        case 1:
        return "big";//returns big for case 1
        
        case 2:
        return "loud";//returns loud for case 2
        
        case 3:
        return "beautiful";//returns beautiful for case 3
        
        case 4:
        return "cloudy";//returns cloudy for case 4
       
        case 5:
        return "bad";//returns bad for case 5
        
        case 6:
        return "tall";//returns tall for case 06
        
        case 7:
        return "mean";//returns mean for case 07
        
        case 8:
        return "smelly";//returns smelly for case 08
        
        case 9:
        return "goofy";//returns goofy for case 09
        
    } //end of switch 
    return "";//retuns the adjective 
  }//end of method
 
  public static String Subject(){//begins subjetc method
    int subject = (int)(Math.random()*10);//declares randomly generated number as variable subject
      
    switch (subject){//begings switch statement for variable subject
        case 0:
        return "zookeeper";//the subject of return for case 0
        
        case 1:
        return "teacher";//the subject of return for case 01
        
        case 2:
        return "cat";//the subject of return for case 02
        
        case 3:
        return "mathmetician";//the subject of return for case 03
        
        case 4:
        return "dog";//the subject of return for case 04
        
        case 5:
        return "mother";//the subject of return for case 05
        
        case 6:
        return "child";//the subject of return for case 06
        
        case 7:
        return "squirrel";//the subject of return for case 07
        
        case 8:
        return "sun";//the subject of return for case 08
        
        case 9:
        return "shoe";//the subject of return for case 09
    
    }//end of switch statement
    return "";//returns the subject
  }//end of method
  
  public static String Verbs(){//begings verbs method
    int verbs = (int)(Math.random()*10);//declares randomly generated number as variable verbs
      
    switch (verbs){//begings switch statement for variable varbs 
        case 0:
        return "hopped";//the verb of return for case 0
        
        case 1:
        return "walked";//the verb of return for case 01
        
        case 2:
        return "hit";//the verb of return for case 02
        
        case 3:
        return "drank";//the verb of return for case 03
        
        case 4:
        return "slept";//the verb of return for case 04
        
        case 5:
        return "baked";//the verb of return for case 05
        
        case 6:
        return "played";//the verb of return for case 06
        
        case 7:
        return "ran";//the verb of return for case 07
        
        case 8:
        return "yelled";//the verb of return for case 08
        
        case 9:
        return "kissed";//the verb of return for case 09
     
        }//end of switch statement
    return "";//returns the verb 
    }//end of method
   
  
  public static String Objects(){//begining of objects method
    int objects = (int)(Math.random()*10);//declares randomly generated number as variable object 
     
    switch (objects){//beginging of switch statement for varibale objects
        case 0:
        return "deer";//the object of return for case 0
        
        case 1:
        return "father";//the object of return for case 01
        
        case 2:
        return "baby";//the object of return for case 02
        
        case 3:
        return "notebook";//the object of return for case 03
        
        case 4:
        return "spoon";//the object of return for case 04
        
        case 5:
        return "phone";//the object of return for case 05
        
        case 6:
        return "lollipop";//the object of return for case 06
        
        case 7:
        return "computer";//the object of return for case 07
        
        case 8:
        return "man";//the object of return for case 08
        
        case 9:
        return "professor";//the object of return for case 09
        
        }//end of switch statement
      return "";//returns the object
 
    }//end of method
  
  
  public static String Adverb(){//begings adverb method
    int adverb = (int)(Math.random()*10);//delcares randomly generated number to variable adverb
     
    switch (adverb){//begings switch statement for variable adverb
        case 0:
        return "quickly";//adverb of return for case 0
        
        case 1:
        return "awkwardly";//adverb of return for case 01
        
        case 2:
        return "gracefully";//adverb of return for case 02
        
        case 3:
        return "quietly";//adverb of return for case 03
        
        case 4:
        return "beautifully";//adverb of return for case 04
        
        case 5:
        return "loyally";//adverb of return for case 05
        
        case 6:
        return "competitively";//adverb of return for case 06
        
        case 7:
        return "lazily";//adverb of return for case 07
        
        case 8:
        return "lifelessly";//adverb of return for case 08
        
        case 9:
        return "cheerfully";//adverb of return for case 09
        
        }//end of switch statement
      return "";//retuns adverb
 
    }//end of method
  
 
}//end of class

