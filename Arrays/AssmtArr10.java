//even first then odd
class AssmtArr10
{
	public static void main(String[] args) 
	{	
	   int a[]=new int[args.length];
	   int b[]=new int[a.length];
	   for(int i=0;i<a.length;i++)
	   {
		   a[i]=Integer.parseInt(args[i]);
	   }
	   int count=0;
	   for(int i=0;i<a.length;i++)
	   {
		 if(a[i]%2==0)
		 {
			 b[count]=a[i];
			count++;
		 }
		
	   }
	   for(int i=0;i<a.length;i++)
	   {
	   if(a[i]%2!=0)
		 {
			 b[count]=a[i];
		     count++;
		 }
		
	   }
	   for(int i:b)
	   {
		   System.out.print(i+" ");
	   }
	}
}
