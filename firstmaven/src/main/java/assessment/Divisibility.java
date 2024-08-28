package assessment;

 class Divisibility extends Addition {

	 void checkDivisibility(int a, int b) {
	        int sum = super.add(a, b); 
	        if (sum % 10 == 0) {
	            System.out.println("The sum " + sum + " is divisible by 10.");
	        } else {
	            System.out.println("The sum " + sum + " is not divisible by 10.");
	        }
	    }


	public static void main(String[] args) {
		Divisibility obj = new Divisibility();
        obj.checkDivisibility(15, 5); 
        obj.checkDivisibility(12, 3); 
    }
}
	