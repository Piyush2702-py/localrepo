import java.util.Scanner;

public class StringConvert{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upper = str.toUpperCase();
        String lower = str.toLowerCase();

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        sc.close();
    }
}