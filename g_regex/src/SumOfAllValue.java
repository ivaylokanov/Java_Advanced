import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/5/2017.
 */
public class SumOfAllValue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String startKey = "";
        String endKey = "";
        String keysString = reader.readLine();
        String textString = reader.readLine();
        double sum = 0.0;
        Pattern patternKey = Pattern.compile("^([a-zA-Z_]+(?=\\d)).*?((?<=\\d)[a-zA-Z_]+)$");
        Matcher matcher = patternKey.matcher(keysString);
        while (matcher.find()) {

                startKey = matcher.group(1);
                endKey = matcher.group(2);

        }
        if ("".equals(startKey)||"".equals(endKey)){
            System.out.println("<p>A key is missing</p>");
            return;
        }
        String regex = "(-?\\d*(?:\\.?)\\d+)";
        Pattern patternText = Pattern.compile(Pattern.quote(startKey)+regex+Pattern.quote(endKey), Pattern.MULTILINE);
        Matcher matcherText = patternText.matcher(textString);

        while (matcherText.find()) {
            sum = sum + Double.parseDouble(matcherText.group(1));

        }
        if (sum == 0) {
            System.out.println("<p>The total value is: <em>nothing</em></p>");
        } else {
            System.out.printf("<p>The total value is: <em>%.2f</em></p>", sum);
        }
    }
}