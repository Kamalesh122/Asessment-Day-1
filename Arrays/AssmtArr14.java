//maximum element in 3 diamentional
class AssmtArr14
{
public static void main(String args[])
{
	if(args.length!=9)
	{
	System.out.println("please enter 9 integer numbers");
	}
	else
	{
	int a[][]=new int[3][3];
	int b=0;
        int max=a[0][0];
        System.out.println("The Given Array Is");
	for(int i=0;i<3;i++)
	{
	  for(int j=0;j<3;j++)
	  {
	    a[i][j]=Integer.parseInt(args[b]);
	    System.out.print(a[i][j]+" ");
            b++;
           	 if(a[i][j]>max)
        	  {
           		 max=a[i][j];
           		
	 	  }
	   }
	   System.out.println("");
      
	}
         System.out.println("The biggest number in the given array is "+max);

	}
 
}

}
