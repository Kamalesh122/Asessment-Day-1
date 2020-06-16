//sum and average
class AssmtArr1 
{

	public static void main(String args[]) {
		int arr[]=new int[args.length];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
			sum=sum+arr[i];
		}
		System.out.println("sum "+sum);
		System.out.println("average "+sum/arr.length);

	}

}
