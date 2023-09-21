import java.io.*;

public class 피보나치수 {
    private static int[] memo = new int[46];

    static int solve1(int n) { // dp 풀이
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    static int solve2(int n) { // 재귀 풀이
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;

        return solve2(n - 1) + solve2(n - 2);
    }

    static int solve3(int n) { // 메모이제이션을 활용한 재귀 풀이
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;

        if (memo[n] == 0)
            memo[n] = solve3(n - 1) + solve3(n - 2);
        return memo[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());

        // int ans = solve1(n);
        // int ans = solve2(n);
        int ans = solve3(n);

        out.write(String.valueOf(ans));
        out.flush();
    }
}
