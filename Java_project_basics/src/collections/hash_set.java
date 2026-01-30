package collections;
import java.util.*;

import java.util.HashSet;

public class hash_set {
	/*public static void main(String[] args) {
		HashSet<Integer>ids=new HashSet<>();
		ids.add(101);
		ids.add(102);
		ids.add(103);
		ids.add(102);
		System.out.println("ids:"+ids);
		System.out.println(ids.remove(102));
		System.out.println(ids.size());
		System.out.println(ids.isEmpty());
		
		
	}
*/
	
	public static void main(String[] args) {
		HashSet <String> names=new HashSet<>();
		names.add("manisha");
		names.add("Sai");
		names.add("naveen");
		Iterator<String>its=names.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		
	}
	
	
	
}
