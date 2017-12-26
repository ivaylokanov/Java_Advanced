import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> n = new ArrayList();
        int m = Integer.valueOf(reader.readLine());
        for (int i = 0; i < m; i++) {
            n.add(reader.readLine());

        }
        for (int i = 0; i < n.size(); i++) {
            System.out.printf("%s ",n.get(i));

        }



    }
}
