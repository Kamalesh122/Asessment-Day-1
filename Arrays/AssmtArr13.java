//revers 2 diamentional array
class AssmtArr13
{
public static void main(String args[])
{
	if(args.length!=4)
	{
	System.out.println("please enter 4 integer numbers");
	}
	else
	{
	int a[][]=new int[2][2];
	int b=0;
        System.out.println("The Given Array Is");
	for(int i=0;i<2;i++)
	{
	  for(int j=0;j<2;j++)
	  {
	    a[i][j]=Integer.parseInt(args[b]);
	    System.out.print(a[i][j]+" ");
            b++;
	  }
	   System.out.println("");
	}
         System.out.println("The modified Array is");

        for(int i=1;i>=0;i--)
	{
	  for(int j=1;j>=0;j--)
	  {
	     System.out.print(a[i][j]+" ");
	  }
	   System.out.println("");
	}
	}
 
}

}
