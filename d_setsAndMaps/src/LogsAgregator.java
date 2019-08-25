import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by kanov on 1/28/2017.
 */
public class LogsAgregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int duration = 0;
        String output = "[";
        TreeMap<String, TreeMap<String, Integer>> logs = new TreeMap<>();
        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine().split(" ");
            String debug = "";
            if (!logs.containsKey(input[1])) {
                logs.put(input[1], new TreeMap<>());
                logs.get(input[1]).put(input[0], Integer.parseInt(input[2]));
            } else if (!logs.get(input[1]).containsKey(input[0])) {
                logs.get(input[1]).put(input[0], Integer.parseInt(input[2]));

            } else {
                duration = Integer.parseInt(input[2]) + logs.get(input[1]).get(input[0]);
                logs.get(input[1]).put(input[0], duration);
            }
        }
        duration=0;
        for (Map.Entry<String, TreeMap<String, Integer>> entry : logs.entrySet()) {

            for (Map.Entry<String, Integer> innerMap : logs.get(entry.getKey()).entrySet()) {
                duration = duration + innerMap.getValue();

                output = output.concat(innerMap.getKey() + ", ");
            }
            output=output.substring(0,output.lastIndexOf(",")).concat("]");
            System.out.println(entry.getKey() + ": " + duration +" "+ output);
            duration=0;
            output="[";
        }

    }


}

