import java.util.Scanner;

public class ShorterOutside {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String x=sc.next();
	  String y=sc.next();
	  if(x.length() > y.length())
	  {
		  System.out.println(y+x+y);
	  }
	  else
	  {
		  System.out.println(x+y+x);
	  }
	}

}
