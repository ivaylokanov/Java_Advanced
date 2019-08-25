import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by kanov on 1/26/2017.
 */
public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> cards = new LinkedHashSet<>();
        LinkedHashMap<String, LinkedHashSet<String>> resultHand = new LinkedHashMap<>();
        String input = "";
        int cardPower = 0;
        while (!"JOKER".equals(input = scanner.nextLine())) {
            String[] inputCards = input.split(": ");
            inputCards[1] = inputCards[1].replaceAll("S", "4");
            inputCards[1] = inputCards[1].replaceAll("H", "3");
            inputCards[1] = inputCards[1].replaceAll("D", "2");
            inputCards[1] = inputCards[1].replaceAll("C", "1");
            inputCards[1] = inputCards[1].replaceAll("J", "11");
            inputCards[1] = inputCards[1].replaceAll("Q", "12");
            inputCards[1] = inputCards[1].replaceAll("K", "13");
            inputCards[1] = inputCards[1].replaceAll("A", "14");
            String[] prepare = inputCards[1].split(", ");
            if (!resultHand.containsKey(inputCards[0])) {
                resultHand.put(inputCards[0], new LinkedHashSet<>());
                for (int i = 0; i < prepare.length; i++) {

                    resultHand.get(inputCards[0]).add(prepare[i]);

                }
            } else {

                for (int i = 0; i < prepare.length; i++) {

                    resultHand.get(inputCards[0]).add(prepare[i]);

                }
            }


        }
        // for (LinkedHashSet<String> strings : resultHand.values()) {
        for (Map.Entry<String, LinkedHashSet<String>> entry : resultHand.entrySet()) {
            for (String string:entry.getValue()) {
                cardPower = cardPower + Integer.parseInt(string.substring(string.length() - 1))
                        * Integer.parseInt(string.substring(0, string.length() - 1));


            }
            System.out.printf("%s: %S\n", entry.getKey(), cardPower);
            cardPower = 0;
        }

    }
}
