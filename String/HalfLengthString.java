import java.util.Scanner;

public class HalfLengthString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int l=s.length();
	if(l%2==0)
	{
		String s1=s.substring(0,l/2);
		System.out.println(s1);
	}
	else
	{
		System.out.println("null");
	}

	}

}
