import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class pr02_simpleCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] operation = reader.readLine().split("\\s+");

        Deque<String> queue = new ArrayDeque();
        int sum = 0;
        for (int i = 0; i < operation.length; i++) {
            queue.add(operation[i]);
        }
        sum=Integer.valueOf(queue.remove());
        while (!queue.isEmpty()) {
            switch (queue.remove()) {
                case "+":
                    sum=sum + Integer.valueOf(queue.remove());
                    break;
                case "-":
                    sum=sum - Integer.valueOf(queue.remove());
                    break;
                default:
                    break;

            }
        }
        System.out.println(sum);

    }
}
