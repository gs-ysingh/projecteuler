import java.io.*;
import java.util.ArrayList;

/**
 * Created by YSingh on 08/02/17.
 */
public class Problem18 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("problems/src/Problem18");
        DataInputStream in = new DataInputStream(fis);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line = null;
        int T = 15;
        int row = 15;
        int col = 15;

        int [][] arr = new int[row + 1][col + 1];
        String[] str;

        int i = 0;
        while (T > 0) {
            i++;
            T--;
            line = br.readLine();
            str = line.split(" ");
            for (int j = 0; j < str.length; j++) {
                arr[i][j + 1] = Integer.parseInt(str[j]);
            }
        }
        int sum = 0;
        System.out.println(getMaxSum(arr, 1, 1, row, col, sum));
        br.close();
    }

    private static int getMaxSum(int[][] arr, int i, int j, int row, int col, int sum) {
        if(i > row) {
            return sum;
        }

        int left = getMaxSum(arr, i + 1, j, row, col, sum + arr[i][j]);
        int right = getMaxSum(arr, i + 1, j + 1, row, col, sum + arr[i][j]);

        return Math.max(left, right);
    }
}
