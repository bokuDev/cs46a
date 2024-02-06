import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Modify the program to print your name followed by "Hello, [Your Name]!"
        System.out.println("Hello, Canhui Huang");

        // 2. Modify your program to print out the current year. For instance, if this is the year 2024, the output should be "The current year is 2024."
        System.out.println("\nThe current year is " + Year.now());

        // 3. Declare 2 integer variables, a and b, with values of 7 and 3, respectively.
        // Print their sum, difference, product, quotient, and remainder.
        int a = 7; int b = 3;
        System.out.println("\nSum. a + b = " + (a + b));
        System.out.println("Difference. a - b = " + (a - b));
        System.out.println("Product. a * b = " + (a * b));
        System.out.println("Quotient. a / b = " + (a / b));
        System.out.println("Remainder. a % b = " + (a % b));

        // 4. Write a Java program that asks the user for their name and age,
        // then prints a personalized greeting and calculates the year they
        // were born.
        Scanner read = new Scanner(System.in);
        System.out.println("\nWhat's your name?");
        String name = read.nextLine();
        System.out.println("What's your age?");
        int age = read.nextInt();

        System.out.println("Greetings " + name + "!");
        System.out.println("And you were born in the year " + (Year.now().getValue() - age));

        read.close();
    }
}
