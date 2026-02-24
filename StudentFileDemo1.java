import java.io.*;
import java.util.*;

public class StudentFileDemo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter student details");
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter existing file name: ");
            String filename = sc.nextLine();

            FileWriter fw = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Roll No: " + roll);
            bw.newLine();
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Subject: " + subject);
            bw.newLine();
            bw.write("Marks: " + marks);
            bw.newLine();
            bw.write("----------------------");
            bw.newLine();

            bw.close();

            System.out.println("\nDisplaying file contents:\n");
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}