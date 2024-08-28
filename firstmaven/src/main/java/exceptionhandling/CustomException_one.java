package exceptionhandling;

public class CustomException_one {


	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age= 16;
		if(age>= 18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new VotingException("Invalid age"); // it is a custom exception
		}
	}

}

	


