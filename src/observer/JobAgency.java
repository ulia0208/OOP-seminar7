package observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{

    List<Observer> observers=new ArrayList<>();
    public void sendOffer(String companyName, int salary){
        for(Observer observer:observers){
            observer.receiveOffer(companyName,salary);
        }
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);

    }
    public void removeObserver(Observer observer){
        observers.remove(observer);

    }

    public void registerVacancy(Company company){
        company.sendVacancy();
    }



}
