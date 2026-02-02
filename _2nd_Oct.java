 import java.util.Scanner;
public class _2nd_Oct {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];

		int i=0,num=0,even=0,odd=0;

		System.out.println("Enter 10 numbers:");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(i=0;i<10;i++)
		{
			if(arr[i]%2==0)
				even=even+1;
			else
				odd=odd+1;
		}

		System.out.println("Total even numbers:"+even);
		System.out.print("Total odd numbers:"+odd);
	}
}
