package inheritence;

public class HierachchildC extends HierchParentA{
	
	public void sub()
	{
		int k= 30;
		int u= 10;
		int t= k+u;
		System.out.println(t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierachchildC obj5 = new HierachchildC();
		obj5.display();
		obj5.sub();
	}

}
