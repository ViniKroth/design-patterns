public class Celsius implements Temperature {
    private double temperature;

    public Celsius(double temperature) {
        this.temperature = temperature;
    }

    public double informTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
