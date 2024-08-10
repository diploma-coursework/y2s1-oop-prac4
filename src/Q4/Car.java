package Q4;

import java.util.Scanner;

class Car {
    private final String plateNo;
    private final String color;
    private final String year;
    private final String make;
    private final String model;
    private final String capacity;
    private final CarType type;

    public Car(String plateNo, String color, String year, String make, String model, String capacity, CarType type) {
        this.plateNo = plateNo;
        this.color = color;
        this.year = year;
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.type = type;
    }

    public static Car userInputForm(CarType type, Scanner scanner) {
        System.out.print("Plate No: ");
        String plateNo = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Year: ");
        String year = scanner.nextLine();
        System.out.print("Make: ");
        String make = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Capacity: ");
        String capacity = scanner.nextLine();
        return new Car(plateNo, color, year, make, model, capacity, type);
    }

    @Override
    public String toString() {
        return String.format("""
                Plate No: %s
                Color: %s
                Year: %s
                Make: %s
                Model: %s
                Capacity: %s
                %s
                """,
                this.plateNo,
                this.color,
                this.year,
                this.make,
                this.model,
                this.capacity,
                this.type
        );
    }
}
