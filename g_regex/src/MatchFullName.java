import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/3/2017.
 */
public class MatchFullName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        while (!"end".equals(input)) {
            Pattern pattern = Pattern.compile("^[A-Z][a-z]{1,} [A-Z][a-z]{1,}$");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                System.out.println(input);
            }
            input = reader.readLine();
        }
    }
}