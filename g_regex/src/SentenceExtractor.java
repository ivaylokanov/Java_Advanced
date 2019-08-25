import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/4/2017.
 */
public class SentenceExtractor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String keyWord = reader.readLine();
        String text = reader.readLine();
        String regex = "(^| )[^!.?]*\\b"+keyWord+"\\b.*?[.!?]";


        Pattern pattern= Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group().trim());
        }

    }
}
