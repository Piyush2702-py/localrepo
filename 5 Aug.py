import java.util.Scanner;

class Plastic2D {
    double length, breadth;
    final int costPerSqFt = 40;

    void get2DData(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculateCost() {
        double area = length * breadth;
        return area * costPerSqFt;
    }
}

class Plastic3D extends Plastic2D {
    double height;
    final int costPerCubicFt = 60;

    void get3DData(double l, double b, double h) {
        get2DData(l, b);
        height = h;
    }

    double calculateCost() {
        double volume = length * breadth * height;
        return volume * costPerCubicFt;
    }
}

public class PlasticDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 2D Plastic Sheet");
        System.out.println("2. 3D Plastic Box");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            Plastic2D sheet = new Plastic2D();
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter breadth: ");
            double b = sc.nextDouble();

            sheet.get2DData(l, b);
            System.out.println("Cost of plastic sheet = Rs " + sheet.calculateCost());
        }
        else if (choice == 2) {
            Plastic3D box = new Plastic3D();
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter breadth: ");
            double b = sc.nextDouble();
            System.out.print("Enter height: ");
            double h = sc.nextDouble();

            box.get3DData(l, b, h);
            System.out.println("Cost of plastic box = Rs " + box.calculateCost());
        }
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
