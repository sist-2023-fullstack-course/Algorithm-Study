package week7_230921;

import java.io.*;

public class BOJ_2737 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(in.readLine());
        int[] f=new int[46];
        f[1]=1;

        for(int i=2; i<=n; i++)
        {
            f[i]=f[i-1]+f[i-2];
        }

        out.write(String.valueOf(f[n]));
        out.flush();
        out.close();
    }
}
