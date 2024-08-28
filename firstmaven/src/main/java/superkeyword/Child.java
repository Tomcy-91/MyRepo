package superkeyword;

public class Child extends ParentClass {
	
	String s="Tomcy";
	
	public void display()
	{
		System.out.println(s);
		System.out.println(super.a);
	}
	public static void main(String args[])
	{
		Child obj= new Child();
		obj.display();
	}
}

