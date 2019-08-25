import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr03_maximumSumOf2x2Submatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] matrixDimension = reader.readLine().split(", ");
        int rows = Integer.valueOf(matrixDimension[0]);
        int columns = Integer.valueOf(matrixDimension[1]);
        int maxSum = 0;
        int currentSum=0;
        int startRow=0;
        int startCol=0;
        Integer[][] numbers = new Integer[rows][columns];
        for (int i = 0; i < rows; i++) {
            String[] number = reader.readLine().split(", ");
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = Integer.valueOf(number[j]);
            }
        }
        for (int i = 0; i <rows-1 ; i++) {
            for (int j = 0; j <columns-1 ; j++) {
                currentSum=numbers[i][j]+numbers[i+1][j]+numbers[i][j+1]+numbers[i+1][j+1];
                if (currentSum>maxSum){
                    maxSum=currentSum;
                    startRow=i;
                    startCol=j;
                }
            }
        }
        System.out.println(numbers[startRow][startCol]+" "+numbers[startRow][startCol+1]);
        System.out.println(numbers[startRow+1][startCol]+" "+numbers[startRow+1][startCol+1]);

        System.out.println(maxSum);
    }
}
