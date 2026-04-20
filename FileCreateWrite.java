import java.io.FileWriter;
import java.io.IOException;

public class FileCreateWrite{
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            
            writer.write("Hello, this is a sample text written into the file.\n");
            writer.write("Java file handling is easy!");

            writer.close();
            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}