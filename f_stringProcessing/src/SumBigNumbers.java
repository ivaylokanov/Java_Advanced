import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kanov on 2/1/2017.
 */
public class SumBigNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder number1 = new StringBuilder(reader.readLine());
        StringBuilder number2 = new StringBuilder(reader.readLine());
        StringBuilder result = new StringBuilder();
        number1 = number1.reverse();
        number2 = number2.reverse();
        Long counter = 0L;
        long digit1 = 0L;
        Long digit2 = 0L;

        for (long i = 0L; i < Math.max(number1.length(), number2.length()); i++) {
            digit1 = 0L;
            digit2 = 0L;
            if (number1.length() > i) {
                digit1 = Long.parseLong(String.valueOf(number1.charAt((int) i)));
            }
            if (number2.length() > i) {
                digit2 = Long.parseLong(String.valueOf(number2.charAt((int) i)));
            }

            counter = digit1 + digit2 + counter;

            result = result.append(counter % 10);
            counter = counter / 10;
        }
        if (counter > 0) {
            result.append(counter);
        }
      trimZero(result);
            System.out.println(result.reverse());

    }
    private static StringBuilder trimZero(StringBuilder result) {

        while ((result.charAt(result.length() - 1)=='0')) {
            if (result.length() == 1) {
                System.out.println("0");
                return result;
            }
            result.deleteCharAt(result.length() - 1);
        }
        return result;
    }
}

