import java.util.Scanner;

public class AssmtFC1B {
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int v=0;
    int w=0;
	int x=sc.nextInt();
	int y=sc.nextInt();
	if(x<10 && y<10)
	{
		if(x==y)
		{
		System.out.println("true");
		}
	}
	else if(x<10 && y>10)
	{
		w=y%10;
		if(x==w)
		{
			System.out.println("true");
		}
	}
	else if(x>10 && y<10)
	{
		v=x%10;
		if(v==y)
		{
			System.out.println("true");
		}
	}
	else if(x>10 && y>10)
	{
		if(x==y)
		{
			System.out.println("true");
		}
		else
		{
			v=x%10;
			w=y%10;
			if(v==w) {
				System.out.println("true");
			}
			
		}
	}
	else
	{
		System.out.println("false");
	}
	}
}
