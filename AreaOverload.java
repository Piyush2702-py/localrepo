import java.util.Scanner;

class AreaOverload{

    void area(double radius) {
        double result = ((22/7) * radius * radius);
        System.out.println("Area of Circle = " + result);
    }

    void area(double base, double height) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }

    void area(int side) {
        int result = side * side;
        System.out.println("Area of Square = " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaOverload obj = new AreaOverload();

        System.out.println("Choose Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                obj.area(r);
                break;

            case 2:
                System.out.print("Enter base: ");
                double b = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                obj.area(b, h);
                break;

            case 3:
                System.out.print("Enter side: ");
                int s = sc.nextInt();
                obj.area(s);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}