package assessment;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double price = 100.00; 
	        
	        OnSeason onseason = new OnSeason();
	        OffSeason offseason = new OffSeason();
	        
	        onseason.discount(price);  
	        offseason.discount(price); 
	    }
	}


