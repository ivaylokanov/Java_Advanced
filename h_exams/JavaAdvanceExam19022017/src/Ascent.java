import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/19/2017.
 */
public class Ascent {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        StringBuilder result = new StringBuilder();
        StringBuilder resultNew = new StringBuilder();
        HashMap<String, String> memorization = new HashMap<>();
        boolean check = false;
        while (!"Ascend".equals(line = reader.readLine())) {
            check=false;
            while (!check) {

                Pattern pattern = Pattern.compile("([,_])([A-Za-z]+)(\\d)");
                Matcher macher = pattern.matcher(line);
                while (macher.find()) {
                    result.delete(0, result.length());

                    result.append(macher.group(2));
                    if (",".equals(macher.group(1))) {
                        resultNew.delete(0, resultNew.length());
                        for (int i = 0; i < result.length(); i++) {
                            char x = (char) (result.charAt(i) + Integer.parseInt(macher.group(3)));
                            resultNew.append(x);

                        }

                        memorization.put(macher.group(), resultNew.toString());
                        line = line.replaceAll(macher.group(), resultNew.toString());
                    }
                    if ("_".equals(macher.group(1))) {
                        resultNew.delete(0, resultNew.length());
                        for (int i = 0; i < result.length(); i++) {
                            char x = (char) (result.charAt(i) - Integer.parseInt(macher.group(3)));
                            resultNew.append(x);
                        }
                        memorization.put(macher.group(), resultNew.toString());
                        line = line.replaceAll(macher.group(), resultNew.toString());
                    }

                }
                for (Map.Entry<String, String> entry : memorization.entrySet()) {

                    line = line.replaceAll(entry.getKey(), entry.getValue());
                    System.out.println(line);
                }

                check = true;
                System.out.println(line);
            }
        }

    }
}
