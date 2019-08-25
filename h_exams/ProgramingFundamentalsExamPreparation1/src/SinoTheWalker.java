import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kanov on 2/24/2017.
 */
public class SinoTheWalker {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] time = reader.readLine().split(":");
        long hours = Integer.valueOf(time[0]);
        long minutes = Integer.valueOf(time[1]);
        long seconds = Integer.valueOf(time[2]);
        long steps = Integer.valueOf(reader.readLine());
        long secondsForStep = Integer.valueOf(reader.readLine());

        long totalSeconds = hours * 3600 + minutes * 60 + seconds + steps * secondsForStep;
       // totalSeconds=totalSeconds%86400;

        hours = (totalSeconds/3600)%24;
        minutes=(totalSeconds%3600)/60;
        seconds=(totalSeconds%3600)%60;
        System.out.printf("Time Arrival: %02d:%02d:%02d",hours,minutes,seconds);


    }
}
