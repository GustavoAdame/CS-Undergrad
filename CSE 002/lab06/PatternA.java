import java.util.Scanner;

public class PatternA{
    public static void main(String[] args){
     Scanner userInput = new Scanner(System.in);
     System.out.println("Please input number between 1-10");
     int row = userInput.nextInt();
     while (row > 10 || row <1){
        System.out.println("Try again only 1-10");
        row = userInput.nextInt();
     } 
        for(int i=1;i<=row;i++){
            for(int k=0;k<i;k++){
                System.out.print(k+1);
            }
                System.out.println();
        }
    }
}
/*
6
1
12
123
1234
12345
123456
*/




