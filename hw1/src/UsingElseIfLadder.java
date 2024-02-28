import java.util.Scanner;

// Name: Canhui Huang
// Problem 7: Using Else-If Ladder
public class UsingElseIfLadder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter grade: ");
        int grade = scanner.nextInt();
        scanner.close();
        
        if ( grade <= 100) {
            if (grade >= 95) {
                System.out.println("Letter grade: A+");
            } else if (grade >= 90) {
                System.out.println("Letter grade: A-");
            } else if (grade >= 85) {
                System.out.println("Letter grade: B+");
            } else if (grade >= 80) {
                System.out.println("Letter grade: B-");
            } else if (grade >= 75) {
                System.out.println("Letter grade: C+");
            } else if (grade >= 70) {
                System.out.println("Letter grade: C-");
            } else if (grade >= 60) {
                System.out.println("Letter grade: D");
            } else {
                System.out.println("Letter grade: F");
            }
        }
    }
}