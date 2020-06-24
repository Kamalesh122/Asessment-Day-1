import java.util.Scanner;

public class Elimiinate_First_Last {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.startsWith("x") || s.endsWith("x"))
			System.out.println(s.substring(1,s.length()-1));
		else
			System.out.println(s);
	}

}
