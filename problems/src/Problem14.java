import java.sql.Array;
import java.util.Arrays;

/**
 * Created by YSingh on 03/02/17.
 */
public class Problem14 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        int n = 1000000;
        int [] arr = new int[n + 1];
        Arrays.fill(arr, 0);
        arr[1] = 1;
        int count = 1;
        for (int i = 2; i <= n ; i++) {
            arr[i] = getLongestCollatzSequence(arr, i);
            //System.out.println(i + ", " + arr[i]);
        }

        long max = Integer.MIN_VALUE;
        int value = 0;
        for (int i = 1; i <= n; i++) {
            if(arr[i] > max) {
                value = i;
                max = arr[i];
            }
        }

        System.out.println(value + ": " + max);
        long end = System.currentTimeMillis();
        System.out.println(end-begin + "ms");
    }
    //5, 16, 8, 4, 2, 1
    //6, 3,
    //3, 10, 5, 16, 8, 4, 2, 1
    //7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1
    //13, 40, 20, 10, 5, 16, 8, 4, 2, 1
    //9, 28, 14, 7,
    private static int getLongestCollatzSequence(int [] arr, int x) {
        int count = 0;
        long n = x;
        try {
            while (n >= 1) {
                if(n < arr.length && arr[(int) n] >= 1) {
                    count += arr[(int) n];
                    break;
                }
                if(n % 2 == 0) {
                    n = (n / 2);
                }
                else {
                    n = (3 * n) + 1;
                }
                count++;
            }
        }
        catch (Exception e) {
            System.out.println(n);
        }

        return count;
    }

}
