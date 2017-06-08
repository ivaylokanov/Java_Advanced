import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class pr04_groupNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, List<Integer>> numbers = new TreeMap<>();
        String[] number = reader.readLine().split(", ");
        for (int i = 0; i < number.length; i++) {
            int remainder = Math.abs(Integer.valueOf(number[i]) % 3);
            if (!numbers.containsKey(remainder)){
                numbers.put(remainder,new ArrayList<>());
            }
            numbers.get(remainder).add(Integer.valueOf(number[i]));
        }
        numbers.entrySet().stream().forEach(x->{
            for (Integer everyListElement : x.getValue()) {
                System.out.printf("%d ",everyListElement);
            }
            System.out.println();
        });
    }

}
