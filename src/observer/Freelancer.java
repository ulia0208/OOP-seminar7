package observer;

public class Freelancer implements Observer{

    private String name;
    private int salary=700;

    public Freelancer(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if(this.salary<=salary/100){
            System.out.printf("Фрилансер %s: Мне нужна эта работа! (компания: %s, заработная плата - %d в час)\n",
                    name,nameCompany,salary/100);
            this.salary=salary;
        }
        else {
            System.out.printf("Фрилансер %s: Я нашел получше!(компания: %s, заработная плата - %d в час)\n",
                    name, nameCompany,salary/100);
        }
    }
}
