package superkeyword;

public class Constructor_Child extends Constructor_Parent{
	
	public  Constructor_Child(int a,int b)
	{
		
		int c= a+b;
		System.out.println(c);
	}
public static void main(String args[])
{
	Constructor_Child obj1= new Constructor_Child(10,20);
	
	
	
}

}
