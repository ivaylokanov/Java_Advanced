import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/6/2017.
 */
public class QueryMess {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String key = "";
        String value = "";
        LinkedHashMap<String, List<String>> data = new LinkedHashMap<>();
        int index = 0;
        int counter = 0;
        String result = "";
        while (!"END".equals(input = reader.readLine())) {
            StringBuilder builder = new StringBuilder(input);
            if (input.contains("%20")||input.contains("+")) {
                result = builder.toString().replaceAll("%20", "+");
                Pattern pattern = Pattern.compile("(\\+)\\1*");
                Matcher matcher = pattern.matcher(result);
                while (matcher.find()) {
                    result = matcher.replaceAll(matcher.group(1));
                    result = result.replaceAll("\\+", " ");
                }
            }
           String[] prepare1 = result.split("&");
            for (int i = 0; i <prepare1.length ; i++) {
                String[] prepare2=prepare1[i].split("=");
                if (!data.containsKey(prepare2[0].trim())){
                    data.put(prepare2[0].trim(), new ArrayList<>());
                }
                data.get(prepare2[0].trim()).add(prepare2[1].trim());
            }
            System.out.println(data);
        }
    }
}
