import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kanov on 2/11/2017.
 */
public class JedyGalaxy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] matrixDimension = reader.readLine().split(" ");
        Long inputRow = Long.valueOf(matrixDimension[0]);
        Long inputCol = Long.valueOf(matrixDimension[1]);
        Long[][] matrix = new Long[Math.toIntExact(inputRow)][Math.toIntExact(inputCol)];
        long counter = 0L;
        String line = "";
        Long sum = 0L;
        Long ivoRow = 0L;
        Long ivoCol = 0L;
        Long evilRow = 0L;
        Long evilCol = 0L;
        long m = 0L;
        for (int i = 0; i < inputRow; i++) {
            for (int j = 0; j < inputCol; j++) {
                matrix[i][j] = counter;
                counter++;

            }
        }

        while (!"Let the Force be with you".equals(line = reader.readLine())) {
            String[] ivoStartPoint = line.split(" ");
            line = reader.readLine();
            String[] evilStartPoint = line.split(" ");
            ivoRow = Long.parseLong(ivoStartPoint[0]);
            ivoCol = Long.parseLong(ivoStartPoint[1]);
            evilRow = Long.parseLong(evilStartPoint[0]);
            evilCol = Long.parseLong(evilStartPoint[1]);
            while (evilRow != 0) {


            }
            System.out.println(sum);
        }
    }
}