public class Employee {
    private String name;
    private double salary;

    public Employee() {
        this("", 0.0);
    }

    public Employee(String name) {
        this(name, 0.0);
    }

    public Employee(String employeeName, double currentSalary) {
        this.name = employeeName;
        this.salary = currentSalary;
    }

    public void raiseSalary(double percent){
        salary = salary + (salary * percent / 100.0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return salary;
    }
}
