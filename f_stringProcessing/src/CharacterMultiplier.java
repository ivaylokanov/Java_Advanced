import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kanov on 2/8/2017.
 */
public class CharacterMultiplier {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        int sum = 0;
        for (int i = 0; i < Math.min(input[0].length(), input[1].length()); i++) {
            sum = sum + (int) input[0].charAt(i) * (int) input[1].charAt(i);
        }
        if (input[0].length() > Math.min(input[0].length(), input[1].length())) {
            for (int i = Math.min(input[0].length(), input[1].length()); i < input[0].length(); i++) {
                sum = sum + (int) input[0].charAt(i);
            }
        } else {
            for (int i = Math.min(input[0].length(), input[1].length()); i < input[1].length(); i++) {
                sum = sum + (int) input[1].charAt(i);
            }
        }
        System.out.println(sum);
    }
}