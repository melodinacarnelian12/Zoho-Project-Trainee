Two classes in set interface 
1.Hashset:

import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet hs=new HashSet(); 
			hs.add(100);
			hs.add("welcome");
			hs.add(15.5);
			hs.add('A');
			hs.add(true);
			hs.add(null);
		System.out.println(hs); 
		System.out.println(hs.size()); 
		hs.remove(15.5);
		System.out.println("After removing , new set:"+hs);
				
		
		System.out.println(hs.contains("welcome")); 
		System.out.println(hs.contains("Python")); 
		System.out.println(hs.isEmpty()); 
for(Object e:hs)
			{
				System.out.println(e);
			}
				
	}

}

2.LinkedHashset:
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) { 
		try{
		LinkedHashSet <Integer>lset=new LinkedHashSet<Integer>();
	
		lset.add(100);
		lset.add(200);
		System.out.println(lset); 
        }
        catch (Exception e){
            System.out.println(e);
        }

	}

}
