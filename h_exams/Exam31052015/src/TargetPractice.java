import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by kanov on 2/18/2017.
 */
public class TargetPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] matrixSize = reader.readLine().split(" ");
        String[][] matrix = new String[Integer.valueOf(matrixSize[0])][Integer.valueOf(matrixSize[1])];
        String text = reader.readLine();
        String[] shot = reader.readLine().split(" ");
        int centerRow = Integer.valueOf(shot[0]);
        int centerCol = Integer.valueOf(shot[1]);
        int radius = Integer.valueOf(shot[2]);
        int counter = 0;
        boolean zigzag = true;
        for (int i = matrix.length - 1; i >= 0; i--) {
            if (zigzag == true) {
                for (int j = matrix[0].length - 1; j >= 0; j--) {
                    matrix[i][j] = String.valueOf(text.charAt(counter));
                    if (counter < text.length() - 1) {
                        counter++;
                    } else {
                        counter = 0;
                    }
                }
                zigzag = false;
            } else {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = String.valueOf(text.charAt(counter));
                    if (counter < text.length() - 1) {
                        counter++;
                    } else {
                        counter = 0;
                    }
                }
                zigzag = true;
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                double d = Math.sqrt((centerRow - row) * (centerRow - row) + (centerCol - col) * (centerCol - col));
                if (d <= radius) {
                    matrix[row][col] = " ";
                }
            }
        }
//        for (int i = 0; i < Integer.valueOf(matrixSize[0]); i++) {
//            for (int j = 0; j < Integer.valueOf(matrixSize[1]); j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        ArrayList<String> ordered = new ArrayList<>();
        for (int col = matrix[0].length-1; col >=0; col--) {
            for (int row = matrix.length-1; row >=0 ; row--) {


                if (!" ".equals(matrix[row][col])) {
                    ordered.add(matrix[row][col]);
                }
            }

            for (int row = matrix.length - 1; row >=0 ; row--) {
                if (matrix.length-1-row < ordered.size()) {
                    matrix[row][col] = ordered.get(matrix.length-1 - row);
                } else {
                    matrix[row][col] = " ";
                }
            }
            ordered.clear();
        }
       // Collections.reverse(ordered);



        for (int i = 0; i < Integer.valueOf(matrixSize[0]); i++) {
            for (int j = 0; j < Integer.valueOf(matrixSize[1]); j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
