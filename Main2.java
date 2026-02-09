import java.util.Scanner;

class Plate{
    double length, width;

    Plate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of Plate:");
        length = sc.nextDouble();
        width = sc.nextDouble();

        System.out.println("Plate Constructor Called");
        System.out.println("Length = " + length + ", Width = " + width);
    }
}

class Box extends Plate {
    double height;

    Box() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter height of Box:");
        height = sc.nextDouble();

        System.out.println("Box Constructor Called");
        System.out.println("Height = " + height);
    }
}

class WoodBox extends Box {
    double thick;

    WoodBox() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter thickness of WoodBox:");
        thick = sc.nextDouble();

        System.out.println("WoodBox Constructor Called");
        System.out.println("Thickness = " + thick);
    }
}

public class Main2{
    public static void main(String[] args) {
        System.out.println("Enter the dimensions:");
        WoodBox wb = new WoodBox();
    }
}
