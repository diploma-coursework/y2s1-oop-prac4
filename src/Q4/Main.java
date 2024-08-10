package Q4;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarType[] carTypes = {
                new CarType("Sedan"),
                new CarType("SUV"),
                new CarType("Hatchback"),
                new CarType("Convertible"),
                new CarType("Coupe"),
                new CarType("Wagon"),
                new CarType("Truck"),
                new CarType("Minivan"),
                new CarType("Sports Car"),
                new CarType("Electric Vehicle")
        };

        System.out.print("How many registrations to enter: ");
        int numOfRegistration = scanner.nextInt(); // assume no input error

        ArrayList<Registration> listOfRegistration = new ArrayList<>();
        for (int i = 0; i < numOfRegistration; i++) {
            System.out.printf("\nEntry #%d\n", i + 1);

            System.out.println("Select your car type:");
            for (int j = 0; j < carTypes.length; j++) {
                System.out.printf("%d - %s\n", j + 1, carTypes[j]);
            }
            System.out.print("> ");
            int carTypeIndex = scanner.nextInt() - 1;

            Owner owner = Owner.userInputForm(scanner);
            Car car = Car.userInputForm(carTypes[carTypeIndex], scanner);
            listOfRegistration.add(new Registration(car, owner));
        }

        System.out.println("\nRegistrations entered:\n=====================");
        listOfRegistration.forEach(registration -> System.out.print(registration + "\n----------------------\n"));
    }
}
