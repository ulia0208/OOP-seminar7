package observer;

public class Student implements Observer{
    private String name;
    private  int salary=2000;

    public Student(String name) {
        this.name = name;
    }


    public void receiveOffer(String nameCompany, int salary){
        if (this.salary <= salary) {
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s, заработная плата - %d)\n",
                    name, nameCompany, salary);
            this.salary=salary;
        }
        else {
            System.out.printf("Студент %s: Я нашел получше!(компания: %s, заработная плата - %d)\n",
                    name, nameCompany,salary);
        }
    }
}
