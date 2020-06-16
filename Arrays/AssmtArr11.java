//only 1 and 4
class AssmtArr11
{
	public static void main(String args[]) 
	{
           int flag=0;	
	   int a[]=new int[args.length];
	   for(int i=0;i<a.length;i++)
	   {
		   a[i]=Integer.parseInt(args[0]);
		   if(a[i]!=1 && a[i]!=4)
		   {
			   flag++;
		   }
		
	   }
	   
	   if(flag>0)
		   System.out.println("true"); 
           else
                    System.out.println("false"); 
	}
}
