package collection;
import java.util.ArrayList;

public class Collection_Generic_exp {

	public static void main(String[] args) {
		
		ArrayList <String>obj = new ArrayList<String>();//generic collection
		obj.add("Red");
		obj.add("Yello");
		obj.add("Blue");
		
		System.out.println(obj);
		
		
		ArrayList <String>obj1 = new ArrayList<String>();//generic collection
		obj1.add("Tom");
		obj1.add("Jo");
		obj1.add("Malu");
		System.out.println(obj1);
		
		obj.addAll(obj1);
		System.out.println(obj);
		
		
		// TODO Auto-generated method stub

	}

}
