import java.util.Scanner;

public class GradeEvaluator {
    // Name: Canhui Huang
    // Date: 02-16-2024
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Challenge (Optional)
        // Allow the user to keep entering percentages until they choose to exit the program
        // Implement additional categories for very close calls

        double grade = 0;
        while (grade != -1) {
            // 1) Get user's grade
            System.out.println("\nEnter \"-1\" to exit the program.");
            System.out.print("Enter your obtained percentage: ");
            grade = scanner.nextDouble();

            // 2) Evaluate grade & display remarks
            if (grade >= 0 && grade <= 100) {
                if (grade >= 90) {
                    System.out.println("Grade: A");
                    System.out.println("Remarks: Excellent Performance");
                } else if (grade >= 80) {
                    System.out.println("Grade: B");
                    System.out.println("Remarks: Good Performance");
                } else if (grade >= 70) {
                    System.out.println("Grade: C");
                    System.out.println("Remarks: Average Performance");
                } else if (grade >= 60) {
                    System.out.println("Grade: D");
                    System.out.println("Remarks: Below Average Performance");
                } else {
                    System.out.println("Grade: F");
                    System.out.println("Remarks: Failed");
                }
            }
            // 3) Display an error message if a percentage is below 0 & above 100
            else {
                System.out.println("Invalid grade percentage");
            }
        }
    }
}
