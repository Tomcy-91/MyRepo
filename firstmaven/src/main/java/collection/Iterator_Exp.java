package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> a = new ArrayList<String>();
		a.add("Red");
		a.add("Blue");
		a.add("Yello");
		a.add("White");
		Iterator<String> it = a.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(a);
	}

}
