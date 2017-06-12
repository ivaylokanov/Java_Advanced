import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr01_fillTheMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(", ");
        int dimension = Integer.valueOf(input[0]);
        String pattern = input[1];

        Integer[][] matrix = new Integer[dimension][dimension];
        matrix[0][0] = 1;
        switch (pattern) {
            case "A":
                for (int i = 0; i < dimension; i++) {
                    int index = i + 1;
                    for (int j = 0; j < dimension; j++) {
                        matrix[i][j] = index;
                        index = index + dimension;
                    }
                }
                break;
            case "B":
                int numbers = 1;

                for (int col = 0; col < matrix.length; col++) {
                    for (int row = 0; row < matrix[col].length; row++) {
                        if (col % 2 == 0) {
                            matrix[row][col] = numbers;
                        } else {
                            matrix[dimension - row - 1][col] = numbers;
                        }
                        numbers++;
                    }
                }
                break;
        }
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
