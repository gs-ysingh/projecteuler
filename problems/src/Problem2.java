/**
 * Created by YSingh on 26/01/17.
 */
public class Problem2 {
    public static void main(String[] args) {
        int maxValue = 4000000;
        int a = 1;
        int b = 2;
        int c;
        int sum = 0;
        sum += b;
        while (true) {
            c = a + b;
            if(c > maxValue) {
                break;
            }
            if(c % 2 == 0) {
                System.out.println(c);
                sum += c;
            }
            a = b;
            b = c;
        }
        System.out.print(sum);
    }
}
