import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/3/2017.
 */
public class Test {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, List<String>> proba = new LinkedHashMap<>();
        proba.put("kol",new ArrayList<>());
        proba.get("kol").add("proba1");
        proba.get("kol").add("proba2");
        proba.get("kol").add("proba3");
        System.out.println(proba);

    }
}
