import java.util.*;

/**
 * Created by kanov on 1/9/2017.
 */
public class AppendList {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] arr = console.nextLine().split("\\|");
        ArrayList<String> elements = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            List<String> proba = Arrays.asList(arr[i].split(" "));
            for (String s : proba) {
                if (!s.equals("")) {
                    elements.add(s);
                }
            }
        }
        for (String element : elements) {
            System.out.print(element + " ");

        }

    }


}




