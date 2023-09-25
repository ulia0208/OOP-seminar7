package observer;

public interface Publisher {
    void sendOffer(String companyName, int salary);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void registerVacancy(Company company);

    }
