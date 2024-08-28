package interfaceexample;

public class Interface_Multi_Inheri_Class implements Interface_Multi_Inheri,Interface_Multi_Inheri_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_Multi_Inheri_Class obj= new Interface_Multi_Inheri_Class();
		obj.display();
		obj.add();
		obj.sub();
	}

	public void display() {
		
		System.out.println("Hello");
		// TODO Auto-generated method stub
		
	}

	public void add() {
		// TODO Auto-generated method stub
		int a= 10;
		int b= 20;
		int c = a+b;
		System.out.println(c);
	}

	public void sub() {
		// TODO Auto-generated method stub
		int x= 30;
		int y= 20;
		int z = x-y;
		System.out.println(z);
	}

}
