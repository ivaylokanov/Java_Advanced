import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kanov on 1/12/2017.
 */
public class SplitByWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> text = new ArrayList(Arrays.asList(console.nextLine().split("[, ; : . ! ( ) \" ' \\ / \\s]+")));
        ArrayList<String> toUpper = new ArrayList<>();
        ArrayList<String> toLower = new ArrayList<>();
        ArrayList<String> mixed = new ArrayList<>();
        for (String s : text) {
            if (s.matches("[a-z]+")) {
                toLower.add(s);
            } else if (s.matches("[A-Z]+")) {
                toUpper.add(s);
            } else {
                mixed.add(s);
            }
        }

        System.out.printf("Lower-case: " + toLower.toString().join(", ", toLower) + "\n");
        System.out.printf("Mixed-case: " + toLower.toString().join(", ", mixed) + "\n");
        System.out.printf("Upper-case: " + toLower.toString().join(", ", toUpper) + "\n");

    }
}
