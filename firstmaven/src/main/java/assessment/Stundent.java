package assessment;

public class Stundent {
	
	 String name;
     int rollNumber;
     Address address; // Aggregation: Student has an Address

    // Constructor to initialize the student details
    public Stundent(String name, int rollNumber, Address address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }

    // Method to print student details with address
    public void printDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Address: " + address.getAddress());
    }
}


