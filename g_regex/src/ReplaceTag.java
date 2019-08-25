import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/4/2017.
 */
public class ReplaceTag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder input = new StringBuilder();
        String line = "";
        while (!"END".equals(line = reader.readLine())) {
            input.append(line).append("\n");
        }
        Pattern pattern = Pattern.compile("<a(\\s+href=[^>]+)>([^<]+)<\\/a>");
        Matcher matcher = pattern.matcher(input);
        matcher = pattern.matcher(input);
        while (matcher.find()) {
            int startMatcher = matcher.start();
            int endMatcher = matcher.end();
            String replacement = createNewReplacment(matcher);
            input.replace(startMatcher, endMatcher, replacement);
            matcher = pattern.matcher(input);
        }
        System.out.println(input);
    }

    private static String createNewReplacment(Matcher matcher) {

        return "[URL" + matcher.group(1) + "]" + matcher.group(2) + "[/URL]";
    }
}
