import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by kanov on 2/17/2017.
 */
public class PopulationCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        String city = "";
        String country = "";
        Long population = 0L;
        HashMap<String, LinkedHashMap<String, Long>> counting = new HashMap<>();
        LinkedHashMap<String, Long> totalPopulation = new LinkedHashMap<>();
        while (!"report".equals(line = reader.readLine())) {
            String[] input = line.split("\\|");
            city = input[0];
            country = input[1];
            population = Long.valueOf(input[2]);
            if (!counting.containsKey(country)) {
                counting.put(country, new LinkedHashMap<>());
            }
            if (!counting.get(country).containsKey(city)) {
                counting.get(country).put(city, 0L);
            }
            counting.get(country).put(city, population);
            if (!totalPopulation.containsKey(country)) {
                totalPopulation.put(country, 0L);
            }
            totalPopulation.put(country, totalPopulation.get(country) + population);
        }

        totalPopulation.entrySet().stream().sorted((x2, x1) -> x1.getValue().compareTo(x2.getValue())).forEach(entry -> {

            System.out.printf("%s (total population: %d)%n", entry.getKey(), entry.getValue());

            counting.get(entry.getKey()).entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(pairs -> {
                System.out.printf("=>%s: %d%n", pairs.getKey(), pairs.getValue());
            });
        });

    }
}
