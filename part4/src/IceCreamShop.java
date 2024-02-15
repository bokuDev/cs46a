import java.util.Scanner;

public class IceCreamShop {
    // Name: Canhui Huang
    // Date: 02-15-2024

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to he Ice Cream Shop!");
        System.out.print("Choose a cone (Waffle, Sugar, Plain): ");
        String coneType = scanner.nextLine();

        System.out.print("Choose the number of scoops (1, 2, 3): ");
        int scoops = scanner.nextInt();

        displayOrder(coneType, scoops);

    }

    public static void displayOrder(String coneType, int scoops) {
        String message = "";

        switch(coneType.toLowerCase()) {
            case "waffle":
                message += "You've chosen a Waffle cone with ";
                break;
            case "sugar":
                message += "You've chosen a Sugar cone with ";
                break;
            case "plain":
                message += "You've chosen a Plain cone with ";
                break;
            default:
                System.out.println("Invalid cone choice.");
                return;
        }

        switch(scoops) {
            case 1:
                message += "1 scoop of ice cream.";
                break;
            case 2:
                message += "2 scoops of ice cream.";
                break;
            case 3:
                message += "3 scoops of ice cream.";
                break;
            default:
                System.out.println("Invalid number of scoops.");
                return;
        }

        System.out.println(message);
    }
}
