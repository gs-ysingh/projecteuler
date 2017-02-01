import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by YSingh on 01/02/17.
 */
class Pythagorean {
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    int a;
    int b;
}
public class Problem9 {
    public static void main(String[] args) {
        int [] arr = new int[1001];
        Map<Integer, Pythagorean> map = new HashMap<Integer, Pythagorean>();

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i * i;
            //check in array if there exist such a, b, c having a^2 + b^2 = c^2
            //Add it the map
            setPythagorean(arr, i, map);
        }

    }
    
    private static void setPythagorean(int[] arr, int index, Map<Integer, Pythagorean> map) {
        //for arr[i] if there exist 2 values in array having sum arr[i]
        int sum = arr[index];
        for (int i = 1; i < index; i++) {
            if(find(sum - arr[i], 0, index - 1, arr)) {
                Pythagorean p = new Pythagorean();
                p.setA(arr[i]);
                p.setB(sum - arr[i]);
                map.put(sum, p);

                //This is the final condition
                if(Math.sqrt(sum) + Math.sqrt(sum - arr[i]) + Math.sqrt(arr[i]) == 1000) {
                    System.out.println((int)Math.sqrt(sum) * (int)Math.sqrt(sum - arr[i]) * (int)Math.sqrt(arr[i]));
                }
            }
        }
    }

    private static boolean find(int value, int low, int high, int[] arr) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == value) {
                return true;
            }
            else if(arr[mid] < value) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}
