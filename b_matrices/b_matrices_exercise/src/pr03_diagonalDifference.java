import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr03_diagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int dimension = Integer.valueOf(reader.readLine());
        Integer[][] matrix = new Integer[dimension][dimension];
        int sumPrimary = 0;
        int sumSecondary=0;
        for (int i = 0; i < dimension; i++) {
            String[] matrixArgs = reader.readLine().split(" ");
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = Integer.valueOf(matrixArgs[j]);
                if (i == j) {
                    sumPrimary = sumPrimary + matrix[i][j];
                }
                if (i+j+1==dimension){
                    sumSecondary=sumSecondary+matrix[i][j];
                }
            }
        }
        System.out.println(Math.abs(sumPrimary-sumSecondary));
    }
}
