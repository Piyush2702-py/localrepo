import java.util.Scanner;
class _28th
{
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int one=sc.nextInt();

        System.out.println("Enter another number:");
        int two=sc.nextInt();

        int sum=one+two;
        System.out.print("\nThe sum of "+one+" and "+two+" is: "+sum);

        sc.close();
    }
}