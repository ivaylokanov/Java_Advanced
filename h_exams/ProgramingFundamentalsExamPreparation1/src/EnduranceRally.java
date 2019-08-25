import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kanov on 2/25/2017.
 */
public class EnduranceRally {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] driver = reader.readLine().split(" ");
        String[] zone = reader.readLine().split(" ");
        Double[] manZone = new Double[zone.length];
        String[] index = reader.readLine().split(" ");
        Double race = 0.0;

        for (int i = 0; i < zone.length; i++) {
            manZone[i] = Double.valueOf(zone[i]);
        }
        for (int i = 0; i < index.length; i++) {
            int manipulatedIndex = Integer.valueOf(index[i]);
            manZone[i] = Double.valueOf(zone[manipulatedIndex]) * (-1);
        }

        for (int i = 0; i < driver.length; i++) {
            race = (double) driver[i].charAt(0);
            for (int j = 0; j < zone.length; j++) {
                if (race - Double.valueOf(zone[j]) > 0) {
                    race = race - Double.valueOf(zone[j]);
                } else {
                    System.out.printf("%s reached 0%n",driver[i]);
                    break;
                }
            }
            System.out.printf("%s - fuel left %.2f%n", driver[i], race);

        }
    }


}
