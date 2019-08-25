import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kanov on 2/19/2017.
 */
public class Shockwave {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] matrixSize = reader.readLine().split(" ");
        Integer[][] matrix = new Integer[Integer.valueOf(matrixSize[0])][Integer.valueOf(matrixSize[1])];

        for (int row = 0; row < Integer.valueOf(matrixSize[0]); row++) {
            for (int col = 0; col < Integer.valueOf(matrixSize[1]); col++) {
                matrix[row][col] = 0;
            }
        }
        String input = "";
        while (!"Here We Go".equals(input = reader.readLine())){
            String[] coordinates = input.split(" ");
            int startRow = Integer.valueOf(coordinates[0]);
            int startCol = Integer.valueOf(coordinates[1]);
            int endRow = Integer.valueOf(coordinates[2]);
            int endCol = Integer.valueOf(coordinates[3]);

            for (int row = startRow; row <= endRow; row++) {
                for (int col = startCol; col <= endCol; col++) {
                    matrix[row][col] = matrix[row][col]+1;
                }
            }


        }

            for (int row = 0; row < Integer.valueOf(matrixSize[0]); row++) {
                for (int col = 0; col < Integer.valueOf(matrixSize[1]); col++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println();
            }
    }
}
