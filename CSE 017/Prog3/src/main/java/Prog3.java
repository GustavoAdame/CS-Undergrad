/**
 * Course: CSE 17
 * Name: Gustavo Adame Delarosa
 * User ID: gua222
 * Program Description: 
 * The purpose of this assignment is to use an inheritance hierarchy with polymorphic methods  
 * The classes will represent payroll records for a company that has several different types of employees.
 */
//============================================================================================================================
/*Info: Import java packages necessary to this program*/
import java.io.*;
import java.util.*;
//============================================================================================================================
/** Info: Beginning of the Prog3 class and the main method with Exception with the following assets:
 * Object Employee ArrayList used to store information from text file 
 * BufferedReader used to extract the contents of the text file
 * String array to split the information into seperate objects in each element
 * Used the abstact object method to begin the transfer of data into their respective classes 
 */
public class Prog3 {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> Employees = new ArrayList<Employee>();
        BufferedReader payroll = new BufferedReader(new FileReader("Data.txt"));
        String line;
       
        while ((line = payroll.readLine()) != null) {
            String[] dataSet = line.split(" ");
            Employee workers = Employee.factory(dataSet[0], dataSet[1], dataSet[2], Integer.parseInt(dataSet[3]),
                    Integer.parseInt(dataSet[4]), Double.parseDouble(dataSet[5]), Double.parseDouble(dataSet[6]));
            Employees.add(workers);
        }
        payroll.close();
//============================================================================================================================
/** Info: Payroll output
 * Used printf to structure the data 
 * used a for loop to get access of the data and apply it to the printf method
 */
    String header1 = "First Name", header2 = "Last Name", header3 = "SSN", header4 = "Type", header5 = "Hours", header6 = "Total Pay";
        System.out.printf("\n%s\t%s\t\t%s\t%s\t   %s   %s%n", header1, header2, header3, header4, header5, header6);
        double totalSum = 0;
        for (int i = 0; i < Employees.size(); i++) {
            double hours = Employees.get(i).gethours();
            double pay = Employees.get(i).totalPay();
            System.out.printf("%-15s %-15s %-15s %-8s %7.2f     %7.2f%n", Employees.get(i).getfname(), Employees.get(i).getlname(), Employees.get(i).getssn(), Employees.get(i).getType(), hours, pay);
            totalSum += pay;
        }
        System.out.println();
        System.out.printf("Grand Total of all employees' total pay is: %.2f\n",totalSum);
    }
}
