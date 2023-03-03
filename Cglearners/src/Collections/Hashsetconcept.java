package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetconcept {

	//int a=null;//not accept
	
	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<>();
		hs.add(100);
		hs.add(null);
		hs.add(101);
		hs.add(101);
		hs.add(103);
		hs.add(99);
		System.out.println(hs);
		Iterator<Integer> it=hs.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
