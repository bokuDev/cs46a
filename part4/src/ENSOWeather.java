import java.util.Scanner;

public class ENSOWeather {
    // Name: Canhui Huang
    // Date: 02-15-2024

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the season (Winter or Summer)");
        String season = scanner.nextLine().trim().toLowerCase();

        System.out.println("Enter the ENSO index (negative for el Niño and positive for La Niña)");
        double ensoIndex = scanner.nextDouble();

        if("winter".equals(season)) {
            if (ensoIndex > 0) {
                System.out.println("Expect more rainfall due to the El Niño phase");
            } else if (ensoIndex < 0) {
                System.out.println("Expect less rainfall due to the La Niña phase");
            } else {
                System.out.println("No discernible effect on rainfall");
            }
        } else if ("summer".equals(season)) {
            System.out.println("Very little rain is expected in the summer regard");
        } else {
            System.out.println("Invalid season input");
        }
    }
}
