abstract class Vehicle {
    String name;
    String brand;

    Vehicle(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    abstract void displayInfo();
}

class Car extends Vehicle {
    String fuelType;

    Car(String name, String brand, String fuelType) {
        super(name, brand);
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Car Name: " + this.name);
        System.out.println("Brand: " + this.brand);
        System.out.println("Fuel Type: " + this.fuelType);
    }
}

class Bike extends Vehicle {
    String fuelType;

    Bike(String name, String brand, String fuelType) {
        super(name, brand);
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Bike Name: " + this.name);
        System.out.println("Brand: " + this.brand);
        System.out.println("Fuel Type: " + this.fuelType);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("City", "Honda", "Petrol");
        Bike b = new Bike("Apache", "TVS", "Petrol");

        c.displayInfo();
        b.displayInfo();
    }
}