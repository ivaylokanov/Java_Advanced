import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by kanov on 1/25/2017.
 */
public class UniqueUserName {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        LinkedHashSet<String> names = new LinkedHashSet<>();
        int n = Integer.parseInt(scaner.nextLine());
        for (int i = 0; i <n ; i++) {
            names.add(scaner.nextLine());

        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
