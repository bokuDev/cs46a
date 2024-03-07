// Problem 1 & 6

import java.util.Scanner;

/**
 * Problem 1)
 * Represents a temperature converter between Celsius and Fahrenheit
 * @author Canhui Huang
 */
public class TemperatureConverter {
    /**
     * Returns the temperature in Fahrenheit given a temperature in Celsius
     * @param celsius the temperature in Celsius
     * @return the converted temperature in Fahrenheit
     */
    public double celsiusToFahrenheit(double celsius) {
        return ((double)9/5 * celsius) + 32;
    }

    /**
     * Returns the temperature in Celsius given a temperature in Fahrenheit
     * @param fahrenheit the temperature in Fahrenheit
     * @return the converted temperature in Celsius
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * ((double)9/5);
    }

    /**
     * Problem 6) demonstrate the converter's functionality by prompting user
     * input and displaying the conversions
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select Input temperature type: 1) Fahrenheit or 2) Celsius");
        int type = scan.nextInt();
        System.out.println("Insert temperature: ");
        double temperature = scan.nextDouble();
        scan.close();

        TemperatureConverter temperatureConverter = new TemperatureConverter();
        if (type == 1) System.out.println("Temperate in celsius is " + temperatureConverter.fahrenheitToCelsius(temperature));
        else if (type == 2) System.out.println("Temperate in Fahrenheit is " + temperatureConverter.celsiusToFahrenheit(temperature));
    }
}