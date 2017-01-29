import java.sql.Array;
import java.util.Arrays;

/**
 * Created by YSingh on 29/01/17.
 */
public class Problem7 {
    public static void main(String[] args) {
        int n = 10001;
        System.out.println(getNthPrime(n));
    }

    private static int getNthPrime(int n) {
        int maxValue = 120000;
        int [] arr = new int[maxValue + 1];
        Arrays.fill(arr, 1);
        arr[0] = 0;
        arr[1] = 0;
        int prime = 2;
        while (prime < maxValue) {
            for (int i = 2 * prime; i < maxValue; i = i + prime) {
                arr[i] = 0;
            }
            while (true) {
                prime++;
                if(arr[prime] == 1 && isPrime(prime) || (prime >= maxValue)) {
                    break;
                }
            }
        }

        int count = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count++;
            }
            if(count == n) {
                res = i;
                break;
            }
        }
        return res;
    }

    private static boolean isPrime(int num) {
        boolean res = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}
