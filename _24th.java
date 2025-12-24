import java.util.Scanner;
public class _24th
{
        public static void main(String args[])
    {
        System.out.println("This is multiplication table:");
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int i,prod=1;
        for(i=1;i<11;i++)
        {
            prod=num*i;
            System.out.printf("%d x %d = %d\n",num,i,prod);
        }


    }
}
