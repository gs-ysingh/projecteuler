/**
 * Created by YSingh on 29/01/17.
 */
public class Problem4 {
    public static void main(String[] args) {
        int maxValue = 999;
        int minValue = 99;
        int result = 0;
        for (int i = maxValue; i > minValue ; i--) {
            for (int j = maxValue; j > minValue ; j--) {
                if (isPalindrome(i * j)) {
                    result = Math.max(i * j, result);
                }
            }
        }
        System.out.println(result);
    }

    private static boolean isPalindrome(int maxValue) {
        int originalValue = maxValue;
        int reverse = reverseValue(maxValue);

        if(originalValue == reverse) {
            return true;
        }

        return false;
    }

    private static int reverseValue(int value) {
        int mod = 0;
        int result = 0;
        while (value > 0) {
            mod = value % 10;
            result = mod + result*10;
            value = value / 10;
        }

        return result;
    }
}
