package inheritence;

public class MultiinheriC extends MultiinheriB {
	
	public void display3()
	{
		String c= "John";
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiinheriC obj= new MultiinheriC();
		obj.display();
		obj.display1();
		obj.display3();
	}

}
