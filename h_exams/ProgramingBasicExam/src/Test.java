import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by kanov on 2/26/2017.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputBees = reader.readLine().split(" ");
        Integer[] bees = new Integer[inputBees.length];
        boolean check = false;
        for (int i = 0; i < bees.length; i++) {
            bees[i] = Integer.parseInt(inputBees[i]);
        }

        String[] inputHornets = reader.readLine().split(" ");
        List<Integer> hornets = Arrays.stream(inputHornets).map(Integer::valueOf).collect(Collectors.toList());
        int sumHornets = 0;

        try {
        for (int i = 0; i < bees.length; i++) {
            sumHornets = 0;

            for (int j = 0; j < hornets.size(); j++) {
                sumHornets = hornets.get(j) + sumHornets;
            }

            if (bees[i] > sumHornets) {

                if (i==bees.length-1){
                    hornets.removeAll(hornets);
                } else{
                    hornets.remove(0);
                }
                bees[i] = bees[i] - sumHornets;
            } else if (bees[i] < sumHornets) {

                bees[i] = 0;
            } else if (bees[i] == sumHornets) {
                hornets.remove(0);

                bees[i] = 0;
            }


        }
        }catch (Exception e){

        }

            for (int i = 0; i < bees.length; i++) {
                if (bees[i] != 0) {
                    System.out.print(bees[i] + " ");
                } else {
                    check = true;
                }

            }
            if (check = true) {
                for (Integer hornet : hornets) {

                    System.out.print(hornet + " ");
                }
            }

    }

}




