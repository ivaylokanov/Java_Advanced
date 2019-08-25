import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/3/2017.
 */
public class SeriesOfLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        Pattern pattern = Pattern.compile("([A-Za-z])\\1*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        String result = "";
        while (matcher.find()) {
            result = matcher.replaceAll(matcher.group(1));
            System.out.print(result);
        }

    }
}
