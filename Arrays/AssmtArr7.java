//remove dublicate
import java.util.*;
public class AssmtArr7{
public static void main(String[] args){
	    int arr[]= new int[args.length];
	    LinkedHashSet<Integer> ts=new  LinkedHashSet<Integer>();
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=Integer.parseInt(args[i]);
	    	ts.add(arr[i]);
	    
	    }
	    for(int x:ts)
	    	System.out.print(x+" ");
		
	}

}