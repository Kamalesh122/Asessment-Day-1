import java.util.Scanner;

public class Ncopies {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	for(int i=0;i<s.length();i++)
	{
		String c=s.substring(0,2);
		System.out.print(c);
	}
	

	}

}
