import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by kanov on 1/25/2017.
 */
public class CountSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        TreeMap<Character, Integer> result = new TreeMap<>();
        for (int i = 0; i < inputText.length(); i++) {
            if (!result.containsKey(inputText.charAt(i))) {
                result.put(inputText.charAt(i), 1);
            } else {
                result.put(inputText.charAt(i), result.get(inputText.charAt(i))+1);
            }
        }
        for (Character key : result.keySet()) {
            System.out.println(key + ": " + result.get(key) + " time/s");
        }
    }
}
