package DoublyLinkpkg;

public class DblLinkedList {
	private Node head;
	private Node tail;
	class Node {
		Node previous;
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}
	
	public void insert(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=tail=newNode;
			head.previous=null;
			tail.next=null;
		}else {
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			tail.next=null;
				
		}
		
	}
	
	Node deleteEnd(int data) {
		Node cu = head;
		if (cu == null || tail == null) 
		{
			head=tail=null;
			return cu;
		}
		Node nextNode = cu.next;
		while ()
		
		
		
		
		
		
	}
	public void printDoublyList() {
		Node cuNode=head;
		while (cuNode!=null) {
			System.out.println(cuNode.data);
			cuNode=cuNode.next;
			
		}
	}
}
