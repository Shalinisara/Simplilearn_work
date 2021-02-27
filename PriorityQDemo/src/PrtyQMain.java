import java.util.Iterator;
import java.util.PriorityQueue;

public class PrtyQMain {

	public static void main(String[] args) {
		PriorityQueue<String> P1= new PriorityQueue<>();
		P1.add("Mercury");
		P1.add("Venus");
		P1.add("Earth");
		P1.add("Mars");
		P1.add("Neptune");
		System.out.println(P1);
		//System.out.println("Head is "+ P1.element());
		//System.out.println("Peek is "+P1.peek());
		System.out.println("Iterator values are: ");
		Iterator itr = P1.iterator();
		while(itr.hasNext());
		{ 
			System.out.println(itr.next());
		}
	}

}
