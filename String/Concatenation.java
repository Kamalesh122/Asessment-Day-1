import java.util.Scanner;

public class Concatenation {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  String x=sc.next().toLowerCase();
		  String y=sc.next().toLowerCase();
	      char a=x.charAt(x.length()-1);
	      char b=y.charAt(0);
	      if(a==b)
	      {
	    	  String s=Character.toString(b);
	    	  String r=s.replaceFirst(s,"");
	    	  System.out.println(x+r);
	      }
	      else
	      {
		  System.out.println(x+" "+y);
	      }

	}

}
