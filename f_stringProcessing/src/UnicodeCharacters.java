import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kanov on 2/8/2017.
 */
public class UnicodeCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String input = reader.readLine();
        for (int i = 0; i <input.length() ; i++) {

            System.out.print(String.format ("\\u%04x", (int)input.charAt(i)));
        }
    }
}
