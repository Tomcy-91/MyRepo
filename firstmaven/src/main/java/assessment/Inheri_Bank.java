package assessment;

public class Inheri_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HDFC hdfc = new HDFC();
	       
	        double depositAmount = 1000.00; 
	        int durationInYears = 5;
	        
	        double maturityAmount = hdfc.recurringDeposit(depositAmount, durationInYears);
	        
	        System.out.printf("After depositing $%.2f per month for %d years, "
	        		+ "the maturity amount will be: $%.2f\n", depositAmount, durationInYears, maturityAmount);
	    }

	}


