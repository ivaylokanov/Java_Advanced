import java.util.*;

/**
 * Created by kanov on 1/25/2017.
 */
public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        String resourse = "";
        while (!"stop".equals(resourse = scanner.nextLine())) {

            int quantity = Integer.parseInt(scanner.nextLine());
            if (map.containsKey(resourse)) {
                map.put(resourse, map.get(resourse) + quantity);

            } else {
                map.put(resourse, quantity);
            }

        }
        for (String value : map.keySet()) {
            System.out.println(value + " -> " + map.get(value));
        }

    }
}
