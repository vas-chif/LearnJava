package src.temperature;

public class MainTemperatureConverter {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
       double covertedToCelsios =  temperatureConverter.toCelsius(54);
        System.out.println("Converted tu celsius: " + covertedToCelsios);

        double convertedToFahrenheit = temperatureConverter.toFahrenheit(12);
        System.out.println("Converted to Fahrenheit: " + convertedToFahrenheit);
    }
}
