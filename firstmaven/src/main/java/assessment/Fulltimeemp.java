package assessment;

public class Fulltimeemp extends Employee{
	
	public static final double PAYMENT_PER_DAY = 8 * 20;

	public Fulltimeemp(String name, int workingHours) {
		super(name, workingHours);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return PAYMENT_PER_DAY * (workingHours / 8.0);
	}

}
