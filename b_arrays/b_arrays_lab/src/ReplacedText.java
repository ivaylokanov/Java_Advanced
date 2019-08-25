import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kanov on 1/15/2017.
 */
public class ReplacedText {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] banList = console.nextLine().split(", ");
        String text = console.nextLine();
        for (int i = 0; i < banList.length; i++) {
            text = text.replaceAll(banList[i],banList[i].replaceAll(".","*"));
        }


        System.out.println(text);
    }
}
