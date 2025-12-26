import java.util.Scanner;

// Class Box
class Box {
    int length;
    int width;
    int height;

    // Constructor to initialize values
    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    // Method to calculate volume
    int volume() {
        return length * width * height;
    }
}

// Application class
class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter width: ");
        int width = sc.nextInt();

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        // Create object of Box
        Box b = new Box(length, width, height);

        // Call volume method
        int vol = b.volume();

        // Output
        System.out.println("Volume = " + vol);
    }
}
