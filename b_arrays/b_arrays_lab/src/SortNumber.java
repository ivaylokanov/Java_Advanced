import java.util.*;

import static java.lang.Double.compare;
import static java.lang.Double.isFinite;

/**
 * Created by kanov on 1/12/2017.
 */
public class SortNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList(Arrays.asList(console.nextLine().split(" ")));
        ArrayList<Double> numbers = new ArrayList<>();
        for (String s : arr) {
            numbers.add(Double.parseDouble(s));
        }
        Collections.sort(numbers);

            for (int i = 0; i < numbers.size()-1; i++) {
                System.out.print(numbers.get(i) + " <= ");

            }
            System.out.print(numbers.get(numbers.size()-1));

    }
}
