import java.util.*;
public abstract class Employee{
    private String fname;
    private String lname;
    private String ssn;
    protected int hours;
    public Employee(String fname, String lname, String ssn, int hours){
        this.fname = fname;
        this.lname = lname;
        this.ssn = ssn;
        this.hours = hours;
    }
    protected String getfname(){
        return this.fname = fname;
    }
    protected String getlname(){
        return this.lname = lname;
    }
    protected String getssn(){
        return this.ssn = ssn;
    }
    protected int gethours(){
        return this.hours = hours;
    }
    public abstract String getType();
    public abstract double totalPay();
    public static Employee factory(String fname, String lname, String ssn, int type, int hours, double wage, double salary){
       switch (type){
        case 1:
            return new HourlyEmployee(fname,lname, ssn, hours, wage);
        case 2: 
            return new SalariedEmployee(fname,lname, ssn, hours,salary);
        default:
             throw new IllegalArgumentException();
       }
    }
}
