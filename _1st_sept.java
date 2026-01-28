import java.util.Scanner;

public class _1st_sept{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first = sc.nextLine();

        System.out.println("Enter your last name:");
        String last = sc.nextLine();

        System.out.println(first + " " + last);
    }
}