import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr02_sumMatrixElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] matrixDimension = reader.readLine().split(", ");
        int rows = Integer.valueOf(matrixDimension[0]);
        int columns = Integer.valueOf(matrixDimension[1]);
        int sum=0;
        Integer[][] numbers = new Integer[rows][columns];
        for (int i = 0; i <rows ; i++) {
            String[] number = reader.readLine().split(", ");
            for (int j = 0; j <columns ; j++) {
                numbers[i][j]=Integer.valueOf(number[j]);
                sum+=numbers[i][j];
            }
        }
        System.out.println(rows);
        System.out.println(columns);
        System.out.println(sum);
    }
}
