import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 하노이탑 수식 (2^n)-1
    static String getCount(int n){
        BigInteger ret = new BigInteger("1");
        for(int i=0;i<n;i++){
            ret = ret.multiply(new BigInteger("2"));
        }
        return ret.subtract(new BigInteger("1")).toString();
    }

    static void hanoi(int n, int start, int end, int temp) throws IOException {
        if (n == 1){
            bw.write(start + " " + end + "\n");
            return;
        }
        hanoi(n-1, start, temp, end);
        bw.write(start + " " + end + "\n");
        hanoi(n-1,temp, end, start);
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        bw.write(getCount(n)+"\n");
        if (n<=20)
            hanoi(n,1,3,2);

        bw.flush();
    }
}
