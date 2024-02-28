import java.util.Scanner;

// Name: Canhui Huang
// Problem 10: Movie Ticket Price Calculator
public class MovieTicketPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PRICE = 15;

        System.out.print("Enter the day of the week: ");
        String weekDay = scanner.nextLine();
        System.out.print("Enter age of the movie goer: ");
        double age = Integer.parseInt(scanner.nextLine());
        scanner.close();

        double ticketPrice = PRICE;
        // Every Wednesday, there's a flat 20% discount on all tickets.
        // If someone is both a child under 13 and it's a Wednesday, they should only get the Wednesday discount.
        if (weekDay.toLowerCase().equals("wednesday")) {
            ticketPrice -= 0.20 * PRICE;
        } else if (age < 13) {
            ticketPrice -= 0.35 * PRICE;
        }

        // Senior citizens, 60 years and older, get an addtional base 25% discount
        if (age >= 60) {
            ticketPrice -= 0.25 * PRICE;
        }

        System.out.println("Final ticket price after discounts: $" + ticketPrice);
    }
}