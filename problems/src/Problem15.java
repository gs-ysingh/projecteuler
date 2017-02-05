/**
 * Created by YSingh on 05/02/17.
 */
public class Problem15 {
    public static void main(String[] args) {
        int row = 20;
        int col = 20;

        long [][] M = new long[row + 1][col + 1];

        for (int i = 0; i <= row; i++) {
            M[i][0] = 1;
        }
        for (int i = 0; i <= col ; i++) {
            M[0][i] = 1;
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                M[i][j] = M[i - 1][j] + M[i][j - 1];
            }
        }

        System.out.println(M[row][col]);

        //Solution that
        //        int startX = 0;
        //        int startY = 0;
        //
        //        int endX = 20;
        //        int endY = 20;
        //Now I need to find all the combinations of paths that can be achieved from start to end
        //System.out.println(getTotalPaths(startX, startY, endX, endY));
    }

    private static long getTotalPaths(int startX, int startY, int endX, int endY) {
        if(startX == endX && startY == endY) {
            return 1;
        }

        if(startX > endX) {
            return 0;
        }
        if(startY > endY) {
            return 0;
        }

        return getTotalPaths(startX + 1, startY, endX, endY) + getTotalPaths(startX, startY + 1, endX, endY);
    }
}
