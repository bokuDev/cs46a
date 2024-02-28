import java.util.Scanner;

// Canhui Huang
// Exercise 9
public class WeatherAdviceIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's the weather like today?(rainy/snowy/sunny/cloudy) ");
        String weather = scanner.nextLine().toLowerCase();
        scanner.close();

        if (weather.equals("rainy")) {
            System.out.println("Carry an umbrella!");
        } else if (weather.equals("snowy")) {
            System.out.println("Wear a coat and boots!");
        } else if (weather.equals("sunny")) {
            System.out.println("Wear sunglasses and a hat");
        } else if (weather.equals("cloudy")) {
            System.out.println("It might get cold, carry a light hacket!");
        } else {
            System.out.println("Invalid input");
        }
    }
}
