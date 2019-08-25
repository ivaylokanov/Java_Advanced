import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static javafx.scene.input.KeyCode.K;
import static javafx.scene.input.KeyCode.V;

/**
 * Created by kanov on 1/29/2017.
 */
//Test for GitHub
public class PopulationCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        HashMap<String, LinkedHashMap<String, Long>> analyse = new HashMap<>();
        LinkedHashMap<String, Long> populations = new LinkedHashMap<>();
        while (!"report".equals(input = reader.readLine())) {
            String[] data = input.split("\\|");
            String city = data[0];
            String country = data[1];
            String population = data[2];
            if (!analyse.containsKey(country)) {
                analyse.put(country, new LinkedHashMap<>());
                populations.put(country, 0L);
            }
            analyse.get(country).put(city, Long.parseLong(population));
            populations.put(country, populations.get(country) + Integer.parseInt(population));
        }
        populations.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(entry -> {
            System.out.printf("%s (total population: %s)\n", entry.getKey(), entry.getValue());

            analyse.get(entry.getKey()).entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .forEach(pairs -> System.out.println("=>" + pairs.getKey() + ": " + pairs.getValue()));

        });

    }
}
