import java.io.*;

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());

        int ans = 2;
        for(int i=0;i<n;i++){
            ans = ans * 2 - 1;
        }
        out.write(String.valueOf(ans*ans));
        out.flush();
    }
}