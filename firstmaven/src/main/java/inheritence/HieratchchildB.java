package inheritence;

public class HieratchchildB extends HierchParentA{
	
	public void add()
	{
		int a= 10;
		int b= 50;
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HieratchchildB obj3 = new HieratchchildB();
		obj3.display();
		obj3.add();
	}

}
