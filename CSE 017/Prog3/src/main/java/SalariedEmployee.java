class SalariedEmployee extends Employee{
    private double salary;
    public SalariedEmployee(String fname, String lname, String ssn, int hours, double salary){
        super(fname, lname, ssn, hours);
        this.salary = salary;
    }
    @Override
    public String getType(){
        return "SALARIED";
    }
    @Override
    public double totalPay(){
        return salary/52;
    }

}