/**
 * Created by YSingh on 26/01/17.
 */
public class Problem2 {
    // Recurrence for Even Fibonacci sequence is:
    // EFn = 4EFn-1 + EFn-2
    // with seed values
    // EF0 = 0 and EF1 = 2.
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
    // Since every 3rd fibonacci number is even we can make a recurrence:
    // Fn = Fn-1 + Fn-2 = 4Fn-3 + Fn-6 where Fn-3 is previous and Fn-6 is before that

    public static void main(String[] args) {
        int maxValue = 4000000;
        int a = 0;
        int b = 2;
        int c;
        int sum = 0;
        sum += b;
        while (true) {
            c = 4*b + a;
            if(c > maxValue) {
                break;
            }
            if(c % 2 == 0) {
                sum += c;
            }
            a = b;
            b = c;
        }
        System.out.print(sum);
    }
}
