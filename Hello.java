import java.util.Scanner;
public class Hello
{
    public static void main(String args[])
    {
        System.out.println("Java Programming Language");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int first=sc.nextInt();
        System.out.println("Enter second number: ");
        int second=sc.nextInt();
        int sum=first+second;
        System.out.println("The sum of "+first+" and "+second+" is: "+sum);

    }
}