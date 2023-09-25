package observer;

public class Vacancy extends Company {


    private String name;
    private Publisher jobAgency;
    private int maxSalary;

    public Vacancy(String name, Publisher jobAgency, int maxSalary) {
        super(name, jobAgency, maxSalary);
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

//    @Override
//    public void sendVacancy() {
//        Company google=new Company("Google",jobAgency,120000);
//        Company yandex=new Company("Yandex",jobAgency,95000);
//        Company geekbrains = new Company("GeekBrains", jobAgency, 98000);    }
}
