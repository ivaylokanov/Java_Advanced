import java.util.Scanner;

/**
 * Created by kanov on 1/18/2017.
 */
public class BlurFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int blurFilter = Integer.parseInt(scanner.nextLine());
        String[] dim = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dim[0]);
        int cols = Integer.parseInt(dim[1]);
        long[][] pixels = new long[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] inputData = scanner.nextLine().split(" ");

            for (int col = 0; col < cols; col++) {
                pixels[row][col] = Long.parseLong(inputData[col]);
            }
        }
        String[] coordinates = scanner.nextLine().split(" ");
        int targetRow = Integer.parseInt(coordinates[0]);
        int targetCol = Integer.parseInt(coordinates[1]);

        int left = Math.max(0, targetCol - 1);
        int right = Math.min(targetCol + 1, cols);
        int top = Math.max(targetRow - 1, 0);
        int bottom = Math.min(targetRow + 1, rows);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (left <= col && col <= right && (top <= row && row <= bottom)) {
                    System.out.printf("%d ",pixels[row][col]+blurFilter);
                }else {
                    System.out.printf("%d ",pixels[row][col]);
                }
            }
            System.out.println();
        }
    }
}
