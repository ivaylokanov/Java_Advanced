import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kanov on 2/26/2017.
 */
public class HornetWings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int wingFlaps = Integer.parseInt(reader.readLine());
        double distanceOf1000meters = Double.parseDouble(reader.readLine());
        int endurance = Integer.parseInt(reader.readLine());
        double distance = (wingFlaps / 1000) * distanceOf1000meters;
        System.out.printf("%.2f m.%n", distance);
        if (wingFlaps <= endurance) {
            if (wingFlaps < 100) {
                System.out.printf("%.0f s.", 1);
            } else {
                double time = wingFlaps / 100;
                System.out.printf("%.0f s.", time);
            }
        } else {
            if (wingFlaps < 100) {
                double time = (wingFlaps / endurance) * 5 + 1;
                System.out.printf("%.0f s.", time);
            } else {
                double time = (wingFlaps / endurance) * 5 + wingFlaps / 100;
                System.out.printf("%.0f s.", time);
            }

        }


    }
}