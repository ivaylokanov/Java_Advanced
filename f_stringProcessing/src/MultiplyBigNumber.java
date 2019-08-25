

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kanov on 2/7/2017.
 */
public class MultiplyBigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        StringBuilder builder = new StringBuilder(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());

        int counter = 0;
        int sum = 0;
        builder.reverse();
        for (int i = 0; i < builder.length(); i++) {
            sum = Integer.parseInt(String.valueOf(builder.charAt(i))) * secondNumber + counter;
            result.append(sum % 10);
            counter = sum / 10;

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

