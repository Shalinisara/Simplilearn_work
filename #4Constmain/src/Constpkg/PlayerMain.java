package Constpkg;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players obj = new Players("Sachin",50);
		obj.Printplay();
		Players obj2 = new Players("Ganguly",45,"INDIA");
		obj2.Printplay();
		Address a1 = new Address ("AAA", "Mumbai");
		Players obj3 = new Players("Kapil",60,"INDIA",a1);
		//obj3.setAddress(a1);
		obj3.Printplay();
		Players obj4 = new Players("Kapils",70,"INDIA",a1);
		//obj3.setAddress(a1);
		obj4.Printplay();
}
}																																																																																																																																		