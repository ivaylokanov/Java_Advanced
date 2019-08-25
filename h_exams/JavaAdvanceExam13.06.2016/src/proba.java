import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

/**
 * Created by kanov on 2/12/2017.
 */
public class proba {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String keyName = reader.readLine();
        String regex = "([A-Za-z]{" + keyName.length() + "})";
        System.out.println(regex);
    }
}
