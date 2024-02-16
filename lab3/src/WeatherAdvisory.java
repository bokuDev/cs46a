import java.util.Scanner;

public class WeatherAdvisory {
    // Name: Canhui Huang
    // Date: 02-16-2024
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 ) Asks user's temperature
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble(); scanner.nextLine();

        // 2) Asks whether it's rainy or snowy
        System.out.print("Is it rainy or snowy? ");
        String weatherCon = scanner.nextLine();

        // 3) Based on the given conditions, provide clothing advice
        if (temperature > 80) {
            if (weatherCon.equals("rainy")) {
                System.out.println("Wear light clothing but take an umbrella!");
            } else {
                System.out.println("Wear shorts and a t-shirt");
            }
        } else if (temperature >= 50) {
            if (weatherCon.equals("rainy")) {
                System.out.println("Take a light jacket and an umbrella");
            } else {
                System.out.println("A light jacket should suffice");
            }
        } else {
            if (weatherCon.equals("snowy")) {
                System.out.println("Wear a heavy coat and gloves");
            } else {
                System.out.println("Wear a heavy coat");
            }
        }
    }
}
