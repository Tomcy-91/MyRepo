package assessment;

public abstract class Employee {
	
	  String name;
	  int workingHours;
	  
	  public Employee(String name, int workingHours) {
	        this.name = name;
	        this.workingHours = workingHours;
	    }
	    public abstract double calculateSalary();
	}



