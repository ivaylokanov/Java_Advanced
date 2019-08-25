import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by kanov on 2/11/2017.
 */
public class JediMeditation {

    private static void sortByValues(LinkedHashMap map) {
        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });
        for (Object value : list) {
            System.out.printf("%s ",value.toString().substring(0,2));

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        LinkedHashMap<String, String> tokens = new LinkedHashMap();
        String line = "";
        for (int i = 0; i < n; i++) {
            line = reader.readLine();
            String[] input = line.split(" ");
            for (int j = 0; j < input.length; j++) {

                switch (input[j].charAt(0)) {
                    case 'm':
                        tokens.put(input[j], "m");
                        break;
                    case 'k':
                        tokens.put(input[j], "n");
                        break;
                    case 'p':
                        tokens.put(input[j], "p");
                        break;
                    case 's':
                        if (line.contains("y")) {
                            tokens.put(input[j], "o");
                        } else {
                            tokens.put(input[j], "l");
                        }
                        break;
                    case 't':
                        if (line.contains("y")) {
                            tokens.put(input[j], "o");
                        } else {
                            tokens.put(input[j], "l");
                        }
                        break;
                }

                tokens.remove("y1");
            }
        }
     //   tokens.entrySet().stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).forEach(entry -> System.out.printf("%s ", entry.getKey()));
       // System.out.println();
        sortByValues(tokens);

    }
}