import java.util.Scanner;

abstract class Student
{
	int roll,reg_no;
	
	abstract void course();

	void getinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Roll number:");
		roll=sc.nextInt();
		
		System.out.println("Enter your registration number:");
		reg_no=sc.nextInt();
	}
}

class Kiitian extends Student
{
	void course()
	{
		System.out.println("Roll no."+roll);
		System.out.println("Registration no. "+reg_no);
		System.out.println("Course- B.Tech (Computer Science & Engg)");
	}
	
}

public class _5th_Nov
{
	public static void main(String args[])
	{
		Kiitian obj=new Kiitian();
		obj.getinput();
		obj.course();
	}
}

	