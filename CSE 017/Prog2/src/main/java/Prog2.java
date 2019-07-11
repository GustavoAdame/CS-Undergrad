
/**
 * CSE 017
 * Name: Gustavo Adame Delarosa
 * Email: gua222@lehigh.edu
 * Program Description: Contains the main method and creates objects
 * Program #2
 */
//===================================================================================================
//Info: import java classes 
import java.util.*;
//===================================================================================================
// Info: start of class and main method, Initialize Scanner object, Initialize ArrayList, Initialize Tenant class object 
public class Prog2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> Tenant = new ArrayList<String>();
        Tenant outputClass = new Tenant();
//===================================================================================================
// Info: prompt user to input # of tenants, then loops several prompts for each tenant
        System.out.println("Enter number of tenants: ");
        int numTenant = input.nextInt();

        for (int i = 0; i < numTenant; i++) {
            System.out.println("\nEnter first name: ");
            String firstName = input.next();
            Tenant.add(firstName);

            System.out.println("Enter last name: ");
            String lastName = input.next();
            Tenant.add(lastName);

            System.out.println("Enter apt name: ");
            String aptNumber = input.next();
            Tenant.add(aptNumber);

            System.out.println("Enter yearly rent: ");
            while (!input.hasNextInt()) {
                String voidValue = input.next();
                System.out.println("Error: please enter a numeric value.");
                System.out.println("Enter yearly rent: ");
            }
            int yearlyRent = input.nextInt();
            Tenant.add(Integer.toString(yearlyRent));
            System.out.println();
        }
//===================================================================================================
//Info: the for loop goes through the ArrayList to set values to the Tenant static methods, then, with a getter, print those values for each tenant
        for (int i = 0; i < Tenant.size(); i++) {
            outputClass.setfirstName(Tenant.get(i));
            i++;
            outputClass.setlastName(Tenant.get(i));
            i++;
            System.out.println(outputClass.fullName(outputClass.getfirstName(), outputClass.getlastName()));

            outputClass.setaptNumber(Tenant.get(i));
            System.out.println("Apt " + outputClass.getaptNumber());
            i++;

            double yearRent = Double.parseDouble(Tenant.get(i));
            outputClass.setyearlyRent(yearRent);
            String firstPay = String.format("First Payment: %.2f",
                    outputClass.firstPayment(outputClass.getyearlyRent()));
            String monthPay = String.format("Monthly Payment: %.2f",
                    outputClass.monthlyPayment((outputClass.getyearlyRent() / 12), outputClass.getyearlyRent()));
            System.out.println(firstPay);
            System.out.println(monthPay);
            System.out.println();
        }
    }
//===================================================================================================
// Info: End of Prog2 class
}