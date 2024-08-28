package accessmodifier;

public class AccessModifierPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierPgm obj = new AccessModifierPgm();
		obj.add();
		obj.sub();
		obj.display();
		obj.mul();
	}
	
	public void display()
	{
		String x="Hello";
		System.out.println(x);
	}
	
	private void add()
	{
		int a =10;
		int b=20;
		int c= a+b;
		System.out.println(c);
	}
	
	protected void sub()
	{
		int d =30;
		int e=20;
		int f= d-e;
		System.out.println(f);
	}
	
	void mul()
	{
		int g =10;
		int h=20;
		int i= g*h;
		System.out.println(i);	
	}
}
