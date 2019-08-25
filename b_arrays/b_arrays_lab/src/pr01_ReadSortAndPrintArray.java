import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pr01_ReadSortAndPrintArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> names = new ArrayList<>();
        int numberOfNames = Integer.valueOf(reader.readLine());
        while (0<numberOfNames --){
            String name = reader.readLine();
            names.add(name);
        }

        Collections.sort(names);
        for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));
        }
    }
}
