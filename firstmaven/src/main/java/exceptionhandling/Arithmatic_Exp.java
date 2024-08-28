package exceptionhandling;

public class Arithmatic_Exp {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try
		{
			int a= 20;
		int b = 0; // arithmatic exception
		int c = a/b; 
		System.out.println(c);
		}
		
		/*catch(ArithmeticException obj)
		{
			System.out.println("Check your calculation again");
		}*/
		finally
		{
			System.out.println("pgm once execute"); // it should execute even if there will be any exception
		}
//		System.out.println("Hai"); // it will not execute due to exception in 9th line 
	}

}
