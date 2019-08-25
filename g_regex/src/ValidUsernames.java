import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanov on 2/5/2017.
 */
public class ValidUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int bigestSum=0;
        int bigestIndex=0;
        int sum;
        LinkedList<String> compare = new LinkedList<>();
        Pattern pattern = Pattern.compile("\\b[A-Za-z]\\w{2,24}");
        Matcher matcher= pattern.matcher(text);
        while (matcher.find()){
            compare.add(matcher.group());
        }
        for (int i = 0; i <compare.size()-1 ; i++) {
            sum=compare.get(i).length()+compare.get(i+1).length();
            if (sum>bigestSum){
                bigestSum=sum;
                bigestIndex=i;
            }
        }
        if (!compare.isEmpty()) {
            System.out.printf("%s%n%s%n", compare.get(bigestIndex), compare.get(bigestIndex + 1));
        }
    }
}
