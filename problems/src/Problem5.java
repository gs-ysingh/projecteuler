/**
 * Created by YSingh on 29/01/17.
 */
public class Problem5 {
    public static void main(String[] args) {
        //brute force approach
        //System.out.println(getNumberOptimized());

        //optimized approach
        System.out.println(getNumberOptimized());
    }

    private static int getNumberOptimized() {
        int limit = 20;
        int a = 0;
        int b = 0;
        for (int i = 2; i < limit - 1; i++) {
            if(i == 2) {
                a = i;
                b = getLCM(a, i + 1);
            }
            else {
                b = getLCM(i + 1, b);
            }
        }
        return b;
    }

    private static int getLCM(int a, int b) {
        return (a*b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return gcd(b, a%b);
        }
    }

    private static int getNumber() {
        int limit = 20;
        int start = 1;
        int flag = 1;
        while (true) {
            flag = 1;
            //By observation only checking next half numbers is sufficient
            //11, 12, 13, 14, 15, 16, 17, 18, 19, 20
            for (int i = limit / 2; i <= limit; i++) {
                if(start % i != 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) {
                break;
            }
            else {
                start++;
            }
        }
        return start;
    }
}
