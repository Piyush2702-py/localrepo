import java.util.Scanner;

class Student
{
	int roll;
	String Name;
	double CGPA;
}

public class _3rd_Nov
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter total number of students: ");
		int n = sc.nextInt();

		Student arr[] = new Student[n];

		for(int i = 0; i < n; i++)
		{
			arr[i] = new Student();

			sc.nextLine();   

			System.out.print("Enter name of student " + (i + 1) + ": ");
			arr[i].Name = sc.nextLine();

			System.out.print("Enter roll no.: ");
			arr[i].roll = sc.nextInt();

			System.out.print("Enter CGPA: ");
			arr[i].CGPA = sc.nextDouble();
			System.out.println();
		}

		System.out.println("Details of " + n + " students are as follows:");
		int j = 0;
		double small = arr[0].CGPA;

		for(int i = 0; i < n; i++)
		{
			System.out.println("Name: " + arr[i].Name);
			System.out.println("Roll no: " + arr[i].roll);
			System.out.println("CGPA: " + arr[i].CGPA);
			System.out.println();
			if(arr[i].CGPA < small)
			{
				small = arr[i].CGPA;
				j = i;
			}
		}
		System.out.println("Student with the lowest CGPA is: "+arr[j].Name);
	}
}
