package DoublyLinkpkg;

public class DblMain {

	public static void main(String[] args) {
		DblLinkedList dl=new DblLinkedList();
		dl.insert(100);
		dl.insert(10);
		dl.insert(3000);
		dl.insert(1000);
		dl.insert(200);
		dl.insert(100);

		
		System.out.println("Printing DL");
		dl.printDoublyList();
	}

}
