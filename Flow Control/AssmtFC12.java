import java.util.*;
public class AssmtFC12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
	    int num=sc.nextInt();
	    if(num>1)
	    {
	       for(int i=1;i<=num;i++)
	       {
	    	   if(num%i==0)
	    	   {
	    		   count++;
	    	   }
	      }
	    
	    }
	    if(count==2)
    	  {
    		 System.out.println("is Prime");
    	   } 
  	
	   else
   	  {
   			System.out.println("not Prime");
   	  }
 

 }
}
