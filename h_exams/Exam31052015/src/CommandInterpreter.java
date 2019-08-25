
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/**
 * Created by kanov on 2/18/2017.
 */
public class CommandInterpreter {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> result = new ArrayList<>(Arrays.asList(reader.readLine().split("\\s+")));
        ArrayList<String> modifier = new ArrayList<>();
        String input = "";
        while (!"end".equals(input = reader.readLine())) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "reverse":
                    int startIndex = Integer.valueOf(command[2]);
                    int count = Integer.valueOf(command[4]);
                    if ((startIndex + count - 1 < result.size())&&startIndex>=0&&count>=0) {
                        modifier.addAll(result.subList(startIndex, startIndex + count));
                        Collections.reverse(modifier);
                        result.removeAll(result.subList(startIndex, startIndex + count));
                        result.addAll(startIndex, modifier);
                    } else {
                        System.out.println("Invalid input parameters.");
                    }
                    break;
                case "sort":
                    startIndex = Integer.valueOf(command[2]);
                    count = Integer.valueOf(command[4]);
                    if ((startIndex + count - 1 < result.size())&&startIndex>=0&&count>=0) {
                        modifier.addAll(result.subList(startIndex, startIndex + count));
                        Collections.sort(modifier);
                        Collections.sort(modifier, Collator.getInstance(Locale.ENGLISH));
                        result.removeAll(result.subList(startIndex, startIndex + count));
                        result.addAll(startIndex, modifier);
                    } else {
                        System.out.println("Invalid input parameters.");

                    }
                    break;
                case "rollRight":
                    count = Integer.valueOf(command[1]);
                    count=count%result.size();
                    if (result.size() > 0&&count>=0) {
                        for (int i = 1; i <= count; i++) {
                            result.add(0, result.remove(result.size() - 1));
                        }
                    } else {
                        System.out.println("Invalid input parameters.");

                    }
                    break;
                case "rollLeft":
                    count = Integer.valueOf(command[1]);
                    count=count%result.size();

                    if (result.size() > 0&&count>=0) {
                        for (int i = 1; i <= count; i++) {
                            result.add(result.remove(0));
                        }
                    } else {
                        System.out.println("Invalid input parameters.");

                    }
                    break;
                default:
                    break;

            }
        }
        System.out.println(result);
    }


}
