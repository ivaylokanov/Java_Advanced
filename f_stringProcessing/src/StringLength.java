import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kanov on 2/1/2017.
 */
public class StringLength {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean check = false;
        while (!check){
            StringBuilder input = new StringBuilder(reader.readLine());
            if (input.length()>=20){
               String result =input.toString().substring(0,20);
                System.out.println(result);
                check=true;
                break;
            }
            for (int i = input.length(); i <20 ; i++) {

                input.append("*");

            }
            System.out.println(input);
            check=true;
            break;
        }
    }
}
