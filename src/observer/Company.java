package observer;

import java.util.Random;

public class Company {
    private Random random=new Random();
    private String name;
    private Publisher jobAgency;
    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name,salary);
    }

    public void sendVacancy(){
        Company google=new Company("Google",jobAgency,120000);
        Company yandex=new Company("Yandex",jobAgency,95000);
        Company geekbrains = new Company("GeekBrains", jobAgency, 98000);


    }

}
