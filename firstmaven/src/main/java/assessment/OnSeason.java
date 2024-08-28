package assessment;

public class OnSeason {
	
	public void discount(double originalPrice) {
        double discountRate = 0.40; 
        double finalPrice = originalPrice * (1 - discountRate);
        System.out.printf("Onseason Discount: Original Price: $%.2f, Discounted Price: $%.2f\n", originalPrice, finalPrice);
    }
}


