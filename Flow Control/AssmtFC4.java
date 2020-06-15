import java.util.Scanner;

public class AssmtFC4 {
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char x=sc.next().charAt(0);
	char y=sc.next().charAt(0);
	if((int)x>(int)y)
	{
		System.out.println(y+","+x);
	}
	else
	{
		System.out.println(x+","+y);
	}
	
	}
}
