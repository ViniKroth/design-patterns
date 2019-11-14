public class TemperatureAdapterImpl implements TemperatureAdapter {

    private Temperature temperature;

    public TemperatureAdapterImpl(Temperature temperature) {
        this.temperature = temperature;
    }

    public double informTemperature() {
        return celsiusToFahrenheit();
    }

    private double celsiusToFahrenheit() {
        return (temperature.informTemperature() * 9.0 / 5.0) + 32;
    }
}
