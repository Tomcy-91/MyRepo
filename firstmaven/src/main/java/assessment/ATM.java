package assessment;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Bank bank = new Bank();
	      
	        User user = new User(bank);
	        
	        user.setUserPin(1234);
	       
	        user.withdrawAmount(1234, 500.00);
	     
	        user.withdrawAmount(1111, 500.00);
	   
	}

}
