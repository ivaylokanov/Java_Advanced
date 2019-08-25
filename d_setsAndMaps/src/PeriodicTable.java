import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by kanov on 1/25/2017.
 */
public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<>();
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {

            String[] input = scanner.nextLine().split(" ");
            for (String element : input) {
                set.add(element + " ");
            }

        }

        for (String element : set) {

            System.out.print(element);
        }

    }
}

