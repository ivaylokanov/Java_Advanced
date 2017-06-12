
import java.util.Scanner;

public class pr02_matrixOfPalindromes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Character.toString(alphabet[row]) + Character.toString(alphabet[row + counter]) + Character.toString(alphabet[row]);
                System.out.print(matrix[row][col] + " ");
                counter++;
            }
            System.out.println();
            counter = 0;
        }

    }
}

