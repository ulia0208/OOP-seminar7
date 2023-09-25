package factory;

public abstract class Employee {
    protected String name;
    protected String surname;
    protected double salary;
    public abstract double calculateSalary();

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
}
