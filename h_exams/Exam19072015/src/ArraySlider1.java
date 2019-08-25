
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;


/**
 * Created by kanov on 2/16/2017.
 */
public class ArraySlider1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().trim().split("\\s+");
        ArrayList<BigInteger> tokens = new ArrayList<>();
        String inputCommand = "";
        Integer ofset;
        Integer index = 0;
        BigInteger operation = new BigInteger("0");
        String operand = "";
        for (String s : input) {
            tokens.add(new BigInteger(s));
        }
        while (!"stop".equals(inputCommand = reader.readLine())) {
            String[] command = inputCommand.trim().split("\\s+");
            ofset = Integer.valueOf(command[0]);
            operation = new BigInteger(command[2]);
            operand = command[1];
            ofset=ofset%tokens.size();
            index = index + ofset;


            if (index < 0) {
                index = tokens.size() - Math.abs(index) % (tokens.size());
            } else {
                index = index % (tokens.size());
            }

            switch (operand) {
                case "+":
                    tokens.set(index, tokens.get(index).add(operation));
                    break;
                case "-":
                    tokens.set(index, tokens.get(index).subtract(operation));
                    break;
                case "*":
                    tokens.set(index, tokens.get(index).multiply(operation));
                    break;
                case "/":
                    tokens.set(index, tokens.get(index).divide(operation));
                    break;
                case "&":
                    tokens.set(index, tokens.get(index).and(operation));
                    break;
                case "|":
                    tokens.set(index, tokens.get(index).or(operation));
                    break;
                case "^":
                    tokens.set(index, tokens.get(index).xor(operation));
                    break;
                    default:
                        break;

            }

            if (tokens.get(index).compareTo(BigInteger.ZERO) < 0) {
                tokens.set(index, BigInteger.ZERO);
            }

        }
        System.out.println(tokens);
    }
}
