package inheritence;

 class Salary extends Employee {
    protected double hra;
    protected double pf;
    
    public Salary(double basicPay, double deduction, double bonus) {
        super(basicPay, deduction, bonus);
        calculate(); 
    }
    
    private void calculate() {
        hra = 0.05 * basicPay; 
        pf = 0.20 * basicPay;  
    }

}
