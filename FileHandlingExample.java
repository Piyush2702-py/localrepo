import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a file handling example in Java.\n");
            writer.write("This file is created and written using Java.");
            writer.close();
            System.out.println("Data written to file.");

            FileReader reader = new FileReader("example.txt");
            BufferedReader br = new BufferedReader(reader);
            String line;

            System.out.println("Reading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}