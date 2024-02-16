import java.util.Scanner;

public class UniversityAdmissions {
    // Name: Canhui Huang
    // Date: 02-16-2024
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 ) Asks user's GPA
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // 2) Asks user's SAT score
        System.out.print("Enter your SAT Score: ");
        int sat = scanner.nextInt();

        // 3) Based on the input, inform the student of their admission status
        if (gpa >= 3.5) {
            if (sat > 1300) {
                System.out.println("Admitted");
            } else {
                System.out.println("You were placed on the waiting list");
            }
        } else if (gpa >= 3.0) {
            if (sat > 1100) {
                System.out.println("Admitted");
            } else {
                System.out.println("You were placed on the waiting list");
            }
        } else {
            if (sat > 1200) {
                System.out.println("You were placed on the waiting list");
            } else {
                System.out.println("Rejected");
            }
        }
    }
}
