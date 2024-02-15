import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        // Problem 2: Grade Checker

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the grade value: ");
        int grade = scan.nextInt();

        if (grade >= 90) {
            System.out.print("A");
        } else if (grade >= 80) {
            System.out.print("B");
        } else if (grade >= 70) {
            System.out.print("C");
        } else if (grade >= 60) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}
