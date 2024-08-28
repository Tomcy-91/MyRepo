package exceptionhandling;

public class ArrayIndexOutboundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"Red", "Rose", "Black","Yellow", "White"};
		for (int i=0;i<=a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
