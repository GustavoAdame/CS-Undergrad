/**
 * CSE 017 Name: Gustavo Adame Delarosa 
 * Email: gua222@lehigh.edu
 * Program Description: class under Prog2 
 * Program #1
 */
//===============================================================================
//Info: Start of Tenant class and constructor
public class Tenant {
    private String firstName;
    private String lastName;
    private String aptNumber;
    private double yearlyRent;
    public Tenant() {
        firstName = "null";
        lastName = "null";
        aptNumber = "null";
        yearlyRent = 0.0;
    }
//===============================================================================
//Info: Setters    
    public void setfirstName(String firstName) {this.firstName = firstName;}
    public void setlastName(String lastName) {this.lastName = lastName;}
    public void setaptNumber(String aptNumber) {this.aptNumber = aptNumber;}
    public void setyearlyRent(double yearlyRent) {this.yearlyRent = yearlyRent;}
//===============================================================================
//Info: Getters   
    public String getfirstName() {return firstName;}
    public String getlastName() {return lastName;}
    public String getaptNumber() {return aptNumber;}
    public double getyearlyRent() {return yearlyRent;}
//===============================================================================
//Info: Methods that do the math and full name  
    public double firstPayment(double yearlyRent) {
        this.yearlyRent = yearlyRent;
        double monthlyRent = (yearlyRent / 12);
        monthlyPayment(monthlyRent, yearlyRent);
        return monthlyRent * 3;
    }
    public double monthlyPayment(double monthlyRent, double yearlyRent) {
        this.yearlyRent = yearlyRent;
        double calcMonthlyRent = ((yearlyRent - (2 * monthlyRent)) / 11);
        return calcMonthlyRent;
    }
    public String fullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        String tenantName = firstName + " " + lastName;
        return tenantName;
    }
//===============================================================================
//Info: End of Tenant class
}