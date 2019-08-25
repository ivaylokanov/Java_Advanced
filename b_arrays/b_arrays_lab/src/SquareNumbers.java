import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kanov on 1/14/2017.
 */
public class SquareNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // ArrayList<String> nums = new ArrayList(Arrays.asList(console.nextLine().split(" ")));
        String input = console.nextLine();

        String mostra = console.nextLine();
        Integer n = 0;


        for (int i=0; i < input.length()-mostra.length(); i++) {
            if (input.toLowerCase().indexOf(mostra.toLowerCase(), i) != -1) {
                n++;
                i=input.toLowerCase().indexOf(mostra.toLowerCase(), i);

            }

        }

        System.out.println(n);
    }
}

