import java.util.Scanner;

public class Star {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	char c[]=s.toCharArray();
	if(s.contains("*") ||s.contains("-"))
	{
		int i=s.indexOf("*");
		for(int j=0;j<c.length;j++)
		{
		   if(j==i || j==i+1 || j==i-1)
		   {
			   continue;
		   }
		   else
		   {
			   System.out.print(c[j]);
		   }
	    }
	}
   }
}


