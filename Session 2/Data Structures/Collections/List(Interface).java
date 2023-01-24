Two clases:
1.Arraylist:

import java.util.ArrayList;
import java.util.Collections;

public class Mian {

	public static void main(String[] args) {
		
	ArrayList al=new ArrayList(); // accepts all data type values
		
		al.add("M");
		al.add("E");
		al.add("L");
		al.add("O");
		al.add("D");
		al.add("Y");
		
		ArrayList al_dup=new ArrayList();//obj craetion 
		al_dup.addAll(al);
		System.out.println(al_dup); 

		al_dup.removeAll(al);
		System.out.println("After removing group of elements :"+al_dup); 
	
		System.out.println("Before sorting:"+al); 
		Collections.sort(al);
		System.out.println("After sorting:"+al); 
				
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Reverse order:"+al); 
				
		Collections.shuffle(al);
		System.out.println("After shuffling:"+al); 
				
	}

}



2.Linkedinlist(stores by pointers):


import java.util.Iterator;
import java.util.LinkedList;
public class Main {
	public static void main(String[] args) {
		LinkedList  hs=new LinkedList(); 
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
