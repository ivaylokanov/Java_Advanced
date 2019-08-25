import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/26/2017.
 */
public class HornetComm {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        List<String> broadcasts = new ArrayList<>();
        List<String> messages = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while (!"Hornet is Green".equals(line = reader.readLine())) {
            Pattern pattern = Pattern.compile("^([\\d]+)(?: <-> )([A-Za-z0-9]+)$");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                sb.append(matcher.group(1));
                sb.reverse();
                messages.add(sb + " -> " + matcher.group(2));
                sb.delete(0, sb.length());
            }

            Pattern pattern1 = Pattern.compile("^([^\\d]+)(?: <-> )([A-Za-z0-9]+)$");
            Matcher matcher1 = pattern1.matcher(line);
            if (matcher1.find()) {
                sb.append(matcher1.group(2));
                for (int i = 0; i < sb.length(); i++) {
                    if (sb.charAt(i) >= 65 && sb.charAt(i) <= 90) {
                        char x = sb.toString().charAt(i);
                        int y = (char) x;
                        y = y + 32;
                        sb.setCharAt(i, (char) y);
                    } else {
                        if (sb.charAt(i) >= 97 && sb.charAt(i) <= 122) {
                            char x = sb.toString().charAt(i);
                            int y = (char) x;
                            y = y - 32;
                            sb.setCharAt(i, (char) y);
                        }
                    }

                }

                broadcasts.add(sb + " -> " + matcher1.group(1));
                sb.delete(0, sb.length());
            }
        }
        System.out.println("Broadcasts:");
        if (!broadcasts.isEmpty()) {
            for (String broadcast : broadcasts) {
                System.out.println(broadcast);
            }
        } else {
            System.out.println("None");
        }

        System.out.println("Messages:");
        if (!messages.isEmpty()) {
            for (String message : messages) {
                System.out.println(message);
            }
        } else {
            System.out.println("None");
        }

    }
}

