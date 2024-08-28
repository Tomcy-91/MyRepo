package assessment;

public class Emptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor contractor = new Contractor("Joby Jose", 160);
		 Fulltimeemp fullTimeEmployee = new Fulltimeemp("James Thomas", 40); 
		 System.out.printf("Contractor %s earns: $%.2f\n", contractor.name, contractor.calculateSalary());
	     System.out.printf("Full-Time Employee %s earns: $%.2f\n", fullTimeEmployee.name, 
	    		 fullTimeEmployee.calculateSalary());
	}

}
