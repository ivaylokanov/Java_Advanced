import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by kanov on 2/26/2017.
 */
public class HornetAssault {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputBees = reader.readLine().split("\\s+");
        List<Integer> bees = Arrays.stream(inputBees).map(Integer::valueOf).collect(Collectors.toList());
        String[] inputHornets = reader.readLine().split("\\s+");
        List<Integer> hornets = Arrays.stream(inputHornets).map(Integer::valueOf).collect(Collectors.toList());
        int sumHornets = 0;
        int sumBees = 0;
int size = bees.size();
        for (int i = 0; i < bees.size(); i++) {
            sumHornets = 0;
            if (hornets.isEmpty()){
                System.out.println(bees);
                break;
            }

            for (int j = 0; j < hornets.size(); j++) {
                sumHornets = hornets.get(j) + sumHornets;
            }
            if (bees.get(i) > sumHornets) {
                if (bees.size()==1){

                    bees.add(i,bees.get(i)-sumHornets);
                    bees.remove(i+1);
                    hornets.removeAll(hornets);

                }else {

                    hornets.remove(0);
                    bees.add(i,bees.get(i)-sumHornets);
                    bees.remove(i+1);
                }
            } else if (bees.get(i) < sumHornets) {
                bees.remove(i);
                i=i-1;
            } else if (bees.get(i) == sumHornets) {
                bees.remove(i);
                hornets.remove(i);
                i=i-1;
            }


        }

        System.out.println(bees);
        System.out.println(hornets);
    }

}




