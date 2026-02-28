import java.io.*;
import java.util.*;

public class CopyByteStream2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the source file name: ");
            String source = sc.nextLine();

            System.out.print("Enter the destination file name: ");
            String dest = sc.nextLine();

            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File Copied");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}