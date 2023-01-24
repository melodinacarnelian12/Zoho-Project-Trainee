import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class main1{

	public static void main(String[] args) {
		HashMap <Integer,String> m=new HashMap<Integer,String>();
		m.put(101,"melo");
		m.put(102,"david");
		m.put(103,"scott");
		m.put(104,"mary");
		m.put(105,"tye");
		m.put(103,"jkj");
		m.put(106,"david");
		System.out.println(m); 
		System.out.println(m.get(105)); 
		m.remove(106); 
		System.out.println(m); 
		System.out.println(m.containsKey(101)); 
		System.out.println(m.containsKey(106)); 
		System.out.println(m.containsValue("Mary")); 
		System.out.println(m.isEmpty()); 
		System.out.println(m.keySet());  
		for(Object i:m.keySet())
		{
			System.out.println(i);
		}
		
		for(Object i:m.values())
		{
			System.out.println(i);
		}
}
	
}
