import java.io.*;
import java.util.ArrayList;

/**
 * Created by YSingh on 08/02/17.
 */
public class Problem18 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("problems/src/Problem18");
        DataInputStream in = new DataInputStream(fis);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line = null;
        int T = 15;
        while (T > 0) {
            T--;
            line = br.readLine();
        }
        br.close();

    }
}
