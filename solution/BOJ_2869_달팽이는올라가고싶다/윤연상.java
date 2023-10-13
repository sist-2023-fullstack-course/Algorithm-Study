import java.io.*;

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] inputs = in.readLine().split(" ");

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int v = Integer.parseInt(inputs[2]);

        int cnt = 1;
        v -= a;
        cnt += (int)Math.ceil((double)v / (a - b));

        out.write(String.valueOf(cnt));
        out.flush();
    }
}