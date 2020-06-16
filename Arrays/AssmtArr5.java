//maximum and minimum 2 elements
import java.util.Arrays;
public class AssmtArr5{
public static void main(String[] args){
	    int arr[]= {10,87,67,59,20,80,60};
	    int l=arr.length;
	    Arrays.sort(arr);
	
		System.out.println( "largest 2 numbers: "+arr[l-1]+" "+arr[l-2]);
		System.out.println("smallest 2 numbers: "+arr[0]+" "+arr[1]);
	}

}