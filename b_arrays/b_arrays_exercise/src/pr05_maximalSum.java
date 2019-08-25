import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr05_maximalSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArgs = reader.readLine().split(" ");
        int rows = Integer.valueOf(inputArgs[0]);
        int cols = Integer.valueOf(inputArgs[1]);
        int maxSum = 0;
        int startRow = 0;
        int startCol = 0;
        int currentSum = 0;
        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] matrixArgs = reader.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = matrixArgs[j];
            }
        }
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                currentSum = Integer.valueOf(matrix[i][j]) + Integer.valueOf(matrix[i][j + 1]) + Integer.valueOf(matrix[i][j + 2]) +
                        Integer.valueOf(matrix[i + 1][j]) + Integer.valueOf(matrix[i + 1][j + 1]) + Integer.valueOf(matrix[i + 1][j + 2]) +
                        Integer.valueOf(matrix[i + 2][j]) + Integer.valueOf(matrix[i + 2][j + 1]) + Integer.valueOf(matrix[i + 2][j + 2]);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                    startRow = i;
                    startCol = j;
                }
            }
        }
        System.out.printf("Sum = %d%n", maxSum);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d %d %d%n", Integer.valueOf(matrix[startRow][startCol]), Integer.valueOf(matrix[startRow][startCol + 1]),
                Integer.valueOf(matrix[startRow][startCol + 2])));
        sb.append(String.format("%d %d %d%n", Integer.valueOf(matrix[startRow + 1][startCol]), Integer.valueOf(matrix[startRow + 1][startCol + 1]),
                Integer.valueOf(matrix[startRow + 1][startCol + 2])));
        sb.append(String.format("%d %d %d%n", Integer.valueOf(matrix[startRow + 2][startCol]), Integer.valueOf(matrix[startRow + 2][startCol + 1]),
                Integer.valueOf(matrix[startRow + 2][startCol + 2])));
        System.out.println(sb);
    }

}

