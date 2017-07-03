
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr07_collectTheCoins {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[][] matrix = new char[4][];
        int row = 0;
        int col = 0;
        int indexRow = 0;
        int indCol = 0;
        int coin = 0;
        int wall = 0;
        for (row = 0; row < 4; row++) {
            char[] inputLine = reader.readLine().toCharArray();
            matrix[row] = new char[inputLine.length];
            for (col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = inputLine[col];
            }
        }
        row = 0;
        col = 0;
        char[] commandLine = reader.readLine().toCharArray();
        for (int i = 0; i < commandLine.length; i++) {

            switch (commandLine[i]) {
                case 'V':
                    int s= matrix[row].length;
                    if ((row < 3)&&col<matrix[row+1].length) {
                        row++;
                        if (matrix[row][col] == '$') {
                            coin++;
                        }
                    } else {
                        wall++;
                    }
                    break;
                case '>':
                    if (col < matrix[row].length-1) {
                        col++;
                        if (matrix[row][col] == '$') {
                            coin++;
                        }
                    } else {
                        wall++;
                    }
                    break;
                case '<':
                    if (col > 0) {
                        col--;
                        if (matrix[row][col] == '$') {
                            coin++;
                        }
                    } else {
                        wall++;
                    }
                    break;
                case '^':
                    if (row > 0) {
                        row--;
                        if (matrix[row][col] == '$') {
                            coin++;
                        }
                    } else {
                        wall++;
                    }
                    break;
            }


        }
        System.out.printf("Coins = %d%n",coin);
        System.out.printf("Walls = %d%n",wall);

    }
}
