import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        System.out.print("Insert n: ");
        int n = scan.nextInt();

        while (i <= n) {
            System.out.println(i);
            i++;
        }
        scan.close();
    }
}
