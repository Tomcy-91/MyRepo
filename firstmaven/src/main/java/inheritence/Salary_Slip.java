package inheritence;

class Salary_Slip extends Salary {

    
    public Salary_Slip(double basicPay, double deduction, double bonus) {
        super(basicPay, deduction, bonus);
    }

    public void print_Slip() {
        double totalSalary = basicPay + hra - pf - deduction + bonus;

        System.out.println("\nSalary Slip:");
        System.out.println("Basic Pay: $" + basicPay);
        System.out.println("HRA: $" + hra);
        System.out.println("PF: $" + pf);
        System.out.println("Deduction: $" + deduction);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + totalSalary);
    }

	public static void main(String[] args) {
		
		 double basicPay = 6000;   
	        double deduction = 500;   
	        double bonus = 1000;    

	     
	        Salary_Slip salarySlip = new Salary_Slip(basicPay, deduction, bonus);

	        salarySlip.print_Slip();
	}

}
