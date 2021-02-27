package Constpkg;

public class Players {
	
	private String Name;
	private int Age;
	private String Country;
	private Address address;
	
	 public Players(String name, int age) {
		Name = name;
		Age = age;
	}
	 
	 
	public Players(String name, int age, String country) {
		this(name,age);
		Country = country;
	}
	
	


	public Players(String name, int age, String country, Address address) {
		this(name,age,country);
		this.address = address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public void Printplay() {
		 System.out.println("Player name is "+Name);
		 System.out.println("Age is" +Age);
		 System.out.println("Country is" +Country);
		 if (address!= null)
				 {
		 address.PrintAddress();
				 }
		 else
		 {
			 System.out.println("No address entered");
		 }
		 
	 }
}	
	

             