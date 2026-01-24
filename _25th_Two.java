import java.util.Scanner;

public class _25th_Two{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your marks:");
		int mark =sc.nextInt();

		if(mark>=50 && mark<60)
			System.out.print("Your grade is: C");
		
		else if(mark>=60 && mark<70)
			System.out.print("Your grade is: B");

		else if(mark>=70 && mark<80)
			System.out.print("Your grade is: A");

		else if(mark>=80 && mark<90)
			System.out.print("Your grade is: E");

		else if(mark>=90 && mark<=100)
			System.out.print("Your grade is: O");
		
		else 
			System.out.print("Invalid range (Please enter your marks in range of 50-100\nThank You !");


	}
}
