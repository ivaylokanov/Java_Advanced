import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr06_sequenceInMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArgs = reader.readLine().split(" ");
        int rows = Integer.valueOf(inputArgs[0]);
        int cols = Integer.valueOf(inputArgs[1]);
        int maxCount = 0;
        int startRow = 0;
        int startCol = 0;
        int currentCount = 0;
        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] matrixArgs = reader.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = matrixArgs[j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               
            }
        }
    }
}
