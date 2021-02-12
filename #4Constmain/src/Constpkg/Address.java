package Constpkg;

public class Address {
	private String Street;
	private String City;
	public Address(String Street, String City) {
		this.Street = Street;
		this.City = City;
		
	}
	
	public void PrintAddress ()
	{
		System.out.println("Street: "+ Street);
		System.out.println("City: "+ City);
	}
	
}
