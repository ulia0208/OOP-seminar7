package observer;

public class Program {
    public static void main(String[] args) {
        Publisher jobAgency=new JobAgency();

        Vacancy vacancy1=new Vacancy("google",jobAgency,120000);
        Vacancy vacancy2=new Vacancy("yandex",jobAgency,95000);
        Vacancy vacancy3=new Vacancy("geekbrains",jobAgency,98000);

        // Company google=new Company("Google",jobAgency,120000);
       // Company yandex=new Company("Yandex",jobAgency,95000);
        //Company geekbrains = new Company("GeekBrains", jobAgency, 98000);

        Student student1 = new Student("Petrov");
        Master master1 = new Master("Ivanov");
        Master master2 = new Master("Sidorov");
        Freelancer freelancer1=new Freelancer("Kuzmin");
        Freelancer freelancer2=new Freelancer("Konev");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(freelancer1);
        jobAgency.registerObserver(freelancer2);

        jobAgency.registerVacancy(vacancy1);
        jobAgency.registerVacancy(vacancy2);
        jobAgency.registerVacancy(vacancy3);





        for (int i = 0; i < 3; i++) {
            vacancy1.needEmployee();
            vacancy2.needEmployee();
            vacancy3.needEmployee();
        }
    }
}
