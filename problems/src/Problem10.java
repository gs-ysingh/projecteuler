import java.util.Arrays;

/**
 * Created by YSingh on 01/02/17.
 */
public class Problem10 {
    public static void main(String[] args) {
        int n = 2000000;
        System.out.println(getNthPrime(n));
    }

    private static long getNthPrime(int n) {
        int maxValue = 2000000;
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

        long sum = 0;
        int res = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 1) {
                sum += i;
            }
        }
        return sum;
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
