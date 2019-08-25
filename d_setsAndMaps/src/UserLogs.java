import sun.reflect.generics.tree.Tree;

import java.util.*;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * Created by kanov on 1/27/2017.
 */
public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        int counter = 1;
        TreeMap<String, LinkedHashMap<String, Integer>> result = new TreeMap<>();
        String output = "";
        while (!"end".equals(input = scanner.nextLine())) {
            String[] log = input.split(" ");
            log[0] = log[0].substring(3);
            log[2] = log[2].substring(5);
            if (!result.containsKey(log[2])) {
                result.put(log[2], new LinkedHashMap<>());
                result.get(log[2]).put(log[0], counter);
            } else if (!result.get(log[2]).containsKey(log[0])) {
                result.get(log[2]).put(log[0], counter);
            } else {
                counter = result.get(log[2]).get(log[0]) + 1;
                result.get(log[2]).put(log[0], counter);
            }
            counter = 1;
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": ");
            for (Map.Entry<String, Integer> innerMap : result.get(entry.getKey()).entrySet()) {
                output = output.concat(innerMap.getKey() + " => " + innerMap.getValue() + ", ");
            }
            output=output.substring(0,output.length()-2).concat(".");
            System.out.println(output);
            output = "";
        }
    }
}


