import java.math.BigInteger;

/**
 * Created by YSingh on 06/02/17.
 */
public class Problem20 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("100");
        BigInteger result = BigInteger.ONE;

        while (num.compareTo(BigInteger.ZERO) > 0) {
            result = result.multiply(num);
            num = num.subtract(BigInteger.ONE);
        }

        BigInteger sum = new BigInteger("0");
        while (result.compareTo(BigInteger.ZERO) > 0) {
            sum = sum.add(result.mod(new BigInteger("10")));
            result = result.divide(new BigInteger("10"));
        }

        System.out.println(sum);
    }
}
