package Q4;

import java.util.Scanner;

class Owner {
    private final String name;
    private final String icNo;

    public Owner(String name, String icNo) {
        this.name = name;
        this.icNo = icNo;
    }

    public static Owner userInputForm(Scanner scanner) {
        System.out.print("Owner name: ");
        String ownerName = scanner.nextLine();
        System.out.print("IC No: ");
        String icNo = scanner.nextLine();
        return new Owner(ownerName, icNo);
    }

    @Override
    public String toString() {
        return String.format("Owner: %s\nIc No: %s", this.name, this.icNo);
    }
}
