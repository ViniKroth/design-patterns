public class App {

    public static void main(String[] args) {
        Celsius celsius = new Celsius(60.0);
        TemperatureAdapterImpl temperatureAdapter = new TemperatureAdapterImpl(celsius);

        System.out.println("CELSIUS TEMPERATURE: " + celsius.informTemperature());
        System.out.println("FAHRENHEIT TEMPERATURE: " + temperatureAdapter.informTemperature());
    }
}
