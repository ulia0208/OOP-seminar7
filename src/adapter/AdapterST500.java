package adapter;

import java.time.LocalDate;

public class AdapterST500 implements MeteoSensor{
    private SensorTenperature sensor;

    public AdapterST500(SensorTenperature sensor) {
        this.sensor = sensor;
    }

    @Override
    public int getId() {
        return sensor.getIdentifier();
    }

    @Override
    public double getTemperature() {
        return sensor.temperature();
    }

    @Override
    public double getHumidity() {
        return 0;
    }

    @Override
    public double getPressure() {
        return 0;
    }

    @Override
    public LocalDate getDateTime() {
        return LocalDate.now();
    }
}
