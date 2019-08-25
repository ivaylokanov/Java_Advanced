import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * Created by kanov on 2/19/2017.
 */
public class Earthquake1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = Integer.valueOf(reader.readLine());
        ArrayList<ArrayList<Integer>> basiLista = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> input = new ArrayList<>();

        //List<Integer> input = Stream.of(reader.readLine().split(" ")).map(number -> Integer.parseInt(number)).collect(Collectors.toList());
        //List<Integer> input2 = Arrays.stream(reader.readLine().split(" ")).map(number -> Integer.parseInt(number)).collect(Collectors.toList());

        int counter = 0;

        for (int i = 0; i < lineCount; i++) {
            String[] inputStr = reader.readLine().split(" ");
            for (int j = 0; j < inputStr.length; j++) {
                input.add(Integer.valueOf(inputStr[j]));
            }
            basiLista.add(i, new ArrayList<Integer>(input));
            input.clear();
        }

        while (!basiLista.isEmpty()) {
            if (basiLista.get(counter).size() == 1) {
                result.add(basiLista.get(counter).get(0));
                basiLista.remove(counter);
                if (counter > basiLista.size() - 1) {
                    counter = 0;
                }
            } else if (basiLista.get(counter).get(0) >= basiLista.get(counter).get(1)) {
                basiLista.get(counter).remove(1);
            } else {
                result.add(basiLista.get(counter).get(0));
                basiLista.get(counter).remove(0);
                if (counter < basiLista.size()-1) {
                    counter++;
                } else {
                    counter = 0;
                }
            }
        }
        System.out.println(result.size());
        for (Integer results : result) {
            System.out.print(results + " ");

        }
    }

}


