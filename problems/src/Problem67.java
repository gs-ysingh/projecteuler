import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.*;

/**
 * Created by YSingh on 09/02/17.
 */
public class Problem67 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("problems/src/p067_triangle.txt");
        DataInputStream in = new DataInputStream(fis);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line = null;
        int T = 100;
        int row = 100;
        int col = 100;

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

        int [][] M = new int[row + 1][col + 1];

        for (int j = 1; j <= row ; j++) {
            for (int k = 1; k <= col ; k++) {
                M[j][k] = arr[j][k] + Math.max(M[j - 1][k - 1], M[j - 1][k]);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int j = 0; j <= col; j++) {
            max = Math.max(M[row][j], max);
        }

        System.out.println(max);


        br.close();
    }

}
