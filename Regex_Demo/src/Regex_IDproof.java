import java.util.Scanner;

public class Regex_IDproof {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the DL number:");
		String str = s.nextLine();
		if (str.matches("[A-Z]{1}[0-9]{9}"))
		{
			System.out.println("Valid DL numnber ");
		}
		else
		{
			System.out.println("Invalid DL number");
		}
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter your e-mail ID:");
		String str1 = s1.nextLine();
		if (str.matches("[A-Z][a-z][0-9]{@}[a-z]{.}{a-z}"))
		{
			System.out.println("Valid e-mail address ");
		}
		else
		{
			System.out.println("Invalid e-mail address");
		}
	}

}
