import java.io.FileWriter;

public class InputOutput{
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file.txt");
            fw.write("Hello Java I/O");
            fw.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}