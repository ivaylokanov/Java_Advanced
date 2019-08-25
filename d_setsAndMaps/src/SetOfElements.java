import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by kanov on 1/25/2017.
 */
public class SetOfElements {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String output = "";
        String[] inputLenght = scaner.nextLine().split(" ");
        LinkedHashSet<String> firstSet = new LinkedHashSet<>();
        LinkedHashSet<String> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < Integer.parseInt(inputLenght[0]); i++) {
            firstSet.add(scaner.nextLine());
        }
        for (int i = 0; i < Integer.parseInt(inputLenght[1]); i++) {
            secondSet.add(scaner.nextLine());
        }
        for (String number : firstSet) {
            if (secondSet.contains(number)) {
                System.out.print(number+ " ");

            }
        }

    }
}
