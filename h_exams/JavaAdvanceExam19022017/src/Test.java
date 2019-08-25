import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by kanov on 2/18/2017.
 */
public class Test {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder resultNew = new StringBuilder();
        StringBuilder result = new StringBuilder("abc");
        for (int i = 0; i <result.length() ; i++) {
            char x = (char) (result.charAt(i)+9);
            resultNew.append(x);
        }
        System.out.println(result);
        System.out.println(resultNew);
    }

}
