package inheritence;

public class Childclass1 extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass1 ob= new Childclass1();
		ob.display();
		ob.sub();
	}
	public void sub()
	{
		int x = 30;
		int y=10;
		int z=x-y;
		System.out.println(z);
	}
}
