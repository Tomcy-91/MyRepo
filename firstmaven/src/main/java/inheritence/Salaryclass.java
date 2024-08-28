package inheritence;

public class Salaryclass {
 
	 int bpay=50000;
		int da=5;
		int pf=20;
	public void empsal()
	 {
	 System.out.println("Basic Pay =" +bpay);
	
	
}
	
	public class SlarayClass2 extends Salaryclass
	{
	
	public void salcal()
	{
	int hraamt,total,deductamt,pfamt;
	hraamt = (bpay*5)/100;
	deductamt=(bpay*da)/100;
	pfamt=(bpay*pf)/100;
	total=hraamt +deductamt + pfamt;
	
	System.out.println("HRA=" +hraamt);
	System.out.println("Decustion=" +deductamt);
	System.out.println("Total Salary=" +total );
		
	
	}
	
		
		public void main(String args[]) 
		{
			SlarayClass2 sal= new SlarayClass2();
			sal.empsal();
			sal.salcal();
		}
	}
}
