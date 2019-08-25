import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by kanov on 2/19/2017.
 */
public class Highscore {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, LinkedHashMap<String, Long>> beatles = new LinkedHashMap<>();
        TreeMap<String, Long> totalScores = new TreeMap<>();
        String input = "";
        String player1 = "";
        String player2 = "";
        long score1 = 0L;
        long score2 = 0L;
        long result = 0L;
        long sum = 0L;


        while (!"osu!".equals(input = reader.readLine())) {
            input = input.replaceAll("<->", " ");
            String[] newInput = input.split(" ");
//            Pattern pattern = Pattern.compile("([\\d]+) ([\\w]+)<->([\\w]+) ([\\d]+)");
//            Matcher matcher = pattern.matcher(input);
//            System.out.println(matcher.group(2));
            player1 = newInput[1];
            score1 = Long.valueOf(newInput[0]);
            player2 = newInput[2];
            score2 = Long.valueOf(newInput[3]);
            result = score1 - score2;
            if (!beatles.containsKey(player1)) {
                beatles.put(player1, new LinkedHashMap<>());
            }
            if (!beatles.containsKey(player2)) {
                beatles.put(player2, new LinkedHashMap<>());
            }
            beatles.get(player1).put(player2, result);
            beatles.get(player2).put(player1, -result);
        }
        for (Map.Entry<String, LinkedHashMap<String, Long>> entry : beatles.entrySet()) {

            for (Map.Entry<String, Long> innerMap : beatles.get(entry.getKey()).entrySet()) {
                sum = sum + innerMap.getValue();
            }

            totalScores.put(entry.getKey(), sum);
            sum = 0L;
        }
        totalScores.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(pairs -> {
            System.out.printf("%s - (%d)%n", pairs.getKey(), pairs.getValue());

            beatles.get(pairs.getKey()).entrySet().stream().forEach(gosho -> {
                System.out.printf("*   %s <-> %d%n", gosho.getKey(), gosho.getValue());

            });
        });
    }
}
