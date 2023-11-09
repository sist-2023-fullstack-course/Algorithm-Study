import java.io.*;

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] dp = new int[21];

    static int solve(int n){
        if(n == 0) {
            return 0;
        } else if(n == 1){
            return 1;
        } else if(dp[n] > 0){
            return dp[n];
        }

        return dp[n] = solve(n-1) + solve(n-2);
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());
        out.write(String.valueOf(solve(n)));
        out.flush();
    }
}