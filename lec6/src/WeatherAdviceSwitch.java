import java.util.Scanner;

// Canhui Huang
// Exercise 10
public class WeatherAdviceSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's the weather like today?(rainy/snowy/sunny/cloudy) ");
        String weather = scanner.nextLine().toLowerCase();
        scanner.close();

        switch (weather) {
            case "rainy":
                System.out.println("Carry an umbrella!");
                break;
            case "snowy":
                System.out.println("Wear a coat and boots!");
                break;
            case "sunny":
                System.out.println("Wear sunglasses and a hat");
                break;
            case "cloudy":
                System.out.println("It might get cold, carry a light hacket!");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
