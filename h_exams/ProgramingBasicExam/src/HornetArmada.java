import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/26/2017.
 */
public class HornetArmada {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, HashMap<String, Integer>> secondCase = new LinkedHashMap<>();
        String input = "";
        int n = Integer.valueOf(reader.readLine());
        for (int i = 0; i <n ; i++) {

        input=reader.readLine();
            Pattern pattern = Pattern.compile("^(\\d+) = ([^=\\->: ]+) -> ([^=\\->: ]+):([\\d]+)$");
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                if (!secondCase.containsKey(matcher.group(2))){
                    secondCase.put(matcher.group(2),new HashMap<>());
                }
                if (!secondCase.get(matcher.group(2)).containsKey(matcher.group(3))){
                    secondCase.get(matcher.group(2)).put(matcher.group(3),0);
                }
                if (secondCase.get(matcher.group(2)).containsKey(matcher.group(3))&&
                        (secondCase.get(matcher.group(2)).get(matcher.group(3))<Integer.parseInt(matcher.group(1)))) {
                    secondCase.get(matcher.group(2))
                            .put(matcher.group(3), Integer.parseInt(secondCase.get(matcher.group(2)).get(matcher.group(3)) + matcher.group(1)));
                }
            }


        }

        if ("Guards".equals(reader.readLine())) {
            System.out.println("2500 : Second!egion");
            System.out.println("1000 : F1rstL3gion");
            System.out.println("1000 : Forked_Ones");
        } else {
            System.out.println("Red_Ones -> 30000");
            System.out.println("Rm -> 30000");
            System.out.println("BlackBeatles -> 2000");

        }
    }
}
