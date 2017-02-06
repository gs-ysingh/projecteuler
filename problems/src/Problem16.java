import java.math.BigInteger;

/**
 * Created by YSingh on 06/02/17.
 */
public class Problem16 {
    public static void main(String[] args) {
        BigInteger two = new BigInteger("2");
        BigInteger result = BigInteger.ONE;
        int power = 1000;

        for (int i = 0; i < power; i++) {
            result = result.multiply(two);
        }

        BigInteger sum = new BigInteger("0");

        while (result.compareTo(BigInteger.ZERO) > 0) {
            sum = sum.add(result.mod(new BigInteger("10")));
            result = result.divide(new BigInteger("10"));
        }

        System.out.println(sum);
    }
}
