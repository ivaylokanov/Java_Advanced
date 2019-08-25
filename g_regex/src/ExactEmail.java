import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/4/2017.
 */
public class ExactEmail {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input="";
        boolean check = false;
        while (!"end".equals(input = reader.readLine())){
            Pattern pattern = Pattern.compile("(?<= |^)[A-Za-z0-9][A-Za-z0-9\\.*-_]*@(?=[A-Za-z])[A-Za-z]+(\\.|-)[A-Za-z]+[A-Za-z\\.-]*(?=[\\., $])");
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()){
                System.out.println(matcher.group());
                check=true;
            }

        }
        if (check==false){
            System.out.println("");
        }

    }
}
