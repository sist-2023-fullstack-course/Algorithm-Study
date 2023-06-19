import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static void solve() throws IOException{
        st = new StringTokenizer(in.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for(int i=0;i<m;i++){
            st = new StringTokenizer(in.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            for(int j=a-1;j<b;j++)
                arr[j]=c;
        }

        for(int i=0;i<n;i++)
            out.write(String.valueOf(arr[i] + " "));
    }

    public static void main(String[] args) throws IOException{
        solve();
        out.flush();
    }
}