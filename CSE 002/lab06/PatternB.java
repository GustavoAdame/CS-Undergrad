import java.util.Scanner;

public class PatternB{
    public static void main(String[] args){
     Scanner userInput = new Scanner(System.in);
     System.out.println("Please input number between 1-10");
     int row = userInput.nextInt();
     while (row > 10 || row <1){
        System.out.println("Try again only 1-10");
        row = userInput.nextInt();
     } 
          for(int i = row; i>=1; i--) { 
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }    
        }
    }
    /*
6
123456
12345
1234
123
12
1
    */






