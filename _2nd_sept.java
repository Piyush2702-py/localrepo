import java.util.Scanner;

class Rectangle
{
    int length, breadth;

    Rectangle()
    {
        length = 0;
        breadth = 0;
    }

    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }

    void area()
    {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

public class _2nd_sept
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();
        r1.area();

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        Rectangle r2 = new Rectangle(l, b);
        r2.area();
    }
}
