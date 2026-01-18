import java.util.Scanner;
class Hello
{
    String name;

    void print()
    {
        System.out.println("Hello "+name);
    }
}
public class Java
{
    public static void main(String args[])
    {
        System.out.println("Hello Java");
        System.out.println("14th Jan 2026");
        System.out.println("16th Jan 2026");
        System.out.println("17th Jan Saturday 2026");

        Hello h1=new Hello();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        h1.name=sc.nextLine();
        h1.print();
    }
}