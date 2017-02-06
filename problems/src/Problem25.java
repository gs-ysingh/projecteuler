import java.math.BigInteger;

/**
 * Created by YSingh on 06/02/17.
 */
public class Problem25 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger c = BigInteger.ZERO;
        int f = 2;
        while (true) {
            c = a.add(b);
            f++;
            if(getDigits(c) == 1000) {
                break;
            }
            a = b;
            b = c;
        }

        System.out.println(f);
    }

    private static int getDigits(BigInteger c) {
        int digit = 0;

        while (c.compareTo(BigInteger.ZERO) > 0) {
            c = c.divide(new BigInteger("10"));
            digit++;
        }

        return digit;
    }
}
