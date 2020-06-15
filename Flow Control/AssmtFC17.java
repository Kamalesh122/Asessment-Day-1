import java.util.*;
class AssmtFC17
{
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int sum=0;
	    int temp=num;
		while(num>0)
		{
			sum=sum*10+num%10;
			num=num/10;
		}
	if(sum==temp)
		System.out.println(temp+" is palindrome");
	else
		System.out.println(temp+ " is not palindrome");

	}
}
