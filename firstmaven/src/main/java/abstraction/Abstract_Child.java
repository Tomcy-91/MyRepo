package abstraction;

public class Abstract_Child extends Abstraction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Child obj=new Abstract_Child();
		obj.display();
		obj.hide();
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		System.out.println("Hide");
	}

}
