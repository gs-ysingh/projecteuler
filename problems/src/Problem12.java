import java.util.ArrayList;

/**
 * Created by YSingh on 03/02/17.
 */
public class Problem12 {
    public static void main(String[] args) {
        int n = 1;
        int x;
        int k;
        while (true) {
            x = getNthTriangleNumber(n);
            k = getDivisors(x);
            if(k >= 500) {
                break;
            }
            n++;
        }

        System.out.println(x);
    }

    private static int getDivisors(int y) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= Math.sqrt(y); i++) {
            if(y % i == 0) {
                if(y / i == i) {
                    list.add(i);
                }
                else {
                    list.add(i);
                    list.add(y / i);
                }
            }
        }
        return list.size();
    }

    private static int getNthTriangleNumber(int n) {
        return (n * (n + 1)) / 2;
    }
}
