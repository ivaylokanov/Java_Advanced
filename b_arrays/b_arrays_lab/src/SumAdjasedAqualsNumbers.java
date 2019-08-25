import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kanov on 1/11/2017.
 */
public class SumAdjasedAqualsNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(console.nextLine().split(" ")));
        ArrayList<Double> numbers = new ArrayList<>();
        for (String s : arr) {
            numbers.add(Double.parseDouble(s));
        }
        for (int i = 0; i < numbers.size()-1; i++) {
            if (numbers.get(i).equals(numbers.get(i+1))) {
                numbers.add(i+2,numbers.get(i)+numbers.get(i+1));
                numbers.remove(i);
                numbers.remove(i);
             i=-1;
            }

        }
        for (Double number : numbers) {
            System.out.print(number+" ");
        }
    }
}
