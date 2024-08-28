package assessment;

public class Bank {
	
	 private int pin;
	 
	  public void setPin(int pin) {
	  this.pin = pin;
	
	  }
	  public boolean validatePin(int pin) {
	      
	        int[] validPins = {1001, 1234, 1212};
	        
	        for (int validPin : validPins) {
	            if (this.pin == validPin && this.pin == pin) {
	                return true; 
	            }
	        }
	        return false; 
	    }
	}


