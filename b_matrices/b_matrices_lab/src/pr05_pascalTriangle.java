import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pr05_pascalTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long numberOfRows = Integer.parseInt(reader.readLine());
        List<Long> baseList = new ArrayList<Long>() {{
            add(1L);
            add(1L);
        }};
        List<Long> currentList = new ArrayList<>();
        if (numberOfRows==0) {

        }else if (numberOfRows==1){
            System.out.println(1);
        }else if (numberOfRows==2){
            System.out.println("1");
            System.out.println("1 1");
        } else {
            System.out.println("1");
            System.out.println("1 1");
            for (int i = 2; i < numberOfRows; i++) {
                currentList.add(1L);
                for (int j = 0; j < baseList.size() - 1; j++) {
                    long element = baseList.get(j) + baseList.get(j + 1);
                    currentList.add(element);
                }
                currentList.add(1L);

                for (Long a : currentList) {
                    System.out.printf("%d ", a);
                }
                baseList.clear();
                baseList.addAll(currentList);
                currentList.clear();
                System.out.println();
            }

        }

    }

}

