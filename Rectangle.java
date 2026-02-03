import java.util.Scanner;

public class Rectangle
{
    int length, breadth;
    int area, perimeter;

    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }

    void calculate()
    {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display()
    {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        r.read();
        r.calculate();
        r.display();
    }
}
