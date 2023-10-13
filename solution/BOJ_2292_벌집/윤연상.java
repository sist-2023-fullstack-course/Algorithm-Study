import java.io.*;

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());

        int cnt = 0;
        int cur = 1;
        while(cur < n){
            cnt++;
            cur += cnt * 6;
        }
        out.write(String.valueOf(cnt + 1));
        out.flush();
    }
}