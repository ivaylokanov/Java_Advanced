import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kanov on 2/8/2017.
 */
public class TextFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] banerWords = reader.readLine().split(", ");
        String bannerWordsReplacment="";
        String text = reader.readLine();
        for (int i = 0; i <banerWords.length ; i++) {
            bannerWordsReplacment=banerWords[i].replaceAll(".","*");
            text = text.replaceAll(banerWords[i],bannerWordsReplacment);
        }
        System.out.println(text);
    }
}
