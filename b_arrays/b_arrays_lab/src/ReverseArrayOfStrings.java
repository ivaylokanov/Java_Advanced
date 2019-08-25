import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by kanov on 1/8/2017.
 */
public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] arr = console.nextLine().split(" ");
        Collections.reverse(Arrays.asList(arr));
        Arrays.stream(arr)
                .forEach(e -> System.out.print(e+ " "));


    }
}
