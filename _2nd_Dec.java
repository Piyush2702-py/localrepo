import java.util.Scanner;
class Box
{
	int length;
	int width;
	int height;

	void Volume()
	{
		System.out.print("The volume of the box is:"+(length*width*height));
	}
	
}
	
public class _2nd_Dec
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Box box1=new Box();

	System.out.print("Enter length of the box:");
	box1.length=sc.nextInt();

	
	System.out.print("Enter width of the box:");
	box1.width=sc.nextInt();

	
	System.out.print("Enter height of the box:");
	box1.height=sc.nextInt();

	box1.Volume();
	}
}
		