import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YSingh on 27/01/17.
 */

 // Learning: Handling the big integers and finding the prime numbers

public class Problem3 {
    //How to find the prime factors of given numbers
    public static void main(String[] args) {
        BigInteger number = new BigInteger("600851475143");
        //BigInteger number = new BigInteger("13195");
        BigInteger two = BigInteger.ONE.add(BigInteger.ONE);
        BigInteger three = two.add(BigInteger.ONE);

        while (number.mod(two).compareTo(BigInteger.ZERO) == 0) {
            number = number.divide(two);
        }

        BigInteger i = three;
        for (i = three; i.compareTo(sqrt(number)) <= 0; i = i.add(two)) {
            //System.out.println(i);
            if(number.mod(i).compareTo(BigInteger.ZERO) == 0) {
               number = number.divide(i);
            }
        }
        if(number.compareTo(two) > 0) {
            System.out.println(number);
        }

    }

    public static BigInteger sqrt(BigInteger x) {
        BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
        BigInteger div2 = div;
        // Loop until we hit the same value twice in a row, or wind
        // up alternating.
        for(;;) {
            BigInteger y = div.add(x.divide(div)).shiftRight(1);
            if (y.equals(div) || y.equals(div2))
                return y;
            div2 = div;
            div = y;
        }
    }

    //Raw code on big Integer
    private static void handleBigInteger() {
        BigInteger number = new BigInteger("600851475143");
        List<BigInteger> arr = new ArrayList<BigInteger>();

        BigInteger x;
        BigInteger y;
        for (BigInteger i = BigInteger.ONE; i.compareTo(number) < 0; i = i.add(BigInteger.ONE)) {
            arr.add(i);
        }
    }

}
