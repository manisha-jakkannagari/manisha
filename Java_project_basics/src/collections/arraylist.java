package collections;
import java.util.*;

public class arraylist {
	/*public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		System.out.println(list);
		list.set(1, 25);
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		for(int m:list) {
			System.out.println(m);
		}*/
	/*public static void main(String[] args) {
		ArrayList<String>names=new ArrayList();
		names.add("manisha");
		names.add("naveen");
		names.remove(0);
		names.size();
		names.set(0, "naveen");
		names.get(0);
		
		System.out.println(names);
		for(String x:names) {
			System.out.println(x);
		}
		
	}
	*/
	public static void main(String[] args) {
		ArrayList<Integer>ids=new ArrayList<>();
		ids.add(101);
		ids.add(102);
		ids.add(103);
		System.out.println("before sorting:"+ids);
		Collections.sort(ids);
		System.out.println("after sorting:"+ids);
		Collections.sort(ids,Collections.reverseOrder());
		System.out.println("Ids"+ids);
		
		
	}
	
	

}
