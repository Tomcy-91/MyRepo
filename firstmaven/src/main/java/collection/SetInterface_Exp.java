package collection;
import java.util.HashSet;
import java.util.Set;
public class SetInterface_Exp {
    
    public static void main(String[] args) {
       
        Set<String> obj = new HashSet<String>();
        
        
        obj.add("Red");
        obj.add("Blue");
        obj.add("Yellow");  
        obj.add("Yellow");
        obj.add("White");
        obj.add("Green");
        System.out.println(obj);
        
        boolean containsYellow = obj.contains("Yellow");
        System.out.println(containsYellow);
        
        obj.remove("Red");
        System.out.println(obj);
        
       
        boolean containsRed = obj.contains("Red");
        System.out.println(containsRed);
        
        boolean isEmpty = obj.isEmpty();
        System.out.println( isEmpty);
        
       System.out.println("Size: " + obj.size());
        
    }
}
