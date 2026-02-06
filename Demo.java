import java.util.Scanner;

class Main
{
 int length;
int breadth;

void area()
{
	System.out.println("Area="+(length*breadth));
}
}

public class Demo
{
	public static void main(String args[])
	{
		Main obj=new Main();
		obj.length=3;
		obj.breadth=5;
		obj.area();
	}
}
