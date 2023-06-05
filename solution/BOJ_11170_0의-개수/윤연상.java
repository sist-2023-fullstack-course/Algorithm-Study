import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static int getZeroCount(int n, int m) {
        int cnt = 0;
        for (int i = n; i <= m; i++) {
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '0')
                    cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(in.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            out.write(getZeroCount(n, m) + "\n");
        }

        out.flush();
    }
}
