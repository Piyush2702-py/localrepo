import java.util.Scanner;

class _2nd_Aug{
static int count = 0;
	
_2nd_Aug(){
count++;
}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of objects to create: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++){
			new _2nd_Aug();
		}
		System.out.println("No of objects = " + _2nd_Aug.count);
		sc.close();
	}
}
