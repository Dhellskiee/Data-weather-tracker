package weather.data.tracker;
import java.util.Scanner;

public class WeatherDataTracker {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        final int city = 3;
        final int days = 7;

        double[][] tmper = new double[city][days];

        System.out.println("=== Weather Data Tracker ===");
        System.out.println("Enter the temperature for 3 cities over 7 days.\n");

     
        for (int i = 1; i <= city; i++) {
            System.out.println("City " + (i) + ": ");
            for (int j = 1; j < days; j++) {
                System.out.print("  Day " + (j) + " temperature: ");
                tmper[i][j] = data.nextDouble();
            }
            System.out.println();
        }

       
        for (int i = 0; i < city; i++) {
            double sum = 0;
            double highest = tmper[i][0];  

            // Loop through the week
            for (int j = 0; j < days; j++) {
                sum += tmper[i][j];
                if (tmper[i][j] > highest) {
                    highest = tmper[i][j];
                }
            }

            double avg = sum / days;

            System.out.println("City " + (i + 1) + " Results:");
            System.out.printf("  Average Temperature: %.2f°C\n", avg);
            System.out.printf("  Highest Temperature: %.2f°C\n", highest);
            System.out.println();
        }

    }
}
