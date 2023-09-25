package adapter;

public class MeteoStore {
    boolean save(MeteoSensor meteoSensor){
        System.out.format("Сохранение ланных из сенсора[%d] в %s%n температура - %f; влажность - %f; давление - %f\n\r",
                meteoSensor.getId(),
                meteoSensor.getDateTime(),
                meteoSensor.getTemperature(),
                meteoSensor.getHumidity(),
                meteoSensor.getPressure());
        return true;
    }

//    boolean save(SensorTenperature sensorTenperature){
//        System.out.format("Сохранение данных из сенсора [%d]: температура - %f\n\r",
//                sensorTenperature.getIdentifier(),
//                sensorTenperature.temperature());
//        return  true;
//    }

}
