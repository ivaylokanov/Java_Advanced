import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.*;

/**
 * Created by kanov on 2/8/2017.
 */
public class Palindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split("[ ,\\.?!]");
    TreeSet<String> result = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        for (int i = 0; i <text.length ; i++) {
           StringBuilder builder = new StringBuilder(text[i]);
            if (text[i].equals(builder.reverse().toString())&&!text[i].equals("")){
                result.add(text[i]);
            }
        }

        System.out.println(result);

    }
}
