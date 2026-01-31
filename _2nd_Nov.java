class Subtraction
{
    void subtract(int a, int b)
    {
        System.out.println("Subtraction of two integers = " + (a - b));
    }

    void subtract(int a, int b, int c)
    {
        System.out.println("Subtraction of three integers = " + (a - b - c));
    }

    void subtract(double a, double b)
    {
        System.out.println("Subtraction of two double values = " + (a - b));
    }
}

public class _2nd_Nov
{
    public static void main(String args[])
    {
        Subtraction obj = new Subtraction();

        obj.subtract(10, 5);
        obj.subtract(20, 5, 3);
        obj.subtract(15.5, 4.2);
    }
}
