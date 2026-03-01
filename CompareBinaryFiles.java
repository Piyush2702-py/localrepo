import java.io.FileInputStream;
import java.io.IOException;

public class CompareBinaryFiles {

    public static void main(String[] args) {

        String file1 = "file1.bin";   // Specify first file
        String file2 = "file2.bin";   // Specify second file

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int byte1, byte2;
            int position = 0;
            boolean areEqual = true;

            while (true) {
                byte1 = fis1.read();
                byte2 = fis2.read();

                if (byte1 != byte2) {
                    areEqual = false;
                    System.out.println("Two files are not equal: byte position at which two files differ is " + position);
                    break;
                }

                if (byte1 == -1 && byte2 == -1) {
                    break;  // End of both files
                }

                position++;
            }

            if (areEqual) {
                System.out.println("Two files are equal");
            }

        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}