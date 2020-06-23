import java.util.Scanner;

public class Calculator {
	public static int powerInt(int num1,int num2)
	{
		return (int) Math.pow(num1,num2);
	}
	public static int powerDouble(double num1,double num2)
	{
		return (int) Math.pow(num1,num2);
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			double d=sc.nextDouble();
			double s=sc.nextDouble();
			System.out.println(powerInt(x,y));
			System.out.println(powerDouble(d,s));
		}
	}

}
