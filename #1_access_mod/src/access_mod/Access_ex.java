package access_mod;

public class Access_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Type_var obj = new Type_var();
		obj.sample();
		System.out.println("Value of static integer y is:" +Type_var.y);
		System.out.println("Value of protected integer z is:"+obj.z);
		System.out.println("Value of public integer z is:"+obj.a);
		
	}

}
