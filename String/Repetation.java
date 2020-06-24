import java.util.Scanner;

public class Repetation {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           String m=s.substring(s.length()-n,s.length());
           System.out.println(m);
        }
	}

}
