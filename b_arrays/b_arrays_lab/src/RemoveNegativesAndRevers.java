import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

/**
 * Created by kanov on 1/9/2017.
 */
public class RemoveNegativesAndRevers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] arr = console.nextLine().split(" ");
        ArrayList<Integer> positiveItems = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) >= 0) {
                positiveItems.add(Integer.parseInt(arr[i]));
            }
        }

        if (!positiveItems.isEmpty()) {
            Collections.reverse(positiveItems);
            for (Integer positiveItem : positiveItems) {
                System.out.print(positiveItem + " ");
            }
        } else {
            System.out.print("empty");
        }

    }
}
