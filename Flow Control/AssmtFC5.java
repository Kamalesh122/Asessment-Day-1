import java.util.Scanner;

public class AssmtFC {
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String x=sc.next();
	//char y=sc.next().charAt(0);
	if(x.matches("^[A-Z a-z]"))
	{
		System.out.println("Alphabet");
	}
	else if(x.matches("^[0-9]"))
	{
		System.out.println("Digit");
	}
	
	else
	{
		System.out.println("Special Character");
	}
	}
	
}