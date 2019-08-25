import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/12/2017.
 */
public class JediCodeX {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfLines = Integer.parseInt(reader.readLine());
        ArrayList<String> jedis = new ArrayList<>();
        ArrayList<String> messages = new ArrayList<>();
        String[] text = new String[numberOfLines];
        String line = "";
        for (int i = 0; i < numberOfLines; i++) {
            text[i] = reader.readLine();
        }
        String keyName = reader.readLine();
        String keyMessage = reader.readLine();
        String[] index = reader.readLine().split(" ");
        String regexName = "(?<name>[A-Za-z]+)";
        String regexMessage = "(?<message>[A-Za-z0-9]+)";

        for (int i = 0; i < text.length; i++) {

            Pattern patternJedis = Pattern.compile((Pattern.quote(keyName) + regexName));
            Matcher matcherJedis = patternJedis.matcher(text[i]);
            while (matcherJedis.find()) {
                if (matcherJedis.group("name").length() == keyName.length()) {
                    jedis.add(matcherJedis.group("name"));
                }
            }
            Pattern patternMessages = Pattern.compile(Pattern.quote(keyMessage) + regexMessage);
            Matcher matcherMessages = patternMessages.matcher(text[i]);
            while (matcherMessages.find()) {
                if (matcherMessages.group("message").length() == keyMessage.length()) {
                    messages.add(matcherMessages.group("message"));
                }
            }

        }

        for (int i = 0; i <jedis.size(); i++) {
            if ((index.length>=i)&&(Integer.valueOf(index[i])<=messages.size())){
                System.out.printf("%s - %s%n",jedis.get(i),messages.get(Integer.valueOf(index[i])-1));
            }
        }

    }
}
