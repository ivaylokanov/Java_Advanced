
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by kanov on 2/24/2017.
 */
public class SoftUniKaraoke {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> people = Stream.of(reader.readLine().split(", ")).collect(Collectors.toList());
        List<String> songs = Stream.of(reader.readLine().split(", ")).collect(Collectors.toList());
        TreeMap<String, TreeSet<String>> map = new TreeMap<>();
        String input = "";
        while (!"dawn".equals(input = reader.readLine())) {
            String[] command = input.split(", ");
            String participant = command[0];
            String song = command[1];
            String award = command[2];
            if (people.contains(participant) && songs.contains(song)) {
                if (!map.containsKey(participant)) {
                    map.put(participant, new TreeSet<>());

                }
                map.get(participant).add(award);

            }
        }
        if (!map.isEmpty()) {
            map.entrySet().stream()
                    .sorted(Comparator.comparing(e -> e.getValue().size(), Comparator.reverseOrder()))
                    .forEach(entry -> {
                        System.out.printf("%s: %d awards%n", entry.getKey(), entry.getValue().size());
                        for (String s : entry.getValue()) {
                            System.out.printf("--%s%n", s);
                        }
                    });
        }else {
            System.out.println("No awards");
        }


    }


}

