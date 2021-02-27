package Linkedlistpkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistClass {

	public static void main(String[] args) {
	
		LinkedList li=new LinkedList();
		li.add("hello");
		li.add(12222);
		li.add("hello");
		li.add('c');
		li.add(true);
		li.add(22.222);
		li.add(1111221221);
		System.out.println(li);
		
		List<Integer> li2=new LinkedList<>();
		li2.add(1);
		li2.add(2);
		li2.add(3);
		li2.add(null);
		li2.add(null);
		li2.add(null); //insert at last
		System.out.println("li2 : "+li2);
		li2.add(1, 220); //insert at specific position
		System.out.println("li2 : "+li2);
		li2.set(1, 1000); //update
		System.out.println("li2 : "+li2);
		li2.set(2, 2000); //update
		System.out.println("li2 : "+li2);
		System.out.println("li2.size() : "+li2.size());
		System.out.println("li2.get(2) : "+li2.get(2));
		li2.remove(1);//index
		System.out.println("\nli2 : "+li2);
		Integer obj=2000;
		System.out.println("Removed 2000");
		li2.remove(obj); //removes first occurence of this object in the List
		System.out.println("li2 : "+li2);
		
		Collections.reverse(li2);
		System.out.println("li2 : "+li2);
		Collections.replaceAll(li2, null, 0);
		System.out.println("li2 after replaceAll: "+li2);
		Collections.sort(li2); //ascending
		System.out.println("li2 after sort: "+li2);
		Collections.sort(li2, Collections.reverseOrder()); //descending
		System.out.println("li2 after sort in reverseOrder: "+li2);
		Collections.shuffle(li2);
		System.out.println("li2 after shuffle: "+li2);
		Collections.sort(li2);
		System.out.println("sort "+li2);
		int srch = Collections.binarySearch(li2, 1);
		if (srch > 0)
		{
			System.out.println ("Value found");
		}
		else
		{
			System.out.println("Value not found");
		}
		
		System.out.println("Collections.binarySearch(li2,144): "+Collections.binarySearch(li2, 144));
		
		System.out.println("Array List demo");
		ArrayList <String> name = new ArrayList<String>();
		name.add("Shalini");
		name.add("Saravana");
		Iterator s = name.iterator();
		while (s.hasNext())
		{
			System.out.println(s.next());
		}
				}

}
