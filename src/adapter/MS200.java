package adapter;

import java.time.LocalDate;

public class MS200 implements MeteoSensor{
    private int id;
    public MS200(int id) {
        this.id=id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getTemperature() {
        return 23;
    }

    @Override
    public double getHumidity() {
        return 60;
    }

    @Override
    public double getPressure() {
        return 752.4;
    }

    @Override
    public LocalDate getDateTime() {
        return LocalDate.now();
    }
}
