package LinkedListpkg;

import java.util.LinkedList;

public class ListMain {

	public static void main(String[] args) {
		LinkLstImpl l1=new LinkLstImpl();
		l1.insert(100);
		l1.insert(10000);
		l1.insert(300);
		l1.insert(500);
		l1.insert(1000);
		l1.insert(500);
		l1.insert(150);
		
		
		l1.printList();
		l1.deleteEnd();
		System.out.println("After deleting the element at the end of Linkedlist");
		l1.printList();
	}

}
             


	

//try for deleting an element from the linkedlist :)
