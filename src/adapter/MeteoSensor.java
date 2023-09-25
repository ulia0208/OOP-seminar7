package adapter;

import java.time.LocalDate;

public interface MeteoSensor {
    int getId();
    double getTemperature();
    double getHumidity();
    double getPressure();
    LocalDate getDateTime();

}
