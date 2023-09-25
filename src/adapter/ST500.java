package adapter;

public class ST500 implements SensorTenperature{

    private int id;

    public ST500(int id) {
        this.id = id;
    }

    @Override
    public int getIdentifier() {
        return id;
    }

    @Override
    public double temperature() {
        return 22;
    }
}
