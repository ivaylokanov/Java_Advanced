import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by kanov on 2/1/2017.
 */

public class SrubskoUnleashed {
    //    private static Pattern VALID_INPUT =
//            Pattern.compile(
//                    "([A-Z][a-z]+)\\s([A-Z][a-z]+)?\\s?([A-Z][a-z]+)?\\s?@([A-Z][a-z]+)\\s([A-Z][a-z]+)?\\s?([A-Z][a-z]+)?\\s?(\\d+)\\s(\\d+)");
//
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, LinkedHashMap<String, Integer>> concerts = new LinkedHashMap<>();
        String input;
        while (!"End".equals(input = reader.readLine())) {
            try {
                String[] data = input.split("@");
                String singer = data[0].trim();
                String[] preparedData = data[1].split(" ");
                String ticketsPrice = preparedData[preparedData.length - 1];
                String ticketsCount = preparedData[preparedData.length - 2];
                String venue = "";
                for (int i = 0; i < preparedData.length - 2; i++) {
                    venue = venue.concat(" " + preparedData[i]);
                }


                venue = venue.trim();

                int totalMoney = Integer.parseInt(ticketsCount) * Integer.parseInt(ticketsPrice);
                if (!concerts.containsKey(venue)) {
                    concerts.put(venue, new LinkedHashMap<>());
                }
                if (!concerts.get(venue).containsKey(singer)) {
                    concerts.get(venue).put(singer, 0);

                }
                concerts.get(venue).put(singer, concerts.get(venue).get(singer) + totalMoney);


            } catch (Exception e) {

            }
        }

        concerts.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey());
            concerts.get(entry.getKey()).entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(pairs -> System.out.printf("#  %s -> %d%n", pairs.getKey(), pairs.getValue()));

        });
    }
}
