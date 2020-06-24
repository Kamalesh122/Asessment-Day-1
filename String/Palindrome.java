import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String s=sc.next();
	  
	  StringBuffer sb=new StringBuffer(s);
	  StringBuffer rev=sb.reverse();
	  
	  if(s.contentEquals(rev))
	  {
		  System.out.println("is Palindrome");
	  }
	  else
	  {
		  System.out.println("not a Palindrome");
	  }
	}
}
