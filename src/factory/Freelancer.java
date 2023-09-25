package factory;

public class Freelancer extends Employee{
    public Freelancer(String name, String surname, double salary){
        super(name,surname,salary);
    }
    @Override
    public double calculateSalary() {
        return 20.8*8*salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячнася зп - %.2f; Почасовая ставка - %.2f руб.",
        surname, name,calculateSalary(),salary);
    }
}
