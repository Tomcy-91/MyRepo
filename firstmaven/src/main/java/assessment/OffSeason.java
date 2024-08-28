package assessment;

public class OffSeason {
	
	 public void discount(double originalPrice) {
	        double discountRate = 0.15;
	        double finalPrice = originalPrice * (1 - discountRate);
	        System.out.printf("Offseason Discount: Original Price: $%.2f, Discounted Price: $%.2f\n", originalPrice, finalPrice);
	    }
	}

