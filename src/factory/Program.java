package factory;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    static Random random=new Random();

    public static void main(String[] args) {
        for(Employee e:generateEmployees(20)){
            System.out.println(e);

        }
    }

    static Employee generateEmployee(EmployeeType employeeType){
        String[] names=new String[]{"Анатолий","Григорий","Иван","Владимир","Игорь","Алексей","Илья","Глеб"};
        String[] surnames=new String[]{"Иванов","Петров","Владимиров","Сидоров","Михайлов","Лазарев","Сергеев","Аксенов"};
        int typeIndex = random.nextInt(2);
        int salary= random.nextInt(200,500);
        int index = random.nextInt(100,150);
        switch (employeeType){

            case Freelancer:
                return  new Freelancer(names[random.nextInt(8)],surnames[random.nextInt(8)],salary);
            case Worker:
                return  new Freelancer(names[random.nextInt(8)],surnames[random.nextInt(8)],salary*index);
        }
        return null;
    }

    static Employee generateEmployee(){
        int typeIndex=random.nextInt(2);
        switch (typeIndex){
            case 0:return generateEmployee(EmployeeType.Freelancer);
            case 1:return generateEmployee(EmployeeType.Worker);
        }
        return null;
    }
    static ArrayList<Employee> generateEmployees(int count){
        ArrayList<Employee>employees=new ArrayList<>();
        for (int i = 0; i < count; i++) {
            employees.add(generateEmployee());
        }
        return employees;
    }


}
