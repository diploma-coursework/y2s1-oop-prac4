public class Q1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Adam", 2400.00);
        System.out.printf("Before salary raise: $%.2f\n", employee1.getSalary());

        employee1.raiseSalary(8.0);
        System.out.printf("After salary raise (8%%): $%.2f\n", employee1.getSalary());

        // c
        Employee employee2 = new Employee("Jeremy", 2700);
        Employee employee3 = new Employee("James");

        if (employee2.getSalary() > employee3.getSalary()) {
            System.out.println("The employee with higher salary is " + employee2.getName());
        } else {
            System.out.println("The employee with higher salary is " + employee3.getName());
        }
        System.out.println("The total salary of 2 employees is " + (employee2.getSalary() + employee3.getSalary()));
    }
}
