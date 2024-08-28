package superkeyword;

public class Child_Method extends ParentMethod {
	
	public void print()
	{
		super.display();
		String b= "Hello";
		System.out.println(b);
	}

public static void main(String args[])
{
	Child_Method obj= new Child_Method();
	obj.print();
}
}
