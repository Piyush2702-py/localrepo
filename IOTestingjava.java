import java.io.BufferedReader;
import java.io.FileReader;

public class IOTestingjava{
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}