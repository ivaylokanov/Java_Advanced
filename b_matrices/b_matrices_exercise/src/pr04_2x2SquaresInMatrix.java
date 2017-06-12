import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr04_2x2SquaresInMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArgs = reader.readLine().split(" ");
        int rows = Integer.valueOf(inputArgs[0]);
        int cols = Integer.valueOf(inputArgs[1]);
        int counter = 0;
        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] matrixArgs = reader.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = matrixArgs[j];
            }
        }
        for (int i = 0; i <rows-1 ; i++) {
            for (int j = 0; j <cols-1 ; j++) {
                if (matrix[i][j].equals(matrix[i+1][j])&&matrix[i][j].equals(matrix[i][j+1])&&matrix[i][j].equals(matrix[i+1][j+1])){
                    counter+=1;
                }
            }
        }
        System.out.println(counter);
    }
}
