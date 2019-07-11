import java.util.Scanner;

public class PatternC{
    public static void main(String[] args){
     Scanner userInput = new Scanner(System.in);
     System.out.println("Please input number between 1-10");
     int row = userInput.nextInt();
     while (row > 10 || row <1){
        System.out.println("Try again only 1-10");
        row = userInput.nextInt();
     } 
        for (int i = 1; i <= row; i++) {
             for (int j = row; j > i; j--) {
                    System.out.print(" ");
    }
            for (int k = i; k >= 1; k--){
                System.out.print(k);
    }
                System.out.println();
        }
    }

}

/*
 6
     1
    21
   321
  4321
 54321
654321 
*/


