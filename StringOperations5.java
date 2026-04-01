import java.util.Scanner;

public class StringOperations5{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String changedCase = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch))
                changedCase += Character.toUpperCase(ch);
            else
                changedCase += Character.toLowerCase(ch);
        }

        System.out.println("The string after changing the case is " + changedCase);

        String rev = "";
        for(int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("The string after reversing is " + rev);

        System.out.print("\nEnter the second string for comparison: ");
        String str2 = sc.nextLine();

        int diff = Math.abs(str.compareTo(str2));
        System.out.println("The difference between ASCII value is " + diff);

        System.out.print("\nEnter the string to be inserted into first string: ");
        String insert = sc.nextLine();

        String result = str + " " + insert;
        System.out.println("The string after insertion is : " + result);

        System.out.print("\nEnter a String: ");
        String str3 = sc.nextLine();

        System.out.println("Uppercase: " + str3.toUpperCase());
        System.out.println("Lowercase: " + str3.toLowerCase());

        System.out.print("\nEnter a String: ");
        String str4 = sc.nextLine();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int pos = str4.indexOf(ch);

        if(pos != -1)
            System.out.println("Position of entered character: " + pos);
        else
            System.out.println("Entered character is not present");

        sc.nextLine();

        System.out.print("\nEnter a String: ");
        String str5 = sc.nextLine();

        String rev2 = "";
        for(int i = str5.length()-1; i >= 0; i--) {
            rev2 += str5.charAt(i);
        }

        if(str5.equalsIgnoreCase(rev2))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");

        System.out.print("\nEnter a String: ");
        String str6 = sc.nextLine();

        int vowels = 0, consonants = 0;

        String lower = str6.toLowerCase();

        for(int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);

            if(c >= 'a' && c <= 'z') {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    vowels++;
                else
                    consonants++;
            }
        }

        String words[] = str6.trim().split("\\s+");

        System.out.println("No. of words: " + words.length);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);

        sc.close();
    }
}