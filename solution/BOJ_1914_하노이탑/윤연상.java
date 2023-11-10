import java.io.*;
import java.math.BigInteger;

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    static String getCount(int n){
        BigInteger ret = new BigInteger("1");
        for(int i=0;i<n;i++){
            ret = ret.multiply(new BigInteger("2"));
        }
        return ret.subtract(new BigInteger("1")).toString();
    }

    static int getTmp(int n1, int n2){
        boolean[] used = new boolean[4];
        used[n1]=true;
        used[n2]=true;
        for(int i=1;i<=3;i++){
            if(!used[i])
                return i;
        }
        return 0;
    }

    static void move(int n, int s, int e) throws IOException{
        if(n == 0) return;

        move(n-1, s, getTmp(s, e));
        out.write(s + " " + e + "\n");
        move(n-1, getTmp(s, e), e);
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());
        out.write(getCount(n) + "\n");

        if(n <= 20){
            move(n, 1, 3);
        }

        out.flush();
    }
}