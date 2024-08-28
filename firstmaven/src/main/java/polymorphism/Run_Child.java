package polymorphism;

public class Run_Child extends Run_Parent1{
	
	public static void main(String args[])
	{
		Run_Child a = new Run_Child();
		a.add(10,30);
	}



public void add(int a , int b)
{
	super.add(10,30);
	int d= a-b;
	System.out.println(d);
}
}