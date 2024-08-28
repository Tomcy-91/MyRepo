package assessment;

public class User {
	
	private Bank bank; 
	 public User(Bank bank) {
	 this.bank = bank;
	    }
	 public void setUserPin(int pin) {
	        bank.setPin(pin);
	    }
	 
	 public void withdrawAmount(int enteredPin, double amount) {
	        if (bank.validatePin(enteredPin)) {
	            System.out.println("PIN is valid. Amount $" + amount + " withdrawn successfully.");
	        } else {
	            System.out.println("Invalid PIN. Transaction failed.");
	        }
	    }
	}
