import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kanov on 2/1/2017.
 */
public class CountSubstringOccurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder text = new StringBuilder(reader.readLine().toLowerCase());
        String key = reader.readLine().toLowerCase();
        int counter = 0;
        int index = 0;
        boolean check = false;
        while (!(index<0)) {
            index = text.indexOf(key);
            text = text.delete(0, index+1);
            counter++;
        }
        System.out.println(counter-1);
    }
}
