import javafx.scene.shape.PathElement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/6/2017.
 */
public class SemanticHTML {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while (!"END".equals(input = reader.readLine())) {
            StringBuilder text = new StringBuilder();
            if (input.contains("<div")) {
                Pattern pattern = Pattern.compile("(<div).*?( *(?:id|class) *= *\"(\\w+)\")", Pattern.MULTILINE);
                Matcher matcher = pattern.matcher(input);
                while (matcher.find()) {

                    input = input.replaceAll(matcher.group(2), "");
                    input = input.replaceAll("div", matcher.group(3));
                }

            }


            if (input.contains("</div>") || input.contains("<div/>")) {

                input = input.replaceAll("[!\\- ]", "");
                input = input.replaceAll("(><)", "");
                input = input.replaceAll("div", "");


            }
            System.out.println(input);
        }
    }
}
