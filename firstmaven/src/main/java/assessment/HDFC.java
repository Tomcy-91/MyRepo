package assessment;

public class HDFC implements RBI {

	public double recurringDeposit(double amount, int duration) {
		// TODO Auto-generated method stub
		
		double rate = INTEREST_RATE / 12;
        double numberOfTimes = 12; 
        double maturityAmount = amount * ((Math.pow(1 + rate, numberOfTimes * duration) - 1) / rate);
        return maturityAmount;
		
	}

}
