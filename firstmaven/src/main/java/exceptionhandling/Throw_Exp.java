package exceptionhandling;

public class Throw_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age= 19;
		if(age>= 18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("Invalid age"); // throw syntax
		}
	}

}
