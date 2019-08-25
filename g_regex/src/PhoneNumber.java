import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/5/2017.
 */
public class PhoneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String name = "";
        String number = "";
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        while (!"END".equals(input = reader.readLine())) {
            Pattern pattern = Pattern.compile("([A-Z][a-zA-Z]*)(?:[^a-zA-Z+]*?)(\\+?\\d[\\d()./\\- ]*\\d)", Pattern.MULTILINE);

            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                name = matcher.group(1);
                number = matcher.group(2).replaceAll("[^+\\d]","");
                phoneBook.put(name, number);
            }
        }
        if (!phoneBook.isEmpty()) {
            System.out.print("<ol>");

            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                System.out.printf("<li><b>%s:</b> %s</li>", entry.getKey(), entry.getValue());
            }
            System.out.print("</ol>");
        } else {
            System.out.println("<p>No matches!</p>");
        }
    }
}
