import java.util.Scanner;

/**
 * Created by kanov on 1/18/2017.
 */
public class FillMatricsB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int matrix[][] = new int[number][number];
        int i =0;
        for (int col = 0; col < number; col++) {

            for (int row = 0; row < number; row++) {
                matrix[row][col] = i+1;
                // System.out.print(matrix[col][row]+ " ");
                i++;
            }
            //System.out.println();
        }
        for (int col = 0; col < number; col++) {

            for (int row = 0; row < number; row++) {
                System.out.print(matrix[col][row]+ " ");
            }
            System.out.println();
        }
    }
}
