import java.util.Scanner;

/**
 * Created by kanov on 1/18/2017.
 */
public class SquaresMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rowCol = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(rowCol[0]);
        int cols = Integer.parseInt(rowCol[1]);
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split(" ");
            int i =0;
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = input[i];
                i++;
              //  System.out.print(matrix[row][col] +" ");
            }
            //System.out.println();
        }
        int counter = 0;
        for (int row = 0; row < rows-1; row++) {
            for (int col = 0; col < cols-1; col++) {
                if ((matrix[row][col].equals(matrix[row][col+1]))&&(matrix[row][col+1].equals(matrix[row+1][col]))&&(matrix[row+1][col].equals(matrix[row+1][col+1]))){
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}
