package assessment;

public class Contractor extends Employee{
	
	double paymentPerHour;

	public Contractor(String name, int workingHours) {
		super(name, workingHours);
		 this.paymentPerHour = paymentPerHour;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		 return paymentPerHour * workingHours;
	}

}
