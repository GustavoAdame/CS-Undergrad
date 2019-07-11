/*
Name: Gustavo Adame Delarosa
Course: CSE 002
Date: 10.5.18
*/
import java.util.*; // import java class

public class whileLoop { //Start of class
    public static void main(String[] args) { //Start of the main method 
        Scanner myScanner = new Scanner(System.in);
//----------------------------------------------------------------------------------------------------------------
        System.out.println("Please input course number");
        while (!myScanner.hasNextInt()) { // While loop looks for a false statement- if its true ask for int
            myScanner.next();
            System.out.println("Please input a vaild statement");
        }
        int numCourse = myScanner.nextInt();
//----------------------------------------------------------------------------------------------------------------
        System.out.println("Please input department name");
        while (!myScanner.hasNext()) { // While loop looks for a false statement- if its true ask for String
            myScanner.nextInt();
            System.out.println("Please input a vaild statement");
        }
        String nameDep = myScanner.next();
        nameDep += myScanner.nextLine();
//----------------------------------------------------------------------------------------------------------------  
        System.out.println("Please input the number of times the course meets in a week");
        while (!myScanner.hasNextInt()) { // While loop looks for a false statement- if its true ask for int
          myScanner.next();
            System.out.println("Please input a vaild statement");
        }
        int numTime = myScanner.nextInt();
//----------------------------------------------------------------------------------------------------------------

        System.out.println("Please input the time of day the course begins in 24-hour format");
        while (!myScanner.hasNextInt()) { // While loop looks for a false statement- if its true ask for int
          myScanner.next();
            System.out.println("Please input a vaild statement");
        }
        int numDay = myScanner.nextInt();
//----------------------------------------------------------------------------------------------------------------

        System.out.println("Please input Instructor name");
        while (!myScanner.hasNext()) { // While loop looks for a false statement- if its true ask for String
            myScanner.nextInt();
            System.out.println("Please input a vaild statement");
        }
        String namePro = myScanner.next();
        namePro += myScanner.nextLine();
//----------------------------------------------------------------------------------------------------------------
        System.out.println("Please input the number of students in the class");
        while (!myScanner.hasNextInt()) { // While loop looks for a false statement- if its true ask for int
          myScanner.next();
            System.out.println("Please input a vaild statement");
        }
        int numStudents = myScanner.nextInt();
//----------------------------------------------------------------------------------------------------------------
        System.out.println("\nYour course number is " + numCourse);
        System.out.println("\nYour department name is " + nameDep);
        System.out.println("\nThe number of times meet in a week is " + numTime);
        System.out.println("\nThe time of day the course begins " + numDay);
        System.out.println("\nYour Instructor name is " + namePro);
        System.out.println("\nThe number of students in the class " + numStudents);
        System.out.println("\n  ");
//----------------------------------------------------------------------------------------------------------------
    }
}