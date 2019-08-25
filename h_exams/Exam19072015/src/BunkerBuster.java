import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.DoubleSummaryStatistics;

/**
 * Created by kanov on 2/16/2017.
 */
public class BunkerBuster {
    public static Integer[][] matrix;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sizeOfMatrix = reader.readLine().split(" ");
        matrix = new Integer[Integer.valueOf(sizeOfMatrix[0])][Integer.valueOf(sizeOfMatrix[1])];
        String bombInput = "";
        int counter = 0;
        //fill matrix
        for (int i = 0; i < matrix.length; i++) {
            String[] input = reader.readLine().split(" ");
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Integer.valueOf(input[j]);
            }
        }
        while (!"cease fire!".equals(bombInput = reader.readLine())) {
            String[] bomb = bombInput.split(" ");
            //bomb damage
            Integer bombRow = Integer.valueOf(bomb[0]);
            Integer bombCol = Integer.valueOf(bomb[1]);
            int bombPower = bomb[2].codePointAt(0);

            cellDemage(bombRow, bombCol, bombPower);
            cellDemage(bombRow - 1, bombCol, (int) Math.ceil(bombPower / 2.0));
            cellDemage(bombRow +1, bombCol, (int) Math.ceil(bombPower / 2.0));
            cellDemage(bombRow , bombCol-1, (int) Math.ceil(bombPower / 2.0));
            cellDemage(bombRow , bombCol+1, (int) Math.ceil(bombPower / 2.0));
            cellDemage(bombRow +1, bombCol+1, (int) Math.ceil(bombPower / 2.0));
            cellDemage(bombRow -1, bombCol-1, (int) Math.ceil(bombPower / 2.0));
            cellDemage(bombRow -1, bombCol+1, (int) Math.ceil(bombPower / 2.0));
            cellDemage(bombRow +1, bombCol-1, (int) Math.ceil(bombPower / 2.0));


        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] <= 0) {
                    counter++;
                }

            }


        }
        System.out.printf("Destroyed bunkers: %s%n", counter);
        System.out.println(String.format("Damage done: %.1f", counter / (Double.valueOf(sizeOfMatrix[0]) * Integer.valueOf(sizeOfMatrix[1])) * 100) + " %");
    }

    private static void cellDemage(Integer bombRow, Integer bombCol, Integer bombPower) {
        try {
            matrix[bombRow][bombCol] = matrix[bombRow][bombCol] - bombPower;
        } catch (IndexOutOfBoundsException ex) {

        }
    }
}

