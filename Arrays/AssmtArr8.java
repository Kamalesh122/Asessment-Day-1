//suceeding or ignore numbers between 6 and 7
class AssmtArr8
{
	public static void main(String args[])
	{
		int arr[]=new int[args.length]; //10,3,6,1,2,7,9
		int a=6;
		int b=7;
		int sum=0;
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
                       arr[i]=Integer.parseInt(args[i]);
			if(a!=arr[i] && flag==true)
			{
				sum=sum+arr[i];
				flag =true;
			}
			else if(a==arr[i])
				flag=false;
			
			else if(b==arr[i])
		       flag=true;
		}
		System.out.println(sum);
	}
}