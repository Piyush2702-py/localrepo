import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
class Rectangle
{
    int length;
    int breadth;

    void calculate()
    {
        System.out.println("The area of the recatangle is:"+(length*breadth));
    }
}

public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Rectangle box1=new Rectangle();
        System.out.print("Enter the length of rectangle: ");
        box1.length=sc.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        box1.breadth=sc.nextInt();
        box1.calculate();

    }
}