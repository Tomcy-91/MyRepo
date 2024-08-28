package collection;
import java.util.ArrayList;
import java.util.List;

public class List_Exp {
	
	public static void main(String args[])
	{
		List <String> obj = new ArrayList<String>();
		obj.add("Red");
		obj.add("Blue");
		obj.add("Yello");
		obj.add("Yello");
		System.out.println(obj);
		obj.set(1, "Black");
		System.out.println(obj);
		int a = obj.indexOf("Yello");// find the first occurance
		System.out.println(a);
		
		int b = obj.lastIndexOf("Yello"); // To find the last occurance
		System.out.println(b);
		obj.remove(0); //to remove a value using index position
		System.out.println(obj);
		obj.remove("Red"); //To remove a value by passing object
		System.out.println(obj);
		String s =  obj.get(0);
		System.out.println(s);
		boolean x = obj.contains("Red");
		System.out.println(x);
		
		boolean y= obj.contains("Yello"); //whether the value is there in the arraylist or not
		System.out.println(y);
		System.out.println(obj.get(2));
		boolean u = obj.isEmpty();
		System.out.println(u);
		obj.remove(1);
		System.out.println(obj);
		System.out.println(obj.size());
		
	}

}
