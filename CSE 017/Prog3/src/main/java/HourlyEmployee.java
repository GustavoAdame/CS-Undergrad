class HourlyEmployee extends Employee{
    private double wage;
    public HourlyEmployee(String fname, String lname, String ssn, int hours, double wage){
        super(fname, lname, ssn, hours);
        this.wage = wage;
    }
    @Override
    public String getType(){
        return "HOURLY";
    }
    @Override
    public double totalPay(){
        return hours*wage;
    }

}