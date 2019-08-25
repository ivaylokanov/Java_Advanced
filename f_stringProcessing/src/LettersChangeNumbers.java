import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kanov on 2/8/2017.
 */
public class LettersChangeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");

        int letterFirst;
        int letterSecond;
        BigDecimal sum = new BigDecimal(0.0);
        BigDecimal totalSum = new BigDecimal(0.0);

        for (int i = 0; i < input.length; i++) {

            letterFirst = (int) input[i].charAt(0);
            letterSecond = (int) input[i].charAt(input[i].length() - 1);
            sum = BigDecimal.valueOf(Long.parseLong(input[i].substring(1, input[i].length()-1)));
            if (letterFirst >= 97 && letterFirst <= 122) {
                letterFirst = letterFirst - 96;
                sum = sum.multiply(BigDecimal.valueOf(letterFirst));
            } else {
                letterFirst = letterFirst - 64;
                sum=sum.divide(BigDecimal.valueOf(letterFirst));
            }
            if (letterSecond >= 97 && letterFirst <= 122) {
                letterSecond = letterSecond - 96;
                sum = sum.add(BigDecimal.valueOf(letterSecond));
            } else {
                letterSecond = letterSecond - 64;
                sum = sum.subtract(BigDecimal.valueOf(letterSecond));
            }
            totalSum = totalSum.add(sum);
            sum=sum.ZERO;
        }
        System.out.println(totalSum.setScale(2,BigDecimal.ROUND_HALF_UP));
    }
}
